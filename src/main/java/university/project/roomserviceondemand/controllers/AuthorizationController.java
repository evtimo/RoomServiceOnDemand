package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.services.UserDetailService;
import university.project.roomserviceondemand.services.UserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class handles authorization operations <br>
 * Source: Sign-In, Sign-Up Use cases <br>
 * Link: https://tinyurl.com/yya5u28d
 *
 * @version 1.0
 */

@Controller
public class AuthorizationController {

    @Value("${error.message}")
    private String errorMessage;

    private final UserService userService;
    private final UserDetailsService userDetailsService;

    public AuthorizationController(UserService userService, @Qualifier("global") UserDetailsService userDetailsService) {
        this.userService = userService;
        this.userDetailsService = userDetailsService;
    }

    /**
     * Handle http-get method for authorization process <br>
     *
     * @return http response
     */
    @GetMapping("/signUp")
    public String signUpGet() {
        return "views/signup";
    }

    /**
     * Handle http-post method for authorization process <br>
     * Search for user's credentials and response with found user
     * if credentials are valid, empty user otherwise
     *
     * @return http-response
     */
    @PostMapping("/signInPost")
    public String signIn(User user) {
        if(user.getPassword() == "" || user.getEmail() == "") {
            return "At least one of the fields in the form is incorrect!";
        } else {
            if(userService.findByEmail(user.getEmail()) == null) {
                return "Account for the provided email was not found!";
            }
            else {
                return "Successfully logged in!";
            }
        }
    }

    /**
     * Handle http-post method for authorization process <br>
     * Create new user with Client role ({@link university.project.roomserviceondemand.models.Role})
     * and saves it ot hte database <br>
     *
     * @return http response
     */
    @PostMapping("/signUpPost")
    public String signUp(Model model, User user) {
        User byEmail = userService.findByEmail(user.getEmail());

        if (byEmail == null) {
            System.out.println(user.getPassword());
            if(user.getPassword().length() < 8) {
                String error = "Password length should be at least 8 symbols!";
                model.addAttribute("errorMessage", error);
                return "views/signup";
            }
            if(!user.getPassword().matches(".*\\d+.*")) {
                String error = "Password should contain at least one digit!";
                model.addAttribute("errorMessage", error);
                return "views/signup";
            }
            if(!user.getEmail().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")) {
                String error = "Email should be in correct format!";
                model.addAttribute("errorMessage", error);
                return "views/signup";
            }
            String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(user.getPhoneNumber());
            if(!matcher.matches()) {
                String error = "Phone number should be in correct international format, starting with '+' !";
                model.addAttribute("errorMessage", error);
                return "views/signup";
            }
            userService.addUser(user);
            System.out.println(user.getEmail());
            return "redirect:/login";
        } else {
            String error = "User with provided login already exists!";
            model.addAttribute("errorMessage", error);
            return "views/signup";
        }

    }

    @PostMapping("/postLogin")
    public String postLogin(HttpSession session) {
        User user = ((UserDetailService) userDetailsService).getUser();
        User userFull = userService.findByEmail(user.getEmail());
        session.setAttribute("user", userFull);
        return "redirect:/request";
    }

    @GetMapping("/login")
    public String getLoginPage(Authentication authentication) {
        if (authentication != null) {
            return "redirect:/request";
        }
        return "views/signin";
    }

    @GetMapping("/logout")
    public String logoutDo(HttpSession session, HttpServletRequest request) {
        SecurityContextHolder.clearContext();
        if (session != null) {
            session.invalidate();
        }
        for (Cookie cookie : request.getCookies()) {
            cookie.setMaxAge(0);
        }
        return "redirect:/login";
    }

    @PostMapping("/signInPostFailure")
    public String signInWithFailure(Model model, HttpSession session) {
        String error = "User not found!";
        model.addAttribute("errorMessage", error);
        return "views/signin";
    }
}

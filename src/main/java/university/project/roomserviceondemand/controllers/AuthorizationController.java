package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
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

/**
 * Class handles authorization operations <br>
 * Source: Sign-In, Sign-Up Use cases <br>
 * Link: https://tinyurl.com/yya5u28d
 *
 * @version 1.0
 */

@Controller
public class AuthorizationController {

    private final UserService userService;
    private final UserDetailsService userDetailsService;

    public AuthorizationController(UserService userService, @Qualifier("global") UserDetailsService userDetailsService) {
        this.userService = userService;
        this.userDetailsService = userDetailsService;
    }

//    /**
//     * Handle http-get method for authorization process <br>
//     * @return http-response
//     */
//    @GetMapping("/signIn")
//    public String signInGet(){
//        return "signin";
//    }
//

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
        return "";
    }

    /**
     * Handle http-post method for authorization process <br>
     * Create new user with Client role ({@link university.project.roomserviceondemand.models.Role})
     * and saves it ot hte database <br>
     *
     * @return http response
     */
    @PostMapping("/signUpPost")
    public String signUp(User user) {
        User byEmail = userService.findByEmail(user.getEmail());
        if (byEmail == null) {
            userService.addUser(user);
            System.out.println(user.getEmail());
            return "redirect:/login";
        } else {
            return "redirect:/signUp";
        }
    }

    @PostMapping("/postLogin")
    public String postLogin(HttpSession session) {
        session.setAttribute("user", ((UserDetailService) userDetailsService).getUser());
        System.out.println(((User) session.getAttribute("user")).getEmail());
        return "redirect:/home/requests";
    }


    @GetMapping("/login")
    public String getLoginPage(Authentication authentication) {
        if (authentication != null) {
            return "redirect:/home/requests";
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

}

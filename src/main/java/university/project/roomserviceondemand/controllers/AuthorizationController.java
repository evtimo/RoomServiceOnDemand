package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.services.UserService;

/**
 * Class handles authorization operations <br>
 * Source: Sign-In, Sign-Up Use cases <br>
 * Link: https://tinyurl.com/yya5u28d
 * @version 1.0
 */

@Controller
public class AuthorizationController {

    private final UserService userService;

    public AuthorizationController(UserService userService) {
        this.userService = userService;
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
     * @return http response
     */
    @GetMapping("/signUp")
    public String signUpGet(){
        return "views/signup";
    }

    /**
     * Handle http-post method for authorization process <br>
     * Search for user's credentials and response with found user
     * if credentials are valid, empty user otherwise
     * @return http-response
     */
    @PostMapping("/signInPost")
    public String signIn(User user){
        return "";
    }

    /**
     * Handle http-post method for authorization process <br>
     * Create new user with Client role ({@link university.project.roomserviceondemand.models.Role})
     * and saves it ot hte database <br>
     * @return http response
     */
    @PostMapping("/signUpPost")
    public String signUp(User user){
        User byEmail = userService.findByEmail(user.getEmail());
        if(byEmail == null){
            userService.addUser(user);
            System.out.println(user.getEmail());
            return "redirect:/login";
        }else{
            return "redirect:/signUp";
        }
    }

    @PostMapping("/postLogin")
    public String postLogin(){
        return "redirect:/home/requests";
    }

}

package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import university.project.roomserviceondemand.models.User;

/**
 * Class handles authorization operations <br>
 * Source: Sign-In, Sign-Up Use cases <br>
 * Link: https://tinyurl.com/yya5u28d
 * @version 1.0
 */
@RestController
public class AuthorizationController {

    User user;


    /**
     * Handle http-post method for authorization process <br>
     * Search for user's credentials and response with found user
     * if credentials are valid, empty user otherwise
     * @return http-response
     */
    @PostMapping
    public String signIn(){
        return "";
    }

    /**
     * Handle http-post method for authorization process <br>
     * Create new user with Client role ({@link university.project.roomserviceondemand.models.Role})
     * and saves it ot hte database <br>
     * @return http response
     */
    @PostMapping
    public String signUp(){
        return "";
    }

}

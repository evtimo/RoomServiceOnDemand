package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import university.project.roomserviceondemand.models.User;

@RestController
public class AuthorizationController {

    User user;

    @PostMapping
    public String signIn(){
        return "";
    }

    @PostMapping
    public String signUp(){
        return "";
    }

}

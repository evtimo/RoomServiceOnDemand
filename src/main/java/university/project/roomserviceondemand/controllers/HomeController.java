package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 21.10.2019
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/requests")
    public String home(){
        return "requests";
    }

}

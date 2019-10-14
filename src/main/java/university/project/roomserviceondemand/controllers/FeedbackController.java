package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import university.project.roomserviceondemand.models.Feedback;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.models.User;

public class FeedbackController {

    Request request;
    Feedback feedback;

    @PostMapping
    public String post(){
        return "";
    }

    @GetMapping
    public String get(){
        return "";
    }


}

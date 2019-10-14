package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.web.bind.annotation.*;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.utils.MailSender;

public class RequestController {

    User user;
    Request request;
    MailSender mailSender;

    @PostMapping
    public String create(){
        return "";
    }

    @GetMapping
    public String get(){
        return "";
    }

    @PutMapping
    public String update(){
        return "";
    }





}

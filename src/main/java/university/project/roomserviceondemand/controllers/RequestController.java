package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.web.bind.annotation.*;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.utils.MailSender;

/**
 * Class handles request operations <br>
 * Source: Request for cleaning creation,
 * Request status change use cases <br>
 * Link: https://tinyurl.com/y6g3hd59
 * @version 1.0
 */
public class RequestController {

    User user;
    Request request;
    MailSender mailSender;

    /**
     * Handles http-post method for request ({@link Request}) creation <br>
     * Creates request with specific values and saves it to the database <br>
     * @return http-response
     */
    @PostMapping
    public String create(){
        return "";
    }

    /**
     * Handles http-get method for request fetching <br>
     * Retrieves the request with specific id from the database,
     * if request id is not specified, return all requests from the database <br>
     * @return http-response
     */
    @GetMapping
    public String get(){
        return "";
    }

    /**
     * Handles http-put method for existing request update <br>
     * Updates the existing request values provided within http-request
     * and save it to the database
     * @return
     */
    @PutMapping
    public String update(){
        return "";
    }





}

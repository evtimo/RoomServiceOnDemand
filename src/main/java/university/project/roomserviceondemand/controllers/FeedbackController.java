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

/**
 * Class handles feedback operations <br>
 * Source: Feedback on the cleaning filling <br>
 * Link: https://tinyurl.com/y5geyal2
 * @version 1.0
 */
public class FeedbackController {

    Request request;
    Feedback feedback;


    /**
     * Handles http-post method for feedback creation <br>
     * Creates new feedback for specific request and
     * saves it to the database <br>
     * @return http-response
     */
    @PostMapping
    public String post(){
        return "";
    }

    /**
     * Handles http-get method for feedback fetching <br>
     * Retrieves all feedbacks from the database
     * @return http-response
     */
    @GetMapping
    public String get(){
        return "";
    }


}

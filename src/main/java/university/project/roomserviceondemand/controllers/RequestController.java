package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import university.project.roomserviceondemand.models.Feedback;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.models.Status;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.services.RequestService;
import university.project.roomserviceondemand.services.UserService;
import university.project.roomserviceondemand.utils.MailSender;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Class handles request operations <br>
 * Source: Request for cleaning creation,
 * Request status change use cases <br>
 * Link: https://tinyurl.com/y6g3hd59
 * @version 1.0
 */
@Controller
@RequestMapping("/request")
public class RequestController {
    private final RequestService requestService;
    private final UserService userService;

    User user;
    Request request;
    Feedback feedback;
    MailSender mailSender;

    public RequestController(RequestService requestService, UserService userService) {
        this.requestService = requestService;
        this.userService = userService;
    }


    /**
     * Handles http-get method for request fetching <br>
     * Retrieves the list of all user requests from the database<br>
     * @return http-response
     */
    @GetMapping
    public String index(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");

        List<Request> requestList = requestService.getAllByUserId(user.getId());

        model.addAttribute("currentUser", user);
        model.addAttribute("requestList", requestList);

        return "views/requests";
    }

    /**
     * Handles http-post method for request ({@link Request}) creation <br>
     * Creates request with specific values and saves it to the database <br>
     * @return http-response
     */
    @PostMapping
    public String create(HttpSession session, @RequestParam("room") int room, @RequestParam("datetime") Date datetime){

        User user = (User) session.getAttribute("user");

        Request request = new Request();
        request.setRoom(room);
        request.setDate(datetime);
        request.setStatus(Status.NEW);
        request.setUser(user);

        requestService.save(request);

        return "redirect:/requests";
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

    /**
     * Handles http-post method for feedback creation <br>
     * Creates new feedback for specific request and
     * saves it to the database <br>
     * @return http-response
     */
    @PostMapping("/feedback")
    public String postFeedback(){
        return "";
    }
}

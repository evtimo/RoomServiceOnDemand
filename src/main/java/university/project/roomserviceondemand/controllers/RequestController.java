package university.project.roomserviceondemand.controllers;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

import org.aspectj.asm.IModelFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import university.project.roomserviceondemand.models.*;
import university.project.roomserviceondemand.services.FeedbackService;
import university.project.roomserviceondemand.services.*;
import university.project.roomserviceondemand.services.UserService;
import university.project.roomserviceondemand.utils.MailSender;

import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
    private final FeedbackService feedbackService;
    private final GMailSender gMailSender;

    @Value("${error.message}")
    private String errorMessage;

    User user;
    Request request;
    Feedback feedback;
    MailSender mailSender;

    public RequestController(RequestService requestService, UserService userService, FeedbackService feedbackService, GMailSender gMailSender) {
        this.requestService = requestService;
        this.userService = userService;
        this.feedbackService = feedbackService;
        this.gMailSender = gMailSender;
    }


    /**
     * Handles http-get method for request fetching <br>
     * Retrieves the list of all user requests from the database<br>
     * @return http-response
     */
    @GetMapping
    public String index(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");

        List<Request> requestList;
        if (user.getRole() == Role.ADMIN) {
            requestList = requestService.findAll();
        } else {
            requestList = requestService.getAllByUserId(user.getId());
        }

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
    public String create(Model model, HttpSession session, @RequestParam("room") int room, @RequestParam("datetime") Date datetime){

//        String error = "First Name & Last Name is required!";
//        model.addAttribute("errorMessage", error);
//        return "addPerson";

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(datetime);

        if (calendar.get(Calendar.HOUR_OF_DAY) < 10 || calendar.get(Calendar.HOUR_OF_DAY) > 18) {
            User user = (User) session.getAttribute("user");

            List<Request> requestList;
            if (user.getRole() == Role.ADMIN) {
                requestList = requestService.findAll();
            } else {
                requestList = requestService.getAllByUserId(user.getId());
            }

            model.addAttribute("currentUser", user);
            model.addAttribute("requestList", requestList);

            return "views/requestsError";
        }
        else {
            User user = (User) session.getAttribute("user");

            Request request = new Request();
            request.setRoom(room);
            request.setDate(datetime);
            request.setStatus(Status.NEW);
            request.setUser(user);

            requestService.save(request);

            String message = "You have a new cleaning request from " + user.getName() + " in the room " + room;
            gMailSender.send("roomserviceondemand@gmail.com", "roomserviceondemand@gmail.com", message, "New Cleaning Request: [Room: " + room +"]");

            List<Request> requestList;
            if (user.getRole() == Role.ADMIN) {
                requestList = requestService.findAll();
            } else {
                requestList = requestService.getAllByUserId(user.getId());
            }

            model.addAttribute("currentUser", user);
            model.addAttribute("requestList", requestList);

            return "redirect:/requests";
        }
    }

//    @PostMapping("/requestError")
//    public String requestError(Feedback feedback){
//        return "views/requestsError";
//    }

    /**
     * Handles http-put method for existing request update <br>
     * Updates the existing request values provided within http-request
     * and save it to the database
     * @return
     */
    @PostMapping("/update")
    public String update(Request request, @RequestParam("comment") String comment){
        Request updatedRequest = requestService.getByRequestId(request.getId());
        String previousStatus = updatedRequest.getStatus().getDescription();
        updatedRequest.setStatus(request.getStatus());

        requestService.save(updatedRequest);

        String message = "Status of your request created for the date [" + updatedRequest.getDate() + "] was changed from [" + previousStatus + "] to ["+ updatedRequest.getStatus().getDescription() +"]. With comment: " + comment;
        gMailSender.send("roomserviceondemand@gmail.com", updatedRequest.getUser().getEmail(), message, "Cleaning request status update");

        return "redirect:/requests";
    }

    /**
     * Handles http-post method for feedback creation <br>
     * Creates new feedback for specific request and
     * saves it to the database <br>
     * @return http-response
     */
    @PostMapping("/feedback")
    public String postFeedback(Feedback feedback){
        feedbackService.save(feedback);
        String message = "You have a new feedback for room "+ feedback.getRequest().getRoom() + " : " + feedback.getMessage();
        gMailSender.send("roomserviceondemand@gmail.com", "roomserviceondemand@gmail.com", message, "New feedback [Room: " + feedback.getRequest().getRoom() + "]");
        return "redirect:/requests";
    }
}

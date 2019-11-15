package university.project.roomserviceondemand.controllers.test;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import university.project.roomserviceondemand.application.RoomserviceondemandApplication;
import university.project.roomserviceondemand.controllers.RequestController;
import university.project.roomserviceondemand.models.Feedback;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.models.Status;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.repository.FeedbackRepository;
import university.project.roomserviceondemand.services.FeedbackService;
import university.project.roomserviceondemand.services.RequestService;
import university.project.roomserviceondemand.services.UserService;

import javax.validation.constraints.AssertTrue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {RoomserviceondemandApplication.class})
@RunWith(value = Parameterized.class)
public class FeedbackCreationTest {

    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Autowired
    private RequestController requestController;

    @Autowired
    private RequestService requestService;

    @Autowired
    private UserService userService;

    @Autowired
    FeedbackService feedbackService;

    @Autowired
    FeedbackRepository feedbackRepository;

    @Parameterized.Parameter(0)
    public static User user;
    @Parameterized.Parameter(1)
    public int grade;
    @Parameterized.Parameter(2)
    public String message;

    @Parameterized.Parameters(name = "{index}: Test with user={0}, grade={1}, message={2} ")
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{user, 1, "Message1"},
                {user, 2, "Message2"},
                {user, 3,"Message3"}};
        return Arrays.asList(data);
    }

    @Before
    public void setUp() {
        feedbackRepository.deleteAll();
        requestService.deleteAllReqs();
        userService.deleteAllUsers();
        user = new User();
        user.setName("UserForReqs");
        user.setPassword("reqspass");
        user.setEmail("useremail@mail.ru");
        userService.addUser(user);
        Request request = new Request();
        request.setUser(user);
        request.setDate(new Date(1572951600000L));
        request.setRoom(311);
        request.setStatus(Status.NEW);
        requestService.save(request);
    }

    @Test
    public void Should_BeSavedInBd_WhenCreated() {
        Feedback feedback = new Feedback();
        feedback.setGrade(grade);
        feedback.setMessage(message);
        feedbackService.save(feedback);
        assertEquals(1, feedbackRepository.findAll().size());
    }
}
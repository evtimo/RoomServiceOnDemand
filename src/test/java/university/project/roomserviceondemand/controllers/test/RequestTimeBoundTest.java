package university.project.roomserviceondemand.controllers.test;


import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.ui.Model;
import university.project.roomserviceondemand.application.RoomserviceondemandApplication;
import university.project.roomserviceondemand.controllers.RequestController;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.models.Status;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.repository.RequestRepository;
import university.project.roomserviceondemand.repository.UserRepository;
import university.project.roomserviceondemand.services.RequestService;
import university.project.roomserviceondemand.services.UserService;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {RoomserviceondemandApplication.class})
@RunWith(Parameterized.class)
public class RequestTimeBoundTest {

    @Mock
    private Model model;

    private static User user;

    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Autowired
    private RequestService requestService;

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RequestController requestController;
    @Autowired
    private RequestRepository requestRepository;

//    @Parameterized.Parameter(0)
//    public static User user;
    @Parameterized.Parameter(0)
    public int room;
    @Parameterized.Parameter(1)
    public Date date;
    @Parameterized.Parameter(2)
    public Status status;

    @Parameterized.Parameters(name = "{index}: Test with room={0}, date={1}, status={2} ")
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{ 311, new Date(1572930600000L),  Status.NEW},
                {312, new Date(1572984000000L), Status.NEW},
                {313, new Date(1572912000000L), Status.NEW}};
        return Arrays.asList(data);
    }

    @Before
    public void setUp() {
        requestService.deleteAllReqs();
        userService.deleteAllUsers();
        user = new User();
        user.setName("UserForReqs");
        user.setPassword("reqspass");
        user.setEmail("useremail@mail.ru");
        userService.addUser(user);
    }

    @Test
    public void Should_NotBeAdded_When_OutsideTimeInterval_From10amTo6pm() {
        final MockHttpSession mockSession = new MockHttpSession();
        mockSession.setAttribute("user", user);
        requestController.create(model,mockSession, room, date);
        assertTrue(requestRepository.getAllByUser(userService.findByEmail("useremail@mail.ru")).size() == 0);
    }
}
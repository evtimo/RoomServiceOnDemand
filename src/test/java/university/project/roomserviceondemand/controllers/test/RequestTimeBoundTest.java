package university.project.roomserviceondemand.controllers.test;


import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import university.project.roomserviceondemand.application.RoomserviceondemandApplication;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.models.Status;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.repository.UserRepository;
import university.project.roomserviceondemand.services.RequestService;
import university.project.roomserviceondemand.services.UserService;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {RoomserviceondemandApplication.class})
@RunWith(Parameterized.class)
public class RequestTimeBoundTest {

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
        Object[][] data = new Object[][]{{ 311, new Date(1572941400000L),  Status.NEW},
                {312, new Date(1572981000000L), Status.NEW},
                {313, new Date(1572912000000L), Status.NEW}};
        return Arrays.asList(data);
    }

    @Before
    public void setUp() {
        requestService.deleteAllReqs();
        userService.deleteAllUsers();
        User user = new User();
        user.setName("UserForReqs");
        user.setPassword("reqspass");
        user.setEmail("useremail@mail.ru");
        userService.addUser(user);
    }

    @Test
    public void Should_NotBeAdded_When_OutsideTimeInterval_From10amTo6pm() {
        Request request = new Request();
        request.setStatus(status);
        request.setDate(date);
        request.setRoom(room);
        request.setUser(userService.findByEmail("useremail@mail.ru"));
        requestService.save(request);
        assertNull(requestService.getByRequestId(request.getId()));
    }
}
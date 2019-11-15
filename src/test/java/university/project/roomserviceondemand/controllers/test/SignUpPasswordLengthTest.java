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
import university.project.roomserviceondemand.controllers.AuthorizationController;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.repository.FeedbackRepository;
import university.project.roomserviceondemand.repository.RequestRepository;
import university.project.roomserviceondemand.repository.UserRepository;
import university.project.roomserviceondemand.services.RequestService;
import university.project.roomserviceondemand.services.UserService;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertNull;

@SpringBootTest
@ContextConfiguration(classes = {RoomserviceondemandApplication.class})
@RunWith(Parameterized.class)
public class SignUpPasswordLengthTest {

	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();

	@Parameterized.Parameter(0)
	public String pass;
	@Parameterized.Parameter(1)
	public String name;
	@Parameterized.Parameter(2)
	public String email;
	@Parameterized.Parameter(3)
	public String phone;

	@Autowired
	private AuthorizationController authorizationController;

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private FeedbackRepository feedbackRepository;

	@Parameterized.Parameters(name = "{index}: Test with pass={0}, name={1}, email={2}, phone={3} ")
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{
				{"123456", "name1", "email1@mail.ru", "89991112233"},
				{"000", "name2", "email2@mail.ru", "89991112233"},
				{"pass", "name3", "email3@mail.ru", "89991112233"}};
		return Arrays.asList(data);
	}

	@Before
	public void setUp() {
		feedbackRepository.deleteAll();
		requestRepository.deleteAll();
		userRepository.deleteAll();
	}

	@Test
	public void Should_NotSignUp_When_PasswordLengthLess8() {
		User user = new User();
		user.setPassword(pass);
		user.setName(name);
		user.setEmail(email);
		user.setPhoneNumber(phone);
		authorizationController.signUp(user);
		assertNull("New user was not created", userService.findByEmail(user.getEmail()));
	}

}
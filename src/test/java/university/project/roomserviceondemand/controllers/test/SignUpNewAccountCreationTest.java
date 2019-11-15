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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.ui.Model;
import university.project.roomserviceondemand.application.RoomserviceondemandApplication;

import university.project.roomserviceondemand.controllers.AuthorizationController;
import university.project.roomserviceondemand.models.User;
import university.project.roomserviceondemand.repository.FeedbackRepository;
import university.project.roomserviceondemand.repository.RequestRepository;
import university.project.roomserviceondemand.repository.UserRepository;
import university.project.roomserviceondemand.services.UserService;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {RoomserviceondemandApplication.class})
@RunWith(Parameterized.class)
public class SignUpNewAccountCreationTest {

	@Mock
	private Model model;

	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();

	// fields used can be private, no need to be public
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

	@Parameterized.Parameters(name = "{index}: Test with pass={0}, name={1}, email={2}, phone={3}")
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{
				{"12345678", "name1", "email1@mail.ru", "+123 123456"},
				{"password1", "name2", "email2@ya.ru", "+123 123456"},
				{"new0pass1", "name3", "myemail@gmail.com", "+123 123456"}};
		return Arrays.asList(data);
	}

	@Before
	public void setUp() {
		feedbackRepository.deleteAll();
		requestRepository.deleteAll();
		userRepository.deleteAll();
	}

	@Test
	public void Should_SignUp_When_AllFieldsCorrect() {
		User user = new User();
		user.setPassword(pass);
		user.setName(name);
		user.setEmail(email);
		user.setPhoneNumber(phone);
		authorizationController.signUp(model, user);
		User createdUser = userService.findByEmail(email);
		assertNotNull(createdUser);
		assertEquals(createdUser.getPhoneNumber(), phone);
		assertEquals(createdUser.getName(), name);

	}

}
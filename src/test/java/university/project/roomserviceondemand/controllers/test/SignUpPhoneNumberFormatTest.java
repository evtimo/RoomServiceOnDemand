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
import university.project.roomserviceondemand.services.RequestService;
import university.project.roomserviceondemand.services.UserService;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertNull;

@SpringBootTest
@ContextConfiguration(classes = {RoomserviceondemandApplication.class})
@RunWith(Parameterized.class)
public class SignUpPhoneNumberFormatTest {

	@Mock
	private Model model;

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
				{"password1", "name1", "1email1@mail.ru", "1112233"},
				{"password1", "name2", "1email2@mail.ru", "+7-8999-1233"},
				{"password1", "name3", "1email3@mail.ru", "899913"}};
		return Arrays.asList(data);
	}

	@Before
	public void setUp() {
		feedbackRepository.deleteAll();
		requestRepository.deleteAll();
		userRepository.deleteAll();
	}

	@Test
	public void Should_NotSignUp_When_PhoneIsNotInternationalFormat() {
		User user = new User();
		user.setPassword(pass);
		user.setName(name);
		user.setEmail(email);
		user.setPhoneNumber(phone);
		authorizationController.signUp(model, user);
		assertNull("New user was not created", userService.findByEmail(user.getEmail()));
	}

}
package university.project.roomserviceondemand.controllers.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        FeedbackCreationTest.class,
        RequestTimeBoundTest.class,
        SignUpEmailCorrectnessTest.class,
        SignUpNewAccountCreationTest.class,
        SignUpPasswordContainsDigitTest.class,
        SignUpPasswordLengthTest.class,
        SignUpPhoneNumberFormatTest.class,
		SignInCorrectTest.class,
		SignInFieldIncorrectTest.class,
		SignInUserDoesntExistTest.class
})

public class JunitTestSuite {
}
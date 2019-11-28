Instruction how to run tests: 
Run test suite class - src.test.java.university.project.roomserviceondemand.controllers.test.JunitTestSuite

SignUpEmailCorrectnessTest - Fail. In use cases mentioned, that all filelds incclude email should be checked for correctness, but there is no check for email field in implementation at all yet.
In every test there are 3 sets of parameters with different data.

SignUpNewAccountCreationTest - Pass. If all entered data is correct, new user account creates successfully.

SignUpPasswordContainsDigitTest - Fail. In use cases mentioned, that password should contain at least 1 digit, but there is no such check in implementation.

SignUpPasswordLengthTest - Fail. In use cases mentioned, that password length should be more than 8 symbols, but there is no such check in implementation.

SignUpPhoneNumberFormatTest - Fail. In use cases mentioned, that phone number should be entered in international format, but there is no email check in implementation at all.

FeedbackCreationTest - Pass. In use case mentioned, that feedbacks with grades should be stored in the database. Newly created feedbacks saves in the database and avaliable for work.

RequestTimeBoundTest - Fail. In the use case mentioned, that the system should validate selected date and time - the time should be in the range from 10 am to 6 pm, but the system allow to save requests which are outside this time range.
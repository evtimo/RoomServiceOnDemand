

| **Test Case name:** | Sign Up 1 |
| --- | --- |
| **Test ID:** | TC-01 |
| **Test suite:** | Sign Up |
| **Priority:** |   |
| **Setup:** | The user database is empty |
| **Teardown:** | Clean up the user database |
| **Step** | **Description** | **Result** | **Problem ID** |
| TC-01-A1 | User filled the sign-up form | Passed |   |
| TC-01-S2 | The system validates the input fields for completeness and correctness of the format | Passed |   |
| TC-01-S3 | The system checks that there is no account registered with the provided login | Passed |   |
| TC-01-S4 | The system creates an account with the provided client information | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |



| **Test Case name:** | Sign Up 2 |
| --- | --- |
| **Test ID:** | TC-02 |
| **Test suite:** | Sign Up |
| **Priority:** |   |
| **Setup:** | The user database is empty |
| **Teardown:** | Clean up the user database |
| **Step** | **Description** | **Result** | **Problem ID** |
| TC-02-A1 | User filled the sign-up form | Passed |   |
| TC-02-S2 | The system validates the input fields for completeness and correctness of the format | Passed |   |
| TC-02-AE1 | At least one of the fields in the form is incorrect, the user gets a message of what was incorrect and fills the form again | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 22.11.19 |



| **Test Case name:** | Sign Up 3 |
| --- | --- |
| **Test ID:** | TC-03 |
| **Test suite:** | Sign Up |
| **Priority:** |   |
| **Setup:** | In the database there is a user with same credentinals |
| **Teardown:** | Clean up the user database |
| **Step** | **Description** | **Result** | **Problem** |
| TC-03-A1 | User filled the sign-up form | Passed |   |
| TC-03-S2 | The system validates the input fields for completeness and correctness of the format | Passed |   |
| TC-03-S3 | The system checks that there is no account registered with the provided login | Passed |   |
| TC-03-AE2 | The system finds an account with the provided login, the system shows a message that a user with the provided login is already registered, the user is not registered | Failed | No warning messages appeared |
| **Status:** | Failed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |



| **Test Case name:** | Sign in 1 |
| --- | --- |
| **Test ID:** | TC-04 |
| **Test suite:** | Sign in |
| **Priority:** |   |
| **Setup:** | A user account is created in the database |
| **Teardown:** | User is Signed In |
| **Step** | **Description** | **Result** | **Problem ID** |
| TC-04-A1 | The user fills the sign-in form: email and password | Passed |   |
| TC-04-S2 | The system validates the input fields for completeness and correctness of the format | Passed |   |
| TC-04-S3 | System checks that there is an account with the provided email and password | Passed |   |
| TC-04-S4 | The system authenticates the user | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |

| **Test Case name:** | Sign in 2 |
| --- | --- |
| **Test ID:** | TC-05 |
| **Test suite:** | Sign in |
| **Priority:** |   |
| **Setup:** | A user account is created in the database |
| **Teardown:** | User is Signed In |
| **Step** | **Description** | **Result** | **Problem ID** |
| TC-05-A1 | The user fills the sign-in form: email and password | Passed |   |
| TC-05-S2 | The system validates the input fields for completeness and correctness of the format | Passed |   |
| TC-05-AE1 | At least one of the fields in the form is incorrect, the user gets a message of what was incorrect and fills the form again | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |



| **Test Case name:** | Sign in 3 |
| --- | --- |
| **Test ID:** | TC-06 |
| **Test suite:** | Sign in |
| **Priority:** |   |
| **Setup:** | A user account is created in the database |
| **Teardown:** |   |
| **Step** | **Description** | **Result** | **Problem** |
| TC-06-A1 | The user fills the sign-in form: email and password | Passed |   |
| TC-06-S2 | The system validates the input fields for completeness and correctness of the format | Passed |   |
| TC-06-S3 | System checks that there is an account with the provided email and password | Passed |   |
| TC-06-AE2 | Account for the provided email and password was not found, the system shows an error message that there is no user registered with the provided login and password combination, the user is not signed in | Failed | No warning messages appeared |
| **Status:** | Failed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |



| **Test Case name:** | Request for Cleaning Creation 1 |
| --- | --- |
| **Test ID:** | TC-07 |
| **Test suite:** | Request for Cleaning Creation |
| **Priority:** |   |
| **Setup:** | User is logged in to the system |
| **Teardown:** | Clean up created requests in the database |
| **Step** | **Description** | **Result** | **Problem ID** |
| TC-07-A1 | The client selects his room number, date and time for performing cleaning | Passed |   |
| TC-07-S2 | The system validates selected date and time - the time should be in the range from 10 am to 6 pm | Passed |   |
| TC-07-S3 | The system creates a request with the specified date, time and room number. | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |

| **Test Case name:** | Request for Cleaning Creation 2 |
| --- | --- |
| **Test ID:** | TC-08 |
| **Test suite:** | Request for Cleaning Creation |
| **Priority:** |   |
| **Setup:** | User is logged in to the system |
| **Teardown:** |   |
| **Step** | **Description** | **Result** | **Problem ID** |
| TC-08-A1 | The client selects his room number, date and time for performing cleaning | Passed |   |
| TC-08-S2 | The system validates selected date and time - the time should be in the range from 10 am to 6 pm | Passed |   |
| TC-08-AE1 | If the user has not specified the time in the range from 10 am to 6 pm, the request is not created and the error message is shown | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |

| **Test Case name:** | Feedback on the cleaning filling |
| --- | --- |
| **Test ID:** | TC-09 |
| **Test suite:** | Feedback on the cleaning filling |
| **Priority:** |   |
| **Setup:** | The client fills the feedback form for a &quot;Done&quot; request |
| **Teardown:** | Client feedback entry removed from the database |
| **Step** | **Description** | **Result** | **Problem ID** |
| TC-09-A1 | The client opens the request list | Passed |   |
| TC-09-S2 | The system shows a list with all requests | Passed |   |
| TC-09-A3 | The client chooses grade the service | Passed |   |
| TC-09-A4 | Client submits the feedback comment | Passed |   |
| TC-09-S5 | The system stores the grade and the feedback comment for the request | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |

| **Test Case name:** | Request List |
| --- | --- |
| **Test ID:** | TC-10 |
| **Test suite:** | Request List |
| **Priority:** |   |
| **Setup:** | User is logged in the system |
| **Teardown:** |   |
| **Step** | **Description** | **Result** | **Problem ID** |
| TC-10-A1 | Admin/Client opens the request list | Passed |   |
| TC-10-S2 | The system shows a list with all requests | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |

| **Test Case name:** | Change Language |
| --- | --- |
| **Test ID:** | TC-11 |
| **Test suite:** | Change Language 1 |
| **Priority:** |   |
| **Setup:** |   |
| **Teardown:** |   |
| **Step** | **Description** | **Result** | **Problem ID** |
| **TC-11-A1** | The user selects a language (Russian or English) | Passed |   |
| **TC-11-S2** | The system displays the user interface in the selected language | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |

| **Test Case name:** | Request Status Change |
| --- | --- |
| **Test ID:** | TC-12 |
| **Test suite:** | Request Status Change |
| **Priority:** |   |
| **Setup:** |   |
| **Teardown:** |   |
| **Step** | **Description** | **Result** | **Problem ID** |
| **TC-12-A1** | Admin opens the request list | Passed |   |
| **TC-12-S2** | The system shows a list with all requests | Passed |   |
| **TC-12-S3** | System updates the request with the new status | Passed |   |
| **TC-12-S4** | Email is sent to the client who created this request containing the new status and the comment message. Also, there is the help text telling that a new request can be created using the system | Passed |   |
| **Status:** | Passed |
| **Tester:** | T. Tester |
| **Date Complete:** | 25.11.19 |



## **Test Case Matrix**

| **Step** | **Selection or Variable** | **TC-01** | **TC-02** | **TC-03** | **TC-04** | **TC-05** | **TC-06** | **TC-07** | **TC-08** | **TC-09** | **TC-10** | **TC-11** | **TC-12** |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| B1 | Email | Regular | Incorrect | Existing | Correct | Incorrect | Correct |   |   |   |   |   |   |
| B2 | Full Name | Regular | Regular | Regular |   |   |   |   |   |   |   |   |   |
| B3 | Phone | Regular | Regular | Regular |   |   |   |   |   |   |   |   |   |
| B4 | Password | Regular | Regular | Regular | Correct | Correct | Correct |   |   |   |   |   |   |
| B5 | Room number |   |   |   |   |   |   | Regular | Regular |   |   |   |   |
| B6 | Cleaning time and date |   |   |   |   |   |   | Regular | Incorrect |   |   |   |   |
| B7 | Grade |   |   |   |   |   |   |   |   | Regular |   |   |   |
| B8 | Comment |   |   |   |   |   |   |   |   | Regular |   |   |   |









## **Test case values**

**TC-01**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B1 | Email | example@mail.ru | Sign-up page | Sign-up page |
| B2 | Full Name | Harry Potter | Sign-up page | Sign-up page |
| B3 | Phone | +79179994416 | Sign-up page | Sign-up page |
| B4 | Password | password8 | Requests list  page | Requests page list |

**TC-02**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B1 | Email | wrong#mail.ru | Sign-up page | Sign-up page |
| B2 | Full Name | Harry Potter | Sign-up page | Sign-up page |
| B3 | Phone | +79179994416 | Sign-up page | Sign-up page |
| B4 | Password | password8 | A message with an error about mail format | A message with an error about mail format |

**TC-03**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B1 | Email | An email that already assign to a User in the database | Sign-up page | Sign-up page |
| B2 | Full Name | Harry Potter | Sign-up page | Sign-up page |
| B3 | Phone | +79179994416 | Sign-up page | Sign-up page |
| B4 | Password | password8 | Error message | Empty sign up form |

**TC-04**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B1 | Email | Email of the user that registered in the system | Sign-in page | Sign-in page |
| B4 | Password | The password of the user that registered in the system | Requests list page | Requests page list |

**TC-05**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B1 | Email | Incorrect%mail.com | Sign-in page | Sign-in page |
| B4 | Password | Password | Error message | Empty sign in page |

**TC-06**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B1 | Email | Non\_existing@mail.com | Sign-in page | Sign-in page |
| B4 | Password | Password | Error message | Empty sign-in page |

**TC-07**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B5 | Room number | 311 | Requests list page | Requests page list |
| B6 | Cleaning time and date | 11/18/2019 8:36 PM | Requests list page with a new request | Requests list page with new request  |

**TC-08**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B5 | Room number | 311 | Requests list page | Requests page list |
| B6 | Cleaning time and date | 11/18/2019 9:36 PM | Error message | Error message  |

**TC-09**

| **Step** | **Selection or Variable** | **Value** | **Expected results** | **Obtained results** |
| --- | --- | --- | --- | --- |
| B7 | Grade | 4 stars | Requests list page | Requests page list |
| B8 | Comment | Feedback comment | The system stores the grade and the feedback comment for the request | Requests page list |

## **Interaction Matrix**



|   | **Submit sign-up form** | **Login** | **Request for Cleaning Creation** | **Request status change** | **Feedback on the cleaning filling** |
| --- | --- | --- | --- | --- | --- |
| Submit sign-up form |   |   | RD - getting request list |   |   |
| Login |   |   |   |   |   |
| Request for Cleaning Creation |   |   |   | RD - request deleting | RD - request deleting |
| Request status change |   |   | RC - cleaning createon |   |   |
| Feedback on the cleaning filling |   |   |   | RC - leaving feedback |   |

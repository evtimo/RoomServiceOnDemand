# Use Case Diagram 
<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Use%20Case%20Diagram.png?raw=true" width="70%" />

**Terminology**

| **Term** | **Definition** |
| --- | --- |
| Request | request for cleaning with specified <ul><li>date</li><li>time</li><li>room</li><li>number</li><li>status</li></ul> |
| Approved | request is checked by admin, and cleaning service will arrive in specified time |
| New | request is registered and waiting to be checked by administrator |
| Denied | request is checked by admin and can`t be served for some reasons |
| Done | request was fulfilled |
| Client | Innopolis student, who live in dorms |
| Administrator | Dorm administrator or another official |
| Cleaning | Specialists who are responsible for cleaning of rooms |

| **Use Case Name** | **Sign Up** |
| --- | --- |
| Actors | Client |
| Flow of events | <ol><li>User fills the sign-up form: email, password (>8 symbols, at least one digit), full name, phone number (in international format)</li><li>The system validates the input fields for completeness and correctness of the format </li><li>The system checks that there is no account registered with the provided login </li> <li>The system creates an account with the provided client information (name, email, password)</li></ol> |
| Post-conditions | User is registered and can Sign In with the provided credentials |
| Alternate flows and exceptions | <ol><li>At least one of the fields in the form is incorrect, the user gets a message of what was incorrect and fills the form again</li><li>The system finds an account with the provided login, the system shows a message that a user with the provided login is already registered, the user is not registered</li> </ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_signup.png?raw=true" width="50%" />

| **Use Case Name** | **Sign In** |
| --- | --- |
| Actors | Client, Administration |
| Flow of events | <ol><li>The user fills the sign-in form: email and password</li><li>The system validates the input fields for completeness and correctness of the format</li><li>System checks that there is an account with the provided email and password</li><li>The system authenticates the user</li></ol> |
| Post-conditions | User is authenticated |
| Alternate flows and exceptions | <ol><li>At least one of the fields in the form is incorrect, the user gets a message of what was incorrect and fills the form again</li><li>Account for the provided email and password was not found, the system shows an error message that there is no user registered with the provided login and password combination, the user is not signed in</li></ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_signin.png?raw=true" width="50%" />

| **Use Case Name** | **Request for Cleaning Creation** |
| --- | --- |
| Actors | Client |
| Pre-conditions | The client is authenticated |
| Flow of events | <ol><li>The client selects his room number, date and time for performing cleaning</li><li>The system validates selected date and time - the time should be in the range from 10 am to 6 pm</li><li>The system creates a request with the specified date, time and room number.</li></ol>|
| Post-conditions | Request with status "New" and the specified data is created |
| Alternate flows and exceptions | <ol> <li>If the user has not specified the time in the range from 10 am to 6 pm, the request is not created and the error message is shown </li> </ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_createrequest.png?raw=true" width="50%" />

| **Use Case Name** | **Request status change** |
| --- | --- |
| Actors | Administration |
| Pre-conditions | An existing request with any status, except “done” status |
| Flow of events | <ol> <li>Include Admin Panel Request List Use Case</li><li>System updates the request with the new status</li> <li> Email is sent to the client who created this request containing the new status and the comment message. Also, there is the help text telling that a new request can be created using the system </li></ol>  |
| Post-conditions | <ul><li>Request is updated with the selected status </li> <li>Email is sent with the new status and the entered comment message</li></ul> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_status_change.png?raw=true" width="50%" />

| **Use Case Name** | **Feedback on the cleaning filling** |
| --- | --- |
| Actors | Client |
| Pre-conditions | Client fills the feedback form for a &quot;Done&quot; request |
| Flow of events | <ol> <li>Client chooses grade the service</li> <li>Client submit the feedback comment</li> <li>System stores the grade and the feedback comment for the request</li> </ol> |
| Post-conditions | Cleaning service feedback is saved for the request |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_feedback.png?raw=true" width="50%" />

| **Use Case Name** | **Admin Panel Request List** |
| --- | --- |
| Actors | Admin |
| Pre-conditions | Admin is authenticated |
| Flow of events | <ol><li>Admin opens the request list</li><li>The system shows a list with all requests</li></ol> |
| Post-conditions | The system displayed all requests in the admin panel |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_list_request.png?raw=true" width="50%" />

| **Use Case Name** | **Change of Language** |
| --- | --- |
| Actors | Client, Admin |
| Flow of events | <ol><li>The user selects a language (Russian or English)</li><li>The system displays the user interface in the selected language</li></ol>|
| Post-conditions | System text is shown in the selected language |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_language.png?raw=true" width="50%" />

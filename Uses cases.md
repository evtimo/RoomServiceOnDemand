# Use Case Diagram 
<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Use%20Case%20Diagram.png?raw=true" width="70%" />

### [Terminology](#terms)

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

### [Sign-up](#sign-up)

| **Use Case Name** | **Sign-Up** |
| --- | --- |
| Actors | Client |
| Flow of events | <ol><li> A1. User fills the sign-up form: email, password (>8 symbols, at least one digit), full name, phone number (in international format)</li><li> S1. The system validates the input fields for completeness and correctness of the format </li><li> S2. The system checks that there is no account registered with the provided login </li> <li> S3. The system creates an account with the provided client information (name, email, password)</li></ol> |
| Post-conditions | User is registered and can Sign In with the provided credentials |
| Alternate flows and exceptions | <ol><li> AE1. At least one of the fields in the form is incorrect, the user gets a message of what was incorrect and fills the form again</li><li> AE2. The system finds an account with the provided login, the system shows a message that a user with the provided login is already registered, the user is not registered</li> </ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_signup.png?raw=true" width="50%" />


### [Sign-In](#sign-in)
| **Use Case Name** | **Sign In** |
| --- | --- |
| Actors | Client, Administration |
| Flow of events | <ol><li> A1. The user fills the sign-in form: email and password</li><li> S2. The system validates the input fields for completeness and correctness of the format</li><li> S3. System checks that there is an account with the provided email and password</li><li> S4. The system authenticates the user</li></ol> |
| Post-conditions | User is authenticated |
| Alternate flows and exceptions | <ol><li> AE1. At least one of the fields in the form is incorrect, the user gets a message of what was incorrect and fills the form again</li><li> AE2. Account for the provided email and password was not found, the system shows an error message that there is no user registered with the provided login and password combination, the user is not signed in</li></ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_signin.png?raw=true" width="50%" />

### [Request for Cleaning Creation](#request-for-cleaning-creation)
| **Use Case Name** | **Request for Cleaning Creation** |
| --- | --- |
| Actors | Client |
| Pre-conditions | The client is authenticated |
| Flow of events | <ol><li> A1. The client selects his room number, date and time for performing cleaning</li><li> S2. The system validates selected date and time - the time should be in the range from 10 am to 6 pm</li><li> S3. The system creates a request with the specified date, time and room number.</li></ol>|
| Post-conditions | Request with status "New" and the specified data is created |
| Alternate flows and exceptions | <ol> <li> AE1. If the user has not specified the time in the range from 10 am to 6 pm, the request is not created and the error message is shown </li> </ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_createrequest.png?raw=true" width="50%" />

### [Request status change](#request-status-change)
| **Use Case Name** | **Request status change** |
| --- | --- |
| Actors | Administration |
| Pre-conditions | An existing request with any status, except “done” status |
| Flow of events | <ol> <li>Include Admin Panel Request List Use Case</li><li> S3. System updates the request with the new status</li> <li> S4. Email is sent to the client who created this request containing the new status and the comment message. Also, there is the help text telling that a new request can be created using the system </li></ol>  |
| Post-conditions | <ul><li>Request is updated with the selected status </li> <li>Email is sent with the new status and the entered comment message</li></ul> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_status_change.png?raw=true" width="50%" />

### [Feedback on the cleaning filling](#feedback-on-the-cleaning-filling)
| **Use Case Name** | **Feedback on the cleaning filling** |
| --- | --- |
| Actors | Client |
| Pre-conditions | Client fills the feedback form for a &quot;Done&quot; request |
| Flow of events | <ol> <li>Include Admin Panel Request List Use Case</li> <li> A3. Client chooses grade the service</li> <li> A4. Client submit the feedback comment</li> <li> S5. System stores the grade and the feedback comment for the request</li> </ol> |
| Post-conditions | Cleaning service feedback is saved for the request |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_feedback.png?raw=true" width="50%" />

### [Request List](#request-list)
| **Use Case Name** | **Request List** |
| --- | --- |
| Actors | Admin, Client |
| Pre-conditions | Admin/Client is authenticated |
| Flow of events | <ol><li> A1. Admin/Client opens the request list</li><li> S2. The system shows a list with all requests</li></ol> |
| Post-conditions | The system displayed all client's requests OR all requests for admin|

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_list_request.png?raw=true" width="50%" />

### [Change of Language](#change-of-language)
| **Use Case Name** | **Change of Language** |
| --- | --- |
| Actors | Client, Admin |
| Flow of events | <ol><li> S1. The user selects a language (Russian or English)</li><li> S2. The system displays the user interface in the selected language</li></ol>|
| Post-conditions | System text is shown in the selected language |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_language.png?raw=true" width="50%" />

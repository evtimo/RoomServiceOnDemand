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
| Pre-conditions | User filled the sign up form |
| Flow of events | <ol><li>Systems checks that there is no account registered with the provided login</li><li>System creates an account with the provided client information (name, login, password)</li></ol> |
| Post-conditions | User is registered and can Sign In with the provided credentials |
| Alternate flows and exceptions | <ol><li>System finds an account with the provided login</li><li>System shows a message that a user with the provided login is already registered</li><li>User is not registered</li><li>Account is not created</li> </ol> |

| **Use Case Name** | **Sign In** |
| --- | --- |
| Actors | Client or Administration |
| Pre-conditions | User enters their crls in the Sign In form |
| Flow of events | <ol><li>System checks that there is an account with the provided login and password</li><li>System considers the client as signed in</li></ol> |
| Post-conditions | User is Signed In |
| Alternate flows and exceptions | <ol><li>System does not find an account with the provided login and password</li><li>System shows a message that there is no user registered with the provided login and password combination</li><li>User is not signed in</li></ol> |

| **Use Case Name** | **Request for Cleaning Creation** |
| --- | --- |
| Actors | Client |
| Pre-conditions | Signed in client creates a new request for cleaning, specifying the date and time when the cleaning should be performed, room number. The time should be in the range from 10 am to 6 pm |
| Flow of events | 1. The system creates a request with the specified date, time and room number. The status of the order should be &quot;New&quot;.|
| Post-conditions | Request with the specified data is created |
| Alternate flows and exceptions | <ol> <li>If user have specified time not in the range from 10 am to 6 pm, the request is not created and the error message is shown </li> <li> Request is not created </li> </ol> |

| **Use Case Name** | **Request status change** |
| --- | --- |
| Actors | Administration |
| Pre-conditions | Admin selects the new status for the request and enters the comment message |
| Flow of events | <ol> <li>System updates the request with the new status</li> <li> Email is sent to the client who created this request containing the new status and the comment message. Also, there is the help text telling that a new request can be created using the system </li></ol>  |
| Post-conditions | <ul><li>Request is updated with the selected status </li> <li>Email is sent with the new status and the entered comment message</li></ul> |

| **Use Case Name** | **Feedback on the cleaning filling** |
| --- | --- |
| Actors | Client |
| Pre-conditions | Client fills the feedback form for a &quot;Done&quot; request |
| Flow of events | <ol> <li>Client chooses grade the service</li> <li>Client submit the feedback comment</li> <li>System stores the grade and the feedback comment for the request</li> </ol> |
| Post-conditions | Cleaning service feedback is saved for the request |

| **Use Case Name** | **Admin Panel Request List** |
| --- | --- |
| Actors | Admin |
| Pre-conditions | Signed in admin opens the admin panel |
| Flow of events | System shows all requests |
| Post-conditions | Admin sees requests in the admin panel |

| **Use Case Name** | **Change of Language** |
| --- | --- |
| Actors | Client, Admin |
| Pre-conditions | User selects a language (Russian or English) |
| Flow of events | System shows system text in the selected language for this user |
| Post-conditions | System text is shown in the selected language |

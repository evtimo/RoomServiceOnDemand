
| Request | |
| --- | --- |
| Approved | request is checked by admin, and cleaning service will arrive in specified time |
| New | request is registered and waiting to be checked by administrator |
| Denied | request is checked by admin and can`t be served for some reasons |
| Done | request was fulfilled |

| Role | |
| --- | --- |
| Client | Innopolis student, who live in dorms |
| Administrator | Dorm administrator or another official |
| Cleaning | Specialists who are responsible for cleaning of rooms |



| **Use Case Name** | **Sign Up** |
| --- | --- |
| Actors | Client |
| Pre-conditions | User filled the sign up form |
| Flow of events | 1. Systems checks that there is no account registered with the provided login </br> 2. System creates an account with the provided client information (name, login, password) |
| Post-conditions | User is registered and can Sign In with the provided credentials |
| Alternate flows and exceptions | 1. System finds an account with the provided login </br> 2. System shows a message that a user with the provided login is already registered </br> 3. User is not registered </br> 4. Account is not created |

| **Use Case Name** | **Sign In** |
| --- | --- |
| Actors | Client or Administration |
| Pre-conditions | User enters their crls in the Sign In form |
| Flow of events | 1. System checks that there is an account with the provided login and password </br> 2. System considers the client as signed in |
| Post-conditions | User is Signed In |
| Alternate flows and exceptions | 1. System does not find an account with the provided login and password </br> 2. System shows a message that there is no user registered with the provided login and password combination </br> 3. User is not signed in |

| **Use Case Name** | **Request for Cleaning Creation** |
| --- | --- |
| Actors | Client |
| Pre-conditions | Signed in client creates a new request for cleaning, specifying the date and time when the cleaning should be performed, room number. The time should be in the range from 10 am to 6 pm |
| Flow of events | 1. The system creates a request with the specified date, time and room number. The status of the order should be &quot;New&quot;. |
| Post-conditions | Request with the specified data is created |
| Alternate flows and exceptions | 1. If user have specified time not in the range from 10 am to 6 pm, the request is not created and the error message is shown </br> 2. Request is not created |

| **Use Case Name** | **Request status change** |
| --- | --- |
| Actors | Administration |
| Pre-conditions | Admin selects the new status for the request and enters the comment message |
| Flow of events | 1. System updates the request with the new status </br> 2. Email is sent to the client who created this request containing the new status and the comment message. Also, there is the help text telling that a new request can be created using the system </br> |
| Post-conditions | Request is updated with the selected status </br> Email is sent with the new status and the entered comment message

| **Use Case Name** | **Feedback on the cleaning filling** |
| --- | --- |
| Actors | Client |
| Pre-conditions | Client fills the feedback form for a &quot;Done&quot; request |
| Flow of events | 1. Client chooses grade the service </br> 2. Client submit the feedback comment </br> 3. System stores the grade and the feedback comment for the request |
| Post-conditions | Cleaning service feedback is saved for the request |

| **Use Case Name** | **Admin Panel Request List** |
| --- | --- |
| Actors | Admin |
| Pre-conditions | Signed in admin opens the admin panel |
| Flow of events | 1. System shows all requests |
| Post-conditions | Admin sees requests in the admin panel |

| **Use Case Name** | **Change of Language** |
| --- | --- |
| Actors | Client, Admin |
| Pre-conditions | User selects a language (Russian or English) |
| Flow of events | 1. System shows system text in the selected language for this user |
| Post-conditions | System text is shown in the selected language  |

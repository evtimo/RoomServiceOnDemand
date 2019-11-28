Tracebility: <a href="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/commits/Iteration-3/Uses%20cases.md"> History of use cases changes </a>

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
| Flow of events | <ol><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L91-L127">A1. User fills the sign-up form: email, password (>8 symbols, at least one digit), full name, phone number (in international format)</a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L95-L119">S2. The system validates the input fields for completeness and correctness of the format </a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L93-L95">S3. The system checks that there is no account registered with the provided login</a> </li> <li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L120">S4. The system creates an account with the provided client information (name, email, password)</a></li></ol> |
| Post-conditions | User is registered and can Sign In with the provided credentials |
| Alternate flows and exceptions | <ol><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L102-L104">AE1. At least one of the fields in the form is incorrect, the user gets a message of what was incorrect and fills the form again</a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L123-L124">AE2. The system finds an account with the provided login, the system shows a message that a user with the provided login is already registered, the user is not registered </a></li> </ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_signup.png?raw=true" width="50%" />


### [Sign-In](#sign-in)
| **Use Case Name** | **Sign In** |
| --- | --- |
| Actors | Client, Administration |
| Flow of events | <ol><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L72">A1. The user fills the sign-in form: email and password </a> </li><li> <a href= "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L72-L77">S2. The system validates the input fields for completeness and correctness of the format </a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L75-L76">S3. System checks that there is an account with the provided email and password </a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L129-L135"> S4. The system authenticates the user</li></ol> |
| Post-conditions | User is authenticated |
| Alternate flows and exceptions | <ol><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L72-L74"> AE1. At least one of the fields in the form is incorrect, the user gets a message of what was incorrect and fills the form again</a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/55643b615fee0621df621491731fe59552f1e34a/src/main/java/university/project/roomserviceondemand/controllers/AuthorizationController.java#L157-L162">AE2. Account for the provided email and password was not found, the system shows an error message that there is no user registered with the provided login and password combination, the user is not signed in</a></li></ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_signin.png?raw=true" width="50%" />

### [Request for Cleaning Creation](#request-for-cleaning-creation)
| **Use Case Name** | **Request for Cleaning Creation** |
| --- | --- |
| Actors | Client |
| Pre-conditions | The client is authenticated |
| Flow of events | <ol><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/resources/templates/views/create-request-modal.ftl#L13-L28">A1. The client selects his room number, date and time for performing cleaning</a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/java/university/project/roomserviceondemand/controllers/RequestController.java#L94-L108">S2. The system validates selected date and time - the time should be in the range from 10 am to 6 pm </a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/java/university/project/roomserviceondemand/controllers/RequestController.java#L118">S3. The system creates a request with the specified date, time and room number.</a></li></ol>|
| Post-conditions | Request with status "New" and the specified data is created |
| Alternate flows and exceptions | <ol> <li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/resources/templates/views/requestsError.ftl#L24">AE1. If the user has not specified the time in the range from 10 am to 6 pm, the request is not created and the error message is shown </a></li> </ol> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_createrequest.png?raw=true" width="50%" />

### [Request status change](#request-status-change)
| **Use Case Name** | **Request status change** |
| --- | --- |
| Actors | Administration |
| Pre-conditions | An existing request with any status, except “done” status |
| Flow of events | <ol> <li>Include Admin Panel Request List Use Case</li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/java/university/project/roomserviceondemand/controllers/RequestController.java#L149-L154">S3. System updates the request with the new status </a></li> <li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/java/university/project/roomserviceondemand/controllers/RequestController.java#L156-L157">S4. Email is sent to the client who created this request containing the new status and the comment message. Also, there is the help text telling that a new request can be created using the system</a> </li></ol>  |
| Post-conditions | <ul><li>Request is updated with the selected status </li> <li>Email is sent with the new status and the entered comment message</li></ul> |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_status_change.png?raw=true" width="50%" />

### [Feedback on the cleaning filling](#feedback-on-the-cleaning-filling)
| **Use Case Name** | **Feedback on the cleaning filling** |
| --- | --- |
| Actors | Client |
| Pre-conditions | Client fills the feedback form for a &quot;Done&quot; request |
| Flow of events | <ol> <li>Include Admin Panel Request List Use Case</li> <li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/resources/templates/views/feedback.ftl#L20-L47">A3. Client chooses grade the service</a></li> <li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/resources/templates/views/feedback.ftl#L50-L55"> A4. Client submit the feedback comment </a></li> <li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/java/university/project/roomserviceondemand/controllers/RequestController.java#L169-L174">S5. System stores the grade and the feedback comment for the request</a></li> </ol> |
| Post-conditions | Cleaning service feedback is saved for the request |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_feedback.png?raw=true" width="50%" />

### [Request List](#request-list)
| **Use Case Name** | **Request List** |
| --- | --- |
| Actors | Admin, Client |
| Pre-conditions | Admin/Client is authenticated |
| Flow of events | <ol><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/resources/templates/views/requests.ftl#L23-L71">A1. Admin/Client opens the request list </a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/java/university/project/roomserviceondemand/controllers/RequestController.java#L63-L77"> S2. The system shows a list with all requests </a></li></ol> |
| Post-conditions | The system displayed all client's requests OR all requests for admin|

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_list_request.png?raw=true" width="50%" />

### [Change of Language](#change-of-language)
| **Use Case Name** | **Change of Language** |
| --- | --- |
| Actors | Client, Admin |
| Flow of events | <ol><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/ae0d15ae9f691b6d84299ee4e97dc6baf9591221/src/main/resources/templates/components/_header.ftl#L21-L24">A1. The user selects a language (Russian or English)</a></li><li> <a href = "https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/543508a3ef4091b6334c486d5d7bc640841dffb4/src/main/java/university/project/roomserviceondemand/config/MvcConfig.java#L70-L74">S2. The system displays the user interface in the selected language</a></li></olhttps://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/543508a3ef4091b6334c486d5d7bc640841dffb4/src/main/java/university/project/roomserviceondemand/config/MvcConfig.java#L70-L74>|
| Post-conditions | System text is shown in the selected language |

<img src="https://github.com/SeregaKuznetsov/RoomServiceOnDemand/blob/Iteration-2/Requirements/Activity%20diagrams/AD_language.png?raw=true" width="50%" />

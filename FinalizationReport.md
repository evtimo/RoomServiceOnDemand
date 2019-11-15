Iteration 3 - Finalization - Work done

1. Fixed all defects that were identified on previous stage with parametrized testing:
- Added check for password (it should contain at least 1 digit and its length should be more than 8 symbols)
- Added check for email and phone number correct (international formats)
- Added check for request time creation (it should be in the range from 10 am to 6 pm)

2. All wrong and incorrect inputs now are validated by input form with error-messages. 
Implemented use case when "user gets a message of what was incorrect and fills the form again".

3. Added localization for application - only "Change of Language" use case was not implemented in MVP. 
Now user can change Russian or English language on every page.

Now all tests 7/7 passed. On previous iteration only 2/7 were passed. 
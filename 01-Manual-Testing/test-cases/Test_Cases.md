# ShoppersStack - Test Cases

## 1. Signup / Registration Test Cases

| Test Case ID | Test Scenario | Preconditions | Test Steps | Expected Result |
|---|---|---|---|---|
| TC-SIGNUP-001 | Verify signup with valid details | User is on Signup page | Enter all valid details and click Signup | User should be registered successfully |
| TC-SIGNUP-002 | Verify signup with blank mandatory fields | User is on Signup page | Leave mandatory fields blank and click Signup | Appropriate validation messages should be displayed |
| TC-SIGNUP-003 | Verify valid email format | User is on Signup page | Enter a valid email address | Email should be accepted |
| TC-SIGNUP-004 | Verify invalid email format | User is on Signup page | Enter an invalid email address | Validation message should be displayed |
| TC-SIGNUP-005 | Verify password field | User is on Signup page | Enter password | Password should be accepted according to requirements |
| TC-SIGNUP-006 | Verify confirm password | User is on Signup page | Enter matching password and confirm password | Both passwords should be accepted |
| TC-SIGNUP-007 | Verify password mismatch | User is on Signup page | Enter different password and confirm password | Validation message should be displayed |
| TC-SIGNUP-008 | Verify already registered email | Email already exists | Enter an existing email and valid details | Appropriate error message should be displayed |
| TC-SIGNUP-009 | Verify password masking | User is on Signup page | Enter password | Password should be masked |
| TC-SIGNUP-010 | Verify Signup button | User is on Signup page | Enter valid details and click Signup | Signup action should work successfully |

## 2. Login Test Cases

| Test Case ID | Test Scenario | Preconditions | Test Steps | Expected Result |
|---|---|---|---|---|
| TC-LOGIN-001 | Verify login with valid credentials | Registered user exists | Enter valid email and password and click Login | User should login successfully |
| TC-LOGIN-002 | Verify login with invalid email | Registered user exists | Enter invalid email and valid password | Appropriate error message should be displayed |
| TC-LOGIN-003 | Verify login with invalid password | Registered user exists | Enter valid email and invalid password | Appropriate error message should be displayed |
| TC-LOGIN-004 | Verify login with blank email | User is on Login page | Leave email blank and enter password | Email validation should be displayed |
| TC-LOGIN-005 | Verify login with blank password | User is on Login page | Enter email and leave password blank | Password validation should be displayed |
| TC-LOGIN-006 | Verify login with both fields blank | User is on Login page | Leave email and password blank and click Login | Appropriate validation messages should be displayed |
| TC-LOGIN-007 | Verify password masking on Login page | User is on Login page | Enter password | Password should be masked |
| TC-LOGIN-008 | Verify Login button | User is on Login page | Enter valid credentials and click Login | Login action should work successfully |
| TC-LOGIN-009 | Verify error message for invalid credentials | User is on Login page | Enter invalid credentials | Appropriate error message should be displayed |
| TC-LOGIN-010 | Verify successful login redirects user | Valid user exists | Login with valid credentials | User should be redirected to the appropriate page |

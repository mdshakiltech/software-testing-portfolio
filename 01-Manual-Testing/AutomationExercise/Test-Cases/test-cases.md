# Test Cases - Automation Exercise

## Test Case Format

Each test case contains:
- Test Case ID
- Module
- Test Scenario
- Preconditions
- Test Data
- Test Steps
- Expected Result
- Actual Result
- Status
- Remarks

---

# 1. User Registration

## TC-REG-001 - Register with valid details

**Module:** Registration  
**Test Scenario:** Verify that a new user can register successfully.

**Precondition:** User is not already registered.

**Test Data:** Valid name, email, password and required details.

**Test Steps:**
1. Open Automation Exercise website.
2. Click on the Signup/Login option.
3. Enter a valid name.
4. Enter a valid unique email address.
5. Click Signup.
6. Enter the required account information.
7. Enter the required address details.
8. Submit the registration form.

**Expected Result:** User account should be created successfully.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-REG-002 - Register with already registered email

**Module:** Registration  
**Test Scenario:** Verify registration using an existing email address.

**Precondition:** Email address is already registered.

**Test Data:** Existing registered email.

**Test Steps:**
1. Open the website.
2. Click Signup/Login.
3. Enter a name.
4. Enter an already registered email.
5. Click Signup.

**Expected Result:** Application should display an appropriate message indicating that the email is already registered.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-REG-003 - Register without required information

**Module:** Registration  
**Test Scenario:** Verify validation for missing required information.

**Test Steps:**
1. Open the website.
2. Navigate to Signup.
3. Leave one or more required fields empty.
4. Submit the form.

**Expected Result:** Appropriate validation should be displayed and registration should not complete.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

# 2. Login

## TC-LOGIN-001 - Login with valid credentials

**Module:** Login  
**Test Scenario:** Verify login with valid credentials.

**Precondition:** A registered account is available.

**Test Data:** Valid email and password.

**Test Steps:**
1. Open the website.
2. Click Signup/Login.
3. Enter registered email.
4. Enter correct password.
5. Click Login.

**Expected Result:** User should be logged in successfully.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-LOGIN-002 - Login with invalid password

**Module:** Login  
**Test Scenario:** Verify login with an incorrect password.

**Test Steps:**
1. Open the website.
2. Click Signup/Login.
3. Enter a registered email.
4. Enter an incorrect password.
5. Click Login.

**Expected Result:** Login should fail and an appropriate error message should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-LOGIN-003 - Login with unregistered email

**Module:** Login  
**Test Scenario:** Verify login with an unregistered email.

**Test Steps:**
1. Open the website.
2. Click Signup/Login.
3. Enter an unregistered email.
4. Enter a password.
5. Click Login.

**Expected Result:** Login should fail and an appropriate error message should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-LOGIN-004 - Login with empty fields

**Module:** Login  
**Test Scenario:** Verify validation when login fields are empty.

**Test Steps:**
1. Open the website.
2. Navigate to Login.
3. Leave email and password empty.
4. Click Login.

**Expected Result:** Appropriate validation should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-LOGIN-005 - Logout

**Module:** Login  
**Test Scenario:** Verify that a logged-in user can logout.

**Precondition:** User is logged in.

**Test Steps:**
1. Login with valid credentials.
2. Click Logout.

**Expected Result:** User should be logged out and redirected to the appropriate page.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

# 3. Product Browsing

## TC-PROD-001 - Verify products are displayed

**Module:** Products  
**Test Scenario:** Verify that products are displayed correctly.

**Test Steps:**
1. Open the website.
2. Navigate to the Products section.
3. Observe the product listing.

**Expected Result:** Available products should be displayed with relevant information.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-PROD-002 - View product details

**Module:** Products  
**Test Scenario:** Verify that product details can be viewed.

**Test Steps:**
1. Open the Products section.
2. Select a product.
3. Open the product details.

**Expected Result:** Product details should be displayed correctly.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-PROD-003 - Search for a product

**Module:** Products  
**Test Scenario:** Verify product search functionality.

**Test Data:** Existing product keyword.

**Test Steps:**
1. Open the Products section.
2. Enter a valid product keyword in the search field.
3. Click the search button.
4. Observe the results.

**Expected Result:** Relevant products matching the search keyword should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-PROD-004 - Search with invalid keyword

**Module:** Products  
**Test Scenario:** Verify search with a keyword that does not match a product.

**Test Data:** Invalid/non-existing product keyword.

**Test Steps:**
1. Open the Products section.
2. Enter an invalid keyword.
3. Perform the search.

**Expected Result:** No matching products should be displayed or an appropriate message should appear.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

# 4. Shopping Cart

## TC-CART-001 - Add product to cart

**Module:** Cart  
**Test Scenario:** Verify that a product can be added to the cart.

**Test Steps:**
1. Open the Products section.
2. Select a product.
3. Click Add to Cart.
4. Open the cart.

**Expected Result:** Selected product should be added to the cart with correct details.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-CART-002 - Add multiple products

**Module:** Cart  
**Test Scenario:** Verify that multiple products can be added.

**Test Steps:**
1. Open the Products section.
2. Add one product to the cart.
3. Continue shopping.
4. Add another product.
5. Open the cart.

**Expected Result:** All selected products should appear in the cart.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-CART-003 - Remove product from cart

**Module:** Cart  
**Test Scenario:** Verify that a product can be removed.

**Precondition:** Cart contains at least one product.

**Test Steps:**
1. Open the cart.
2. Select the remove option for a product.
3. Observe the cart.

**Expected Result:** Selected product should be removed from the cart.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-CART-004 - Verify cart price calculation

**Module:** Cart  
**Test Scenario:** Verify product price and total amount.

**Precondition:** Cart contains product(s).

**Test Steps:**
1. Add a product to the cart.
2. Open the cart.
3. Note the product price and quantity.
4. Verify the displayed total.

**Expected Result:** Total amount should be calculated correctly according to product price and quantity.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

# 5. Checkout and Order

## TC-CHECKOUT-001 - Proceed to checkout

**Module:** Checkout  
**Test Scenario:** Verify that the user can proceed to checkout.

**Precondition:** User is logged in and cart contains a product.

**Test Steps:**
1. Add a product to the cart.
2. Open the cart.
3. Click the checkout/proceed option.

**Expected Result:** User should be taken to the checkout page.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-CHECKOUT-002 - Verify checkout details

**Module:** Checkout  
**Test Scenario:** Verify checkout information.

**Precondition:** User has proceeded to checkout.

**Test Steps:**
1. Open checkout.
2. Review delivery/address details.
3. Review order summary.

**Expected Result:** Correct user and order information should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-ORDER-001 - Place an order successfully

**Module:** Order  
**Test Scenario:** Verify successful order placement.

**Precondition:** User is logged in and has a product in the cart.

**Test Steps:**
1. Add a product to the cart.
2. Proceed to checkout.
3. Verify order details.
4. Enter required payment/order information.
5. Place the order.

**Expected Result:** Order should be placed successfully and an appropriate confirmation should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

# 6. Contact Us

## TC-CONTACT-001 - Submit Contact Us form

**Module:** Contact Us  
**Test Scenario:** Verify that the Contact Us form can be submitted.

**Test Steps:**
1. Open the website.
2. Navigate to Contact Us.
3. Enter valid required information.
4. Enter a valid message.
5. Submit the form.

**Expected Result:** Contact form should be submitted successfully and appropriate confirmation should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-CONTACT-002 - Submit Contact Us form with missing required information

**Module:** Contact Us  
**Test Scenario:** Verify validation for missing required fields.

**Test Steps:**
1. Open Contact Us.
2. Leave required fields empty.
3. Submit the form.

**Expected Result:** Appropriate validation should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

# 7. Product Review

## TC-REVIEW-001 - Submit product review

**Module:** Product Review  
**Test Scenario:** Verify that a user can submit a product review.

**Precondition:** User is logged in if login is required.

**Test Steps:**
1. Open the Products section.
2. Select a product.
3. Navigate to the review section.
4. Enter required review information.
5. Submit the review.

**Expected Result:** Review should be submitted successfully and appropriate confirmation should be displayed.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

# 8. Navigation and UI

## TC-UI-001 - Verify navigation between major pages

**Module:** UI/Navigation  
**Test Scenario:** Verify navigation between important pages.

**Test Steps:**
1. Open the website.
2. Navigate between Home, Products, Cart and other available major sections.
3. Observe page loading and navigation.

**Expected Result:** User should be navigated to the selected page correctly without broken navigation.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

## TC-UI-002 - Verify page layout

**Module:** UI  
**Test Scenario:** Verify that important page elements are displayed correctly.

**Test Steps:**
1. Open major application pages.
2. Check headings, buttons, images, links and forms.
3. Observe alignment and visibility.

**Expected Result:** UI elements should be visible, readable and properly aligned.

**Actual Result:**  
To be filled during execution.

**Status:** Not Executed

**Remarks:** -

---

# Test Execution Note

Actual Result and Status will be updated after executing these test cases on the application.

Possible Status values:

- Pass
- Fail
- Blocked
- Not Executed

Failed test cases will be investigated and documented in the Bug Reports section.

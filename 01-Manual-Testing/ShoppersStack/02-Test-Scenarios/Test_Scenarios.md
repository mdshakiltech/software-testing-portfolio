#ShoppersStack - Test Scenarios 

**Module: Navigation**
- **TS_NAV_01:** Verify that the user can navigate Home page.
- **TS_NAV_02:** Verify that the available menu link navigate the correct pages. 
- **TS_NAV_03:** Verify that the browser back button and forward button work correctly.

**Module: Signup**

- **TS_SIGNUP_01:** Verify signup with valid details in all required fields.
- **TS_SIGNUP_02:** Verify signup with an already registered email address.
- **TS_SIGNUP_03:** Verify signup with an invalid email format.
- **TS_SIGNUP_04:** Verify signup with First Name field left blank.
- **TS_SIGNUP_05:** Verify signup with Last Name field left blank.
- **TS_SIGNUP_06:** Verify signup with Phone Number field left blank.
- **TS_SIGNUP_07:** Verify signup with Email Address field left blank.
- **TS_SIGNUP_08:** Verify signup with Password field left blank.
- **TS_SIGNUP_09:** Verify signup with Confirm Password field left blank.
- **TS_SIGNUP_10:** Verify signup with mismatched Password and Confirm Password.
- **TS_SIGNUP_11:** Verify signup without accepting Terms and Conditions.
- **TS_SIGNUP_12:** Verify signup with an invalid phone number.
- **TS_SIGNUP_13:** Verify signup with special characters in name fields.
- **TS_SIGNUP_14:** Verify password masking and visibility functionality.
- **TS_SIGNUP_15:** Verify signup when no gender option is selected.

  
 **Module: Login**

- **TS_LOGIN_01:** Verify login with valid email and password.
- **TS_LOGIN_02:** Verify login with an invalid email and password.
- **TS_LOGIN_03:** Verify login with a valid email and incorrect password.
- **TS_LOGIN_04:** Verify login with an unregistered email address.
- **TS_LOGIN_05:** Verify login with the Email Address field left blank.
- **TS_LOGIN_06:** Verify login with the Password field left blank.
- **TS_LOGIN_07:** Verify login with both fields left blank.
- **TS_LOGIN_08:** Verify login with an invalid email format.
- **TS_LOGIN_09:** Verify password masking and visibility functionality.
- **TS_LOGIN_10:** Verify navigation to the Signup page from the Login page.
- **TS_LOGIN_11:** Verify the Forgot Password functionality, if available.
- **TS_LOGIN_12:** Verify that an appropriate error message appears after unsuccessful login.

 **Module: Logout**

- **TS_LOGOUT_01:** Verify that a logged-in user can logout successfully.
- **TS_LOGOUT_02:** Verify that the user is redirected to the appropriate page after logout.
- **TS_LOGOUT_03:** Verify that the logged-out user cannot access protected pages without logging in again.
- **TS_LOGOUT_04:** Verify that the user session ends after logout.
- **TS_LOGOUT_05:** Verify that the user can log in again after logout.
- **TS_LOGOUT_06:** Verify that the Logout option is available when the user is logged in.
- **TS_LOGOUT_07:** Verify that the user remains logged out after refreshing the page.

 **Module: Product Search**

- **TS_SEARCH_01:** Verify product search using a valid product name.
- **TS_SEARCH_02:** Verify product search using a partial product name.
- **TS_SEARCH_03:** Verify product search using an invalid product name.
- **TS_SEARCH_04:** Verify product search with an empty search field.
- **TS_SEARCH_05:** Verify product search using uppercase and lowercase letters.
- **TS_SEARCH_06:** Verify product search using numbers and special characters.
- **TS_SEARCH_07:** Verify product search with leading and trailing spaces.
- **TS_SEARCH_08:** Verify that the search results match the entered keyword.
- **TS_SEARCH_09:** Verify that an appropriate message is displayed when no products match the search.
- **TS_SEARCH_10:** Verify that the user can open a product from the search results.

 **Module: Product Details**

- **TS_DETAILS_01:** Verify that product details open when a product is selected.
- **TS_DETAILS_02:** Verify that the product name is displayed correctly.
- **TS_DETAILS_03:** Verify that the product price is displayed correctly.
- **TS_DETAILS_04:** Verify that the product image is displayed correctly.
- **TS_DETAILS_05:** Verify that the product description is displayed correctly, if available.
- **TS_DETAILS_06:** Verify that product availability or stock information is displayed correctly, if available.
- **TS_DETAILS_07:** Verify that product category information is displayed correctly, if available.
- **TS_DETAILS_08:** Verify that the Add to Cart option works from the product details page, if available.
- **TS_DETAILS_09:** Verify that the user can navigate back to the product listing.
- **TS_DETAILS_10:** Verify that the product details page displays correctly after refreshing the page.

 **Module: Shopping Cart**

- **TS_CART_01:** Verify that a user can add a product to the shopping cart.
- **TS_CART_02:** Verify that the selected product is displayed correctly in the cart.
- **TS_CART_03:** Verify that a user can add multiple products to the cart.
- **TS_CART_04:** Verify that a user can remove a product from the cart.
- **TS_CART_05:** Verify that the cart total is calculated correctly.

 **Module: Checkout**

- **TS_CHECKOUT_01:** Verify that a user can proceed to checkout with products in the cart.
- **TS_CHECKOUT_02:** Verify that the checkout page displays the correct order details.
- **TS_CHECKOUT_03:** Verify that required delivery details are validated.
- **TS_CHECKOUT_04:** Verify that a user can place an order with valid details.
- **TS_CHECKOUT_05:** Verify that an appropriate message is displayed after successful order placement.

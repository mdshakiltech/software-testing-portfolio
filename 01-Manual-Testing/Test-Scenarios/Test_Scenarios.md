# ShoppersStack - Test Scenarios

## 1. Signup / Registration

| Scenario ID | Test Scenario |
|---|---|
| TS-SIGNUP-001 | Verify that a new user can register with valid details |
| TS-SIGNUP-002 | Verify signup with all mandatory fields left blank |
| TS-SIGNUP-003 | Verify email field with valid email format |
| TS-SIGNUP-004 | Verify email field with invalid email format |
| TS-SIGNUP-005 | Verify password field validation |
| TS-SIGNUP-006 | Verify confirm password field validation |
| TS-SIGNUP-007 | Verify password and confirm password mismatch |
| TS-SIGNUP-008 | Verify registration with an already registered email |
| TS-SIGNUP-009 | Verify password is masked |
| TS-SIGNUP-010 | Verify signup button functionality |

## 2. Login

| Scenario ID | Test Scenario |
|---|---|
| TS-LOGIN-001 | Verify login with valid credentials |
| TS-LOGIN-002 | Verify login with invalid email/username |
| TS-LOGIN-003 | Verify login with invalid password |
| TS-LOGIN-004 | Verify login with blank email/username |
| TS-LOGIN-005 | Verify login with blank password |
| TS-LOGIN-006 | Verify login with both fields blank |
| TS-LOGIN-007 | Verify password is masked |
| TS-LOGIN-008 | Verify login button functionality |
| TS-LOGIN-009 | Verify error message for invalid credentials |
| TS-LOGIN-010 | Verify user can access the application after successful login |

## 3. Home Page

| Scenario ID | Test Scenario |
|---|---|
| TS-HOME-001 | Verify home page loads successfully |
| TS-HOME-002 | Verify logo is displayed correctly |
| TS-HOME-003 | Verify navigation menu works correctly |
| TS-HOME-004 | Verify product categories are displayed |
| TS-HOME-005 | Verify product images are displayed correctly |
| TS-HOME-006 | Verify links/buttons on the home page work correctly |

## 4. Product Search

| Scenario ID | Test Scenario |
|---|---|
| TS-SEARCH-001 | Verify search with a valid product name |
| TS-SEARCH-002 | Verify search with an invalid product name |
| TS-SEARCH-003 | Verify search with blank search field |
| TS-SEARCH-004 | Verify search results are relevant to the search keyword |
| TS-SEARCH-005 | Verify search functionality with partial product name |

## 5. Product Details

| Scenario ID | Test Scenario |
|---|---|
| TS-PRODUCT-001 | Verify product details page opens successfully |
| TS-PRODUCT-002 | Verify product name is displayed correctly |
| TS-PRODUCT-003 | Verify product price is displayed correctly |
| TS-PRODUCT-004 | Verify product image is displayed correctly |
| TS-PRODUCT-005 | Verify product description is displayed correctly |
| TS-PRODUCT-006 | Verify Add to Cart functionality |
| TS-PRODUCT-007 | Verify Add to Wishlist functionality |

## 6. Cart

| Scenario ID | Test Scenario |
|---|---|
| TS-CART-001 | Verify product can be added to cart |
| TS-CART-002 | Verify added product is displayed in cart |
| TS-CART-003 | Verify product quantity can be increased |
| TS-CART-004 | Verify product quantity can be decreased |
| TS-CART-005 | Verify product can be removed from cart |
| TS-CART-006 | Verify cart total is calculated correctly |
| TS-CART-007 | Verify cart is updated after modifying quantity |

## 7. Wishlist

| Scenario ID | Test Scenario |
|---|---|
| TS-WISHLIST-001 | Verify product can be added to wishlist |
| TS-WISHLIST-002 | Verify wishlisted product is displayed |
| TS-WISHLIST-003 | Verify product can be removed from wishlist |
| TS-WISHLIST-004 | Verify wishlist works for logged-in user |

## 8. Address

| Scenario ID | Test Scenario |
|---|---|
| TS-ADDRESS-001 | Verify user can add a new address |
| TS-ADDRESS-002 | Verify mandatory address fields validation |
| TS-ADDRESS-003 | Verify user can edit an existing address |
| TS-ADDRESS-004 | Verify user can delete an address |
| TS-ADDRESS-005 | Verify invalid address details are handled correctly |

## 9. Checkout

| Scenario ID | Test Scenario |
|---|---|
| TS-CHECKOUT-001 | Verify user can proceed to checkout |
| TS-CHECKOUT-002 | Verify checkout with valid address |
| TS-CHECKOUT-003 | Verify checkout without selecting an address |
| TS-CHECKOUT-004 | Verify order summary is displayed correctly |
| TS-CHECKOUT-005 | Verify total amount is calculated correctly |

## 10. Order

| Scenario ID | Test Scenario |
|---|---|
| TS-ORDER-001 | Verify user can place an order |
| TS-ORDER-002 | Verify order confirmation is displayed |
| TS-ORDER-003 | Verify placed order appears in order history |
| TS-ORDER-004 | Verify order details are displayed correctly |

## 11. Logout

| Scenario ID | Test Scenario |
|---|---|
| TS-LOGOUT-001 | Verify user can logout successfully |
| TS-LOGOUT-002 | Verify user is redirected after logout |
| TS-LOGOUT-003 | Verify protected pages cannot be accessed after logout |

## 12. UI and Navigation

| Scenario ID | Test Scenario |
|---|---|
| TS-UI-001 | Verify UI elements are displayed correctly |
| TS-UI-002 | Verify buttons are clickable |
| TS-UI-003 | Verify navigation links work correctly |
| TS-UI-004 | Verify application layout on different screen sizes |
| TS-UI-005 | Verify spelling and labels across the application |

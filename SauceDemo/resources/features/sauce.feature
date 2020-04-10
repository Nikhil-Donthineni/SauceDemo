Feature: Sauce Login

@tc_1_login
Scenario Outline: Login with valid credentials
  Given User  launch Chrome browser
  When Login Saucedemo page opened
  And User enters email as "<email>" and password as "<password>"
  And Click on Login
  And Close Browser
  
   Examples:
       |email           |password       |
       |standard_user   |secret_sauce   |
       |saucedemo       |demosauce      |
       
@tc_2_addtocart
Scenario: Add items to cart
  Given User launch Chrome Browser
  When Page is opened
  Then Add items to cart
  And Close browser 
  
@tc_3_ContinueShopping
Scenario: Continue to shop
Given User launch chrome browser
When Page is Opened
Then Add item to cart
And Continue shopping
Then Select another item
And Close the browser

@tc_4_RemoveItems
Scenario: Remove items from cart
Given User launches the  Chrome Browser
When Web Page is opened
Then Select the items
Then Go to cart
Then Remove the items
And Close the page

@tc_5_Buy
Scenario: To buy a product
Given Launch Chrome Browser
When Sauce page is opened 
Then Choose the item
And Move to cart
Then Checkout and give firstname as "steve" and lastname as  "rogers" and zipcode as "12345"
Then  Complete the process

@tc_6_Logout
Scenario: Logout from website
Given To launch Chrome browser
When Saucedemo is opened
Then Select the options
And Logout from website

@tc_7_datadrivenlogin
Scenario: login through excel
Given launch the chrome browser
When SauceDemo page is opened
Then Enter the email and password
Then click on login button
And close the browser

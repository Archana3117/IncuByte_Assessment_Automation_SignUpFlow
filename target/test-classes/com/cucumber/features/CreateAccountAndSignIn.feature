Feature: Account Creation and Sign In

  Scenario: User Create a new account

  Given User is on the home page
  When User click on CreateAccount which is on Home page
  When User enter firstName as "DavidS" into the firstName field
  When User enter lastName as "Js"   into the lastName field
  When User enter email as "DavidS123@gmail.com" into the email field
  When User enter password as "DavidS@1234"  into the password field
  When User enter confirm password "DavidS@1234" into the confirm password field
  Then User click on create Account button
  Then Account should get successfully created
  Then the new page URL should contain "https://magento.softwaretestingboard.com/customer/account/"
  Then the new page contain text "Thank you for registering with Main Website Store."
  
  Scenario: User Sign in with the created account
  
  
    Given User is on the home page SignIn
    Then click on signin
    Then User enter email as "DavidS123@gmail.com"
    And User enter password as "DavidS@1234"
    Then click on signinbutton
    Then the new page URL should contain "https://magento.softwaretestingboard.com/customer/account/"

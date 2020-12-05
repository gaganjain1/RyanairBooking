Feature: Login into the application

   Scenario: Successful Login with Valid Credentials
   Given User Launch Chrome Driver
   When User opens URL "https://www.ryanair.com/ie/en"
   And User accepts cookies
   And User clicks on Log in link
   And User enters Email as "TestRyanair12@gmail.com" and Password as "Test@123"
   Then Click on Login button
   
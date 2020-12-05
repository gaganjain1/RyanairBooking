Feature: Adding Passenger Details

Scenario: Adding Passenger details after searching a flight
         Given User Launch Chrome Driver
         When User opens URL "https://www.ryanair.com/ie/en"
         And User accepts cookies
         And User clicks on Log in link
         And User enters Email as "Testryanair14@gmail.com" and Password as "Test@123"
         Then Click on Login button
         When User gets redirected to Flight Search Page
		 And User selects One way search radio button 
		 And User selects booking from Dublin to Amsterdam for single adult
		 And User clicks on Search button 
		 And User selects available flight
         Then Select Fare type
         When User selects Title Dropdown
         And User enters FirstName as "Gagan" and LastName as "Jain"
		 And User clicks on Continue button
		 And User selects seat allocation option
		 And User selects Cabin Bag option
		 And User selects extra options and continue
		 And User clicks on View Basket icon
		 And User clicks on Checkout button
Feature: Searching flight

Scenario: Search a flight on https://www.ryanair.com/ie/en 
         Given User Launch Chrome Driver
         When User opens URL "https://www.ryanair.com/ie/en"
         And User accepts cookies
         And User clicks on Log in link
         And User enters Email as "TestRyanair12@gmail.com" and Password as "Test@123"
         Then Click on Login button
         When User gets redirected to Flight Search Page
		 And User selects One way search radio button 
		 And User selects booking from Dublin to Amsterdam for single adult
		 And User clicks on Search button 
		 And User selects available flight
         Then Select Fare type
# RyanairBooking
Summary: This project automates a flight booking up to a declined payment on https://www.ryanair.com/ie/en/

Ryanair Flight Booking System using Java
Cucumber + Junit + Selenium
Hybrid Framework (BDD approach)

Important Information: In case a test fail due to incorrect email address, please enter a new valid email address and password in all feature files. The reason behind that is sometimes the application blocks the user due to providing invalid credit card details. 


Step 1: Setup & Configuration
1.	JDK
2.	Eclipse
3.	Cucumber plugin & Natural plugin in Eclipse through Market place
4.	Set Environment variables
    

Step 2: Create Maven Project and Update pom.xml file with below depenedencies
    
         1. Cucumber-Core
         2. Cucumber-html
         3. cobertura code coverage
         4. Cucumber-java
         5. Cucumber-junit
         6. Cucumber-jvm-deps
         7. Cucumber-reporting
         8. Hamcrest-core
         9. Gherkin
         10. Junit
         11. Selenium-java
         12. Log4j

Step 3: Create Folder Structure
  
       Project Name
            |
            Features (Folder)
            |
            pageObjects (Package)
            |
            stepDefinitions (Package)
            |
            testRunner (Package)
            |
            utilities (Package)
            |
            Drivers (Folder)
            |
            Targets (Reports)
            |
            Logs (Folder)
            |
            Config.properties (File)
            |
            pom.xml
Step 4: Copy all drivers into “Drivers” folder

Step 5: Create BaseClass.java class inside stepDefinitions package.
- We will mention all common methods inside our base class and will inherit them in other classes using extends keyword

Step 6: Automating Login Test
- Create a Login.feature under Feature folder 
- Create Page Object class LoginPage.java under pageObjects package
- Create “Steps.java” under stepDefinitions package and implement  methods required to login
- Create TestRun.java under testRunner package

Step 7: Automating Flight Search Test
- Create a flightSearch.feature under Feature folder 
- Create Page Object class “FlightSearchPage.java” under pageObjects package
- Implement required methods related to Flight Search fucntionality in “Steps.java” class


Step 8: Automating Passenger Details Test
- Create a passengerDetails.feature under Feature folder 
- Create Page Object class “PassengerDetailsPage.java” under pageObjects package
- Implement required methods related to Passenger details page fucntionality in “Steps.java” class

Step 9: Automating Payment Details Test
- Create a paymentDetails.feature under Feature folder 
- Create Page Object class “PaymentDetailsPage.java” under pageObjects package
- Implement required methods related to Payment details page fucntionality in “Steps.java” class

Step 10: Adding logs using Log4j API
- Create log4j.properties file in project home directory and some logger and appender log4j commands

Step 11:  Setup config.properties file and mention browser information so that tests can run on desired browser

Step 12: How to Run these tests. We cam run Tests build by using various methods mentioned below
- Using paymentDetails.feature file. Right click on feature file and run as Junit
- Using pom.xml. We just need to add maven-compiler-plugin
- Using command prompt – we need to download and install Apache Maven on Windows OS. Then we just need to run ‘mvn clean install’ command and our test will run automatically
- Using run.bat file. We will create a run.bat file at project location and will type same cmd commands as we did in previous step
- Run our test build with the help of Jenkins. Specify the pom.xml location or github repository location and run the build from Jenkins


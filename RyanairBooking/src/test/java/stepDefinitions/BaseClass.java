package stepDefinitions;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.FlightSearchPage;
import pageObjects.LoginPage;
import pageObjects.PassengerDetailsPage;
import pageObjects.PaymentDetailsPage;

public class BaseClass {
	// Global variables
		public WebDriver driver;
		public LoginPage lp; // Creating LoginPage object
		public FlightSearchPage fp; // Creating FlightSearchPage object
		public PassengerDetailsPage pp; // Creating PassengerDetailsPage object
        public PaymentDetailsPage payment; // // Creating PaymentDetailsPage object
        public static Logger logger; // Creating a logger class object
        public Properties configProp; // Creating a variable to represent config.properties file
}

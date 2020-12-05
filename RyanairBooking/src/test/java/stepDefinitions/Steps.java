package stepDefinitions;



import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*; // * is regular expression which will match with all the keywords

import pageObjects.FlightSearchPage;
import pageObjects.LoginPage;
import pageObjects.PassengerDetailsPage;
import pageObjects.PaymentDetailsPage;



public class Steps extends BaseClass
{
	// Cucumber 'Before' annotation
	@Before
	public void setup() throws IOException
	{
		// Added loggers to our project
		logger = Logger.getLogger("RyanairBooking"); 
		PropertyConfigurator.configure("log4j.properties");
		
		// Reading config.properties file
		configProp=new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		
				
		String br= configProp.getProperty("browser");
				
		if(br.equals("chrome"))
		{
				
		System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
				driver = new ChromeDriver(); // Launching chrome browser
				
		}
				
		else if(br.equals("firefox"))
		
		{
			
		System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
		driver = new FirefoxDriver(); // Launching firefox browser
				
		}
				
		else if(br.equals("ie"))
		{
				
		System.setProperty("webdriver.ie.driver", configProp.getProperty("iepath"));
		driver = new InternetExplorerDriver(); // Launching ie browser
				
		}
	
		
				logger.info("******  Launching Browser ******");
				driver.manage().window().maximize();
	}
	

	@Given("User Launch Chrome Driver")
	public void user_launch_chrome_driver() 
	{
		
		
		lp = new LoginPage(driver); // Passing the driver
		
		
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	{
		
		driver.get(url);
		logger.info("******  Opening URL ******");
	}
	
	@When("User accepts cookies")
	public void user_accepts_cookies() throws InterruptedException 
	{
		lp.clickCookieLink();
		logger.info("******  Cookie link is clicked ******");
	    
	}

	@When("User clicks on Log in link")
	public void user_clicks_on_log_in_link() 
	
	{
		
		logger.info("******  Clicking Login Link ******");
		lp.clickLoginLink();
		
	    
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) 
	{
		logger.info("******  Providing login details ******");
		lp.setUserName(email);
		lp.setPassword(password);
	    
		logger.info("******  Email id and Password entered ******");
	}

	@Then("Click on Login button")
	public void click_on_login_button() 
	{
		
		lp.clickLoginButton();
		logger.info("******  Clicking on Login button ******");
	}
	
	
	
	// Flight Search step definition

	@When("User gets redirected to Flight Search Page")
	public void user_gets_redirected_to_flight_search_page() throws InterruptedException 
	{
		logger.info("******  Successfully Login ******");
	
	   fp = new FlightSearchPage(driver);
	  Assert.assertEquals("Official Ryanair website | Cheap flights from Ireland | Ryanair", fp.getPageTitle() );

	   }
	
	@When("User selects One way search radio button")
	public void user_selects_one_way_search_radio_button() throws InterruptedException 
	{
	    Thread.sleep(5000);
		fp.selectOneWayRadioButton();
	}

	@When("User selects booking from Dublin to Amsterdam for single adult")
	public void user_selects_booking_from_dublin_to_amsterdam_for_single_adult() throws InterruptedException 
	{
		logger.info("******  Providing flight details ******");
	
		fp.clickDepartureLink();
		
		fp.selectDepartureCountry();
		
	
		fp.selectDepartureAirport();
		
		fp.clickDestinationLink();
		
	
		fp.selectDestinationCountry();

		fp.selectDestinationAirport();
		
		Thread.sleep(5000);
		fp.chooseDateField();
		
		fp.selectDepartureDate();
		
		
	}
	
	

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() 
	{
		logger.info("******  Clicking on Search button ******");
		fp.clickSearchButton();
	    
	}
	

	@When("User selects available flight")
	public void user_selects_available_flight() throws InterruptedException 
	{
	
		fp.selectAvailableFlight();
	    
	}
	
	@Then("Select Fare type")
	public void select_fare_type() throws InterruptedException {
	
		fp.selectFareType();
	}
	
	
	
	// Passenger Details Step Definition

	
	@When("User selects Title Dropdown")
	public void user_selects_title_dropdown() throws InterruptedException 
	{
	
		pp = new PassengerDetailsPage(driver);
		
		pp.clickTitleDropdown();
		
		pp.selectMrTitle();
	    
	}
	
	@When("User enters FirstName as {string} and LastName as {string}")
	public void user_enters_first_name_as_and_last_name_as(String firstname, String lastname) throws InterruptedException 
	{
		logger.info("******  Providing First name and Last name ******");
	
		pp.setFirstName(firstname);
		pp.setLastName(lastname);
		
	    
	}

	
	
	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() throws InterruptedException 
	{

	 pp.clickContinueButton();  
	}
	

	@When("User selects seat allocation option")
	public void user_selects_seat_allocation_option() throws InterruptedException 
	{
	
		pp.chooseSeatSelectionOption();
		pp.confirmSeatSelection();
		
	}

	@When("User selects Cabin Bag option")
	public void user_selects_cabin_bag_option() throws InterruptedException 
	{
		Thread.sleep(3000);
		logger.info("******  Selecting cabin bag details ******");
		pp.chooseBagSelectionRadioButton();
		
		pp.clickBagSelectionContinueButton();
		
	    
	}
	
	@And("User selects extra options and continue")
	public void user_selects_extra_options_and_continue() throws InterruptedException 
	{
		Thread.sleep(5000);
		pp.clickExtrasSelectionContinueButton();
	  
	    
	}

	@When("User clicks on View Basket icon")
	public void user_clicks_on_view_basket_icon() throws InterruptedException 
	{
		Thread.sleep(5000);
		pp.clickViewBasketIcon();
		
		
	}

	@When("User clicks on Checkout button")
	public void user_clicks_on_checkout_button() throws InterruptedException 
	{
		logger.info("******  Clicking on Checkout button ******");
		pp.clickCheckoutButton();
	    
	}
	
	
	
	// Payment Details Step Definition
	
	@When("User selects country code and phone number as {string}")
	public void user_selects_country_code_and_phone_number_as(String num) throws InterruptedException 
	{
		
		payment = new PaymentDetailsPage(driver); // Passing the driver
		
	
		payment.enterTelNumber(num);
	}

	@When("User selects Insurance option")
	public void user_selects_insurance_option() 
	{
		payment.selectInsuranceOption();
	    
	}

	@When("User enters Credit Card number as {string} , month , year, Security Code as {string} and Cardholder name as {string}")
	public void user_enters_credit_card_number_as_month_year_security_code_as_and_cardholder_name_as(String cnum, String sc, String cname)
	{
		logger.info("******  Providing card details ******");
	    payment.enterCardNumber(cnum);
	    payment.selectCardMonth();
	    payment.clickSelectedMonth();
	    payment.selectCardYear();
	    payment.clickSelectedYear();
	    
	    payment.enterCVV(sc);
	    payment.enterCardHolderName(cname);
	}

	@When("User enters Billing address as {string} , City as {string} , Country as Ireland and PostCode as {string}")
	public void user_enters_billing_address_as_city_as_country_as_ireland_and_post_code_as(String ad, String ct, String post) throws InterruptedException 
	{
		logger.info("******  Providing billing address details ******");
	    payment.enterAddress(ad);
	 
	    payment.enterCity(ct);
	    payment.selectCountry();
	    Thread.sleep(3000);
	    payment.enterPostalCode(post);
	}

	@When("User selects terms and conditions")
	public void user_selects_terms_and_conditions() 
	{
		payment.selectTermsCheckBox();
	    
	}

	@When("User clicks on Pay now button")
	public void user_clicks_on_pay_now_button() throws InterruptedException 
	{
          payment.clickPayNowButton();
          Thread.sleep(2000);
	}

	@Then("User should get Transaction could not be processed message")
	public void user_should_get_transaction_could_not_be_processed_message() throws InterruptedException 
	{
		 Thread.sleep(10000);
	
		 
		String actual_error = driver.findElement(By.xpath("//div[@class='b2 ng-star-inserted']")).getText();
		String expected_error="Transaction could not be processed. Your payment was not authorised therefore we could not complete your booking. Please ensure that the information was correct and try again or use a new payment card.";
		
		Assert.assertEquals(expected_error, actual_error);
		 
		if(actual_error.equals(expected_error))
		{
		  logger.info("Error message verified. All test cases are passed");
			
		}
		
		else
		{
			
		        logger.info("Error message is not verified. Test case failed");
					
			
			
		}
	    
	}
	
	
	
	
}

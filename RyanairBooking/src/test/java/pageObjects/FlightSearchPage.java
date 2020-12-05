package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class FlightSearchPage {


	public WebDriver ldriver;
	WaitHelper waitHelper;
	
	public FlightSearchPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waitHelper = new WaitHelper(ldriver); // Creating an object of WaitHelper class
		
	}
	
	@FindBy(xpath="//label[contains(text(),'One way')]")
	@CacheLookup
	WebElement oneWay;
	
	@FindBy(xpath="//input[@id='input-button__departure']")
	@CacheLookup
	WebElement departure;
	
	
	@FindBy(xpath="//span[contains(text(),'Ireland')]")
	@CacheLookup
	WebElement departureCountry;
	
	@FindBy(xpath="//span[contains(text(),'Dublin')]")
	@CacheLookup
	WebElement departureAirport;
	
	
	@FindBy(xpath="//input[@id='input-button__destination']")
	@CacheLookup
	WebElement destination;
	
	@FindBy(xpath="//span[contains(text(),'Netherlands')]")
	@CacheLookup
	WebElement destinationCountry;
	
	@FindBy(xpath="//span[contains(text(),'Amsterdam')]")
	@CacheLookup
	WebElement destinationAirport;
	
	@FindBy(xpath="//div[contains(text(),'Choose date')]")
	@CacheLookup
	WebElement dateField;
	
	@FindBy(xpath="//div[@data-id='2021-01-10']")
	@CacheLookup
	WebElement departureDate;
	
	@FindBy(xpath="//ry-spinner[contains(text(),'Search')]")
	@CacheLookup
	WebElement searchButton;
	
	@FindBy(xpath="//div[@class='card-info__cols-container']")
	@CacheLookup
	WebElement availableFlight;
	
	@FindBy(xpath="//span[contains(text(),'Continue with Value fare')]")
	@CacheLookup
	WebElement fareType;
	
	
	public String getPageTitle()
	{
		
		return ldriver.getTitle();
		
	}
	
	
	public void selectOneWayRadioButton()
	{
		// waitHelper.WaitForElement(oneWay, 30);
		oneWay.click();
	}
	
	
	public void clickDepartureLink()
	{
		waitHelper.WaitForElement(departure, 30);
		departure.click();
	}
	
	public void selectDepartureCountry()
	{
		waitHelper.WaitForElement(departureCountry, 30);
		departureCountry.click();
	}
	
	public void selectDepartureAirport()
	{
		waitHelper.WaitForElement(departureAirport, 30);
		departureAirport.click();
	}
	
	
	public void clickDestinationLink()
	{
		waitHelper.WaitForElement(destination, 30);
		destination.click();
	}
	
	public void selectDestinationCountry()
	{
		waitHelper.WaitForElement(destinationCountry, 30);
		destinationCountry.click();
	}
	
	
	public void selectDestinationAirport()
	{
		waitHelper.WaitForElement(destinationAirport, 30);
		destinationAirport.click();
	}
	
	
	public void chooseDateField()
	{
		waitHelper.WaitForElement(dateField, 30);
		dateField.click();
	}
	
	
	public void selectDepartureDate()
	{
		waitHelper.WaitForElement(departureDate, 30);
		departureDate.click();
	}
	
	
	public void clickSearchButton()
	{
		waitHelper.WaitForElement(searchButton, 30);
		searchButton.click();
	}
	
	public void selectAvailableFlight()
	{
		waitHelper.WaitForElement(availableFlight, 30);
		availableFlight.click();
	}
	
	public void selectFareType()
	{
		waitHelper.WaitForElement(fareType, 30);
		fareType.click();
	}
	
}

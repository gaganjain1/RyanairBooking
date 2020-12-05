package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;


public class PassengerDetailsPage 
{
public WebDriver ldriver;
WaitHelper waitHelper;
	
	public PassengerDetailsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waitHelper = new WaitHelper(ldriver); // Creating an object of WaitHelper class
	}
	
	
	
	@FindBy(xpath="//button[@class='dropdown__toggle b2']")
	@CacheLookup
	WebElement titleDropdown;
	
	@FindBy(xpath="//button[@class='dropdown-item__link dropdown-item__link--highlighted']")
	@CacheLookup
	WebElement mrTitle;
	
	@FindBy(xpath="//input[@name='formState.passengers.ADT-0.name']")
	@CacheLookup
	WebElement txtFirstName;
	
	
	@FindBy(xpath="//input[@name='formState.passengers.ADT-0.surname']")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	@CacheLookup
	WebElement btnContinue;
	
	@FindBy(xpath="//h4[contains(text(),'Option 2: Random seat allocation')]")
	@CacheLookup
	WebElement seatSelectionOption;
	
	
	@FindBy(xpath="//button[contains(text(),'I want random seat allocation')]")
	@CacheLookup
	WebElement seatSelectionConfirm;
	
	
	@FindBy(xpath="//label[@class='ry-radio-circle-button__label']")
	@CacheLookup
	WebElement bagSelectionRadioButton;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	@CacheLookup
	WebElement bagSelectionContinueButton;
	
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	@CacheLookup
	WebElement extrasSelectionContinueButton;
	
	
	
	@FindBy(xpath="//a[contains(text(),'View basket')]")
	@CacheLookup
	WebElement viewBasketIcon;
	
	@FindBy(xpath="//button[contains(text(),'Check out')]")
	@CacheLookup
	WebElement checkoutButton;
	
	public void clickTitleDropdown()
	{
		waitHelper.WaitForElement(titleDropdown, 30);
		titleDropdown.click();
	}
	
	public void selectMrTitle()
	{
		waitHelper.WaitForElement(mrTitle, 30);
		mrTitle.click();
	}
	
	public void setFirstName(String firstname)
	{
		waitHelper.WaitForElement(txtFirstName, 30);
		txtFirstName.clear();
		txtFirstName.sendKeys(firstname);
	}

	public void setLastName(String lastname)
	{
		waitHelper.WaitForElement(txtLastName, 30);
		txtLastName.clear();
		txtLastName.sendKeys(lastname);
	}
	
	public void clickContinueButton()
	{
		waitHelper.WaitForElement(btnContinue, 30);
		btnContinue.click();
	}
	
	public void chooseSeatSelectionOption()
	{
		waitHelper.WaitForElement(seatSelectionOption, 30);
		seatSelectionOption.click();
	}
	
	public void confirmSeatSelection()
	{
		waitHelper.WaitForElement(seatSelectionConfirm, 30);
		seatSelectionConfirm.click();
	}
	
	
	public void chooseBagSelectionRadioButton()
	{
		waitHelper.WaitForElement(bagSelectionRadioButton, 30);
		bagSelectionRadioButton.click();
	}
	
	
	public void clickBagSelectionContinueButton()
	{
		waitHelper.WaitForElement(bagSelectionContinueButton, 30);
		bagSelectionContinueButton.click();
	}
	
	
	public void clickExtrasSelectionContinueButton()
	{
		 waitHelper.WaitForElement(extrasSelectionContinueButton, 30);
		extrasSelectionContinueButton.click();
	}
	
	
	
	public void clickViewBasketIcon()
	{
		 waitHelper.WaitForElement(viewBasketIcon, 30);
		viewBasketIcon.click();
	}
	
	
	public void clickCheckoutButton()
	{
		 waitHelper.WaitForElement(checkoutButton, 30);
		checkoutButton.click();
	}
	
	
	
	
	
	
}

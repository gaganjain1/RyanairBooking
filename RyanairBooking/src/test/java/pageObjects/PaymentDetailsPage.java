package pageObjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.WaitHelper;

public class PaymentDetailsPage {

	public WebDriver ldriver;
	WaitHelper waitHelper;
	
	public PaymentDetailsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waitHelper = new WaitHelper(ldriver); // Creating an object of WaitHelper class
		
	}
	
	
	 // Was not able to find unique locators for these elements. Hence using relative xpath  
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]"
			+ "/form[1]/div[1]/contact-details[1]/div[1]/div[1]/div[1]/div[2]/ry-input-d[1]/div[1]/input[1]")
	@CacheLookup
	WebElement telNumber;
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[2]/insurance[1]/div[1]/div[3]/div[1]/ry-checkbox[1]/label[1]/div[1]/div[1]")
	@CacheLookup
	WebElement insuranceOption;
	
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/"
			+ "payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/add-method-modal[1]/form[1]/div[1]/div[1]/div[1]/div[2]/card-details[1]/form[1]/ry-input-d[1]/div[1]/input[1]")
	@CacheLookup
	WebElement cardNumber;
	
	
	@FindBy(xpath="//span[contains(text(),'Month')]")
	@CacheLookup
	WebElement cardMonth;
	
	
	@FindBy(xpath="//div[contains(text(),'March')]")
	@CacheLookup
	WebElement selectedMonth;
	
	
	@FindBy(xpath="//span[contains(text(),'Year')]")
	@CacheLookup
	WebElement cardYear;
	
	
	@FindBy(xpath="//div[contains(text(),'2022')]")
	@CacheLookup
	WebElement selectedYear;
	
	@FindBy(xpath="//input[@placeholder='CVV']")
	@CacheLookup
	WebElement cvv;
	
	// Was not able to find unique locators for these elements. Hence using relative xpath 
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]"
			+ "/div[1]/ry-tabs[1]/div[2]/add-method-modal[1]/form[1]/div[1]/div[1]/div[1]/div[2]/card-details[1]/form[1]/ry-input-d[2]/div[1]/input[1]")
	@CacheLookup
	WebElement cardHolderName;
	
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]"
			+ "/add-method-modal[1]/form[1]/div[1]/div[1]/div[2]/billing-address[1]/address-form[1]/form[1]/ry-input-d[1]/div[1]/input[1]")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/"
			+ "payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/add-method-modal[1]/form[1]/div[1]/div[1]/div[2]/billing-address[1]/address-form[1]/form[1]/ry-input-d[3]/div[1]/input[1]")
	@CacheLookup
	WebElement city;
	
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/add-method-modal[1]/form"
			+ "[1]/div[1]/div[1]/div[2]/billing-address[1]/address-form[1]/form[1]/ry-autocomplete[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement countryDropdown;
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]"
			+ "/div[1]/div[1]/ry-tabs[1]/div[2]/add-method-modal[1]/form[1]/div[1]/div[1]/div[2]/billing-address[1]/address-form[1]/form[1]/ry-input-d[4]/div[1]/input[1]")
	@CacheLookup
	WebElement postalCode;
	
	
	@FindBy(xpath="//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[8]/div[1]/"
			+ "terms-and-conditions[1]/div[1]/div[1]/ry-checkbox[1]/label[1]/div[1]/div[1]")
	@CacheLookup
	WebElement termsCheckBox;
	
	
	@FindBy(xpath="//button[contains(text(),'Pay now')]")
	@CacheLookup
	WebElement payNowButton;
	

	
	
	public void enterTelNumber(String tel)
	{
		waitHelper.WaitForElement(telNumber, 30);
		telNumber.clear();
		telNumber.sendKeys(tel);
		
	}
	
	
	public void selectInsuranceOption()
	{
		waitHelper.WaitForElement(insuranceOption, 30);
		insuranceOption.click();
		
	}
	
	
	public void enterCardNumber(String cnumber)
	{
		waitHelper.WaitForElement(cardNumber, 30);
		cardNumber.clear();
		cardNumber.sendKeys(cnumber);
		
	}
	
	public void selectCardMonth()
	{
		waitHelper.WaitForElement(cardMonth, 30);
		cardMonth.click();
		
	}
	
	public void clickSelectedMonth()
	{
		waitHelper.WaitForElement(selectedMonth, 30);
		selectedMonth.click();
		
	}
	
	
	public void selectCardYear()
	{
		waitHelper.WaitForElement(cardYear, 30);
		cardYear.click();
		
	}
	
	public void clickSelectedYear()
	{
		waitHelper.WaitForElement(selectedYear, 30);
		selectedYear.click();
		
	}
	
	public void enterCVV(String code)
	{
		waitHelper.WaitForElement(cvv, 30);
		cvv.clear();
		cvv.sendKeys(code);
		
	}
	
	public void enterCardHolderName(String chname)
	{
		waitHelper.WaitForElement(cardHolderName, 30);
		cardHolderName.clear();
		cardHolderName.sendKeys(chname);
		
	}
	
	public void enterAddress(String add)
	{
		waitHelper.WaitForElement(address, 30);
		address.clear();
		address.sendKeys(add);
		
	}
	
	
	public void enterCity(String cty)
	{
		 waitHelper.WaitForElement(city, 30);
		city.clear();
		city.sendKeys(cty);
		
	}
	
	public void selectCountry() throws InterruptedException
	{
		
		 countryDropdown.click();
		 countryDropdown.sendKeys("Afghanistan");
		 countryDropdown.sendKeys(Keys.ENTER);
	   
      	
		
	}
	
	public void enterPostalCode(String psc)
	{
		waitHelper.WaitForElement(postalCode, 30);
		postalCode.clear();
		postalCode.sendKeys(psc);
		
	}
	
	public void selectTermsCheckBox()
	{
		waitHelper.WaitForElement(termsCheckBox, 30);
		termsCheckBox.click();
		
	}
	
	public void clickPayNowButton()
	{
		waitHelper.WaitForElement(payNowButton, 30);
		payNowButton.click();
		
	}
	
	
	
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class LoginPage 
{
	
	
	
public WebDriver ldriver;
	
WaitHelper waitHelper;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waitHelper = new WaitHelper(ldriver); // Creating an object of WaitHelper class
		
	}


@FindBy(xpath="//button[contains(text(),'Yes, I agree')]")
@CacheLookup
WebElement cookieLink;

@FindBy(xpath="//span[contains(text(),'Log in')]")
@CacheLookup
WebElement lnkLogin;

@FindBy(xpath="//input[@name='email']")
@CacheLookup
WebElement txtEmail;

@FindBy(xpath="//input[@name='password']")
@CacheLookup
WebElement txtPassword;

@FindBy(xpath= "//button[contains(text(),'Log in')]")
@CacheLookup
WebElement btnLogin;

public void clickCookieLink()
{
	waitHelper.WaitForElement(cookieLink, 30);
    cookieLink.click();	
}


public void clickLoginLink()
{
	waitHelper.WaitForElement(lnkLogin, 30);
    lnkLogin.click();	
}

public void setUserName(String uname)
{
	waitHelper.WaitForElement(txtEmail, 30);
	txtEmail.clear();
	txtEmail.sendKeys(uname);
}

public void setPassword(String pwd)

{
   waitHelper.WaitForElement(txtPassword, 30);
   txtPassword.clear();
   txtPassword.sendKeys(pwd);
}


public void clickLoginButton()
{
	waitHelper.WaitForElement(btnLogin, 30);
    btnLogin.click();	
}



}






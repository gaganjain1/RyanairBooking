package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	public WebDriver driver;
	
	public WaitHelper(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	//  Creating method to allow element to wait
	public void WaitForElement(WebElement element, long timeOutInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element)); // This statement will wait till the element is visible on the page
		
	}
}

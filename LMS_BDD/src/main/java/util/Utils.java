package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Utils {
	public WebDriver driver;
	public Utils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitforElement(WebElement element, Duration timeOutInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}

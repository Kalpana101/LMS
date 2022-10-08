package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;


public class ManageUuserPageTest{


	private WebDriver driver;
	
	//Constructor of the page class
	public ManageUuserPageTest(WebDriver driver)
	{
		PageFactory.initElements (driver, this);
		this.driver = driver;
		
	}
	
	// Locators
	@FindBy(xpath= "//input[@id='username']")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(xpath= "//input[@id='password']")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath= "//*[@id=\"login\"]/span[1]")
	@CacheLookup
	WebElement btnSignIn;
	

By linkManage_menu =By.xpath( "/html/body/app-root/app-header/mat-toolbar/button[3]/span[1]");  //click User tab

	
//actions (52:00)
public void setUserName(String uname)
{
	txtusername.sendKeys(uname);
}
public void setPassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}
public void clickLogin() {
	btnSignIn.click();
}

public void clickOnUser()
{
	
	driver.findElement(linkManage_menu).click();
}

public String getpageTitle()
{
	return driver.getTitle();
	
}
}



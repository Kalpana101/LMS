package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ManageUuserPageTest;

public class DriverFactory {

	public WebDriver driver;
	private ManageUuserPageTest manageUuserageTest = new ManageUuserPageTest(DriverFactory.getDriver());
	
	/*
	 * This method is used to initialize the threadlocal driver on the basis
	 * of given browser
	 * @param browser
	 * @Return this will return tlDriver
	 */
	public static ThreadLocal<WebDriver>tlDriver = new ThreadLocal<>();
	
	public DriverFactory(WebDriver driver) {
		PageFactory.initElements (driver, this);
		this.driver = driver;
	}
	public WebDriver init_driver(String browser)
	
	{
		System.out.println(browser);
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
			
		}
		else if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		getDriver().get("https://lms-frontend-phase2.herokuapp.com/");
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	//This is used to get the driver with threadlocal
	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	}
}

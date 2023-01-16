package appHooks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mongodb.MapReduceCommand.OutputType;


import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.types.Scenario;
import util.ConfigReader;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	@Before(order =0)
	public void getProperty()
	{
		configReader = new ConfigReader();
		prop =configReader.init_prop();
		
	}
	@Before(order =1)
		public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory(driver);
		driver = driverFactory.init_driver(browserName); //we have to store with driver, otherwise it will give null
		
	}
	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}
}
/*	@After(order=1)  (43:35)
	public void tearDown(Scenario scenario, Object TakeScreenshot)
	{
		
		if(scenario.isFailed())
		{
			String screenshotName = scenario.getName().replaceAll(" ", " _");
		byte[] sourcePath =((TakesScreenshot)driver).getScreenshotAs(OutType.Bytes);
		scenario.attach(sourcePath,
			
			
			
	//	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	 String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.);
			
		}*/
		
	


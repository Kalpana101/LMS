package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.ManageUuserPageTest;

public class StepbyStepDefinition  {
public WebDriver driver;
	private static String title;
	private ManageUuserPageTest manageUuserageTest = new ManageUuserPageTest(DriverFactory.getDriver());
	
	
	
	@Given("User launch browser")
	public void user_launch_browser() {

	
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 manageUuserageTest = new ManageUuserPageTest(driver);
		 
	}

	@When("User opens URl {string}")
	public void user_opens_u_rl(String url) {
	
		driver.get(url);
	
	}

	@When("User enter the username as {string} and password as {string}")
	public void user_enter_the_username_as_and_password_as(String username, String password) {
		manageUuserageTest.setUserName(username);
		manageUuserageTest.setPassword(password);
	}

	@Then("Click on SignIN")
	public void click_on_sign_in() {
		manageUuserageTest.clickLogin();
	}

	@Given("User is on the Manage user page")
	public void user_is_on_the_manage_user_page() {
		// manageUuserageTest = new ManageUuserPageTest(driver);
	//	manageUuserageTest.clickOnUser();
		
		// title =	manageUuserageTest.getpageTitle();
	//	System.out.println(title);
	    
	}
	@Then("User is on any page after Login")
	public void user_is_on_any_page_after_login() {
	//	 title =	manageUuserageTest.getpageTitle();
	//	System.out.println(title);
	}

	@When("User clicks the Tab {string}")
	public void user_clicks_the_tab(String string) {
		manageUuserageTest.clickOnUser();
		System.out.println(string);
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {
	   
	}

	@Then("User should see the Manage user page title {string}")
	public void user_should_see_the_manage_user_page_title(String string) {
	    
	//	 title =	manageUuserageTest.getpageTitle();
	//	System.out.println(title);
	//	Assert.assertTrue(title.contains(string));
	}
}

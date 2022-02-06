package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

@Test
public class loginTest {
	
	WebDriver driver; 
	//By creating an object 
	// By the name of the Class
	
	public void validUserShouldBeAbleToLoginTest() {
		
		driver = BrowserFactory.init();
		
		//LoginPage loginPage1 = new LoginPage();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickOnSignInButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboardPage();
		
		BrowserFactory.tearDown();
		
	}

	
}

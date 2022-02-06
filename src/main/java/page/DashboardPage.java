package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
WebDriver driver; 
	

	
	public DashboardPage(WebDriver driver) {
		this.driver = driver; 		
		
	}
	
	//Element library
	//WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By USERNAME_FIELD = By.xpath("//*[@id=\"username\"]");
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
	
	
	public void verifyDashboardPage() {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard", "Wrong Page!");
		
	}
}

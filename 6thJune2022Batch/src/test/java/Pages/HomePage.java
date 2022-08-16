package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@CacheLookup
	@FindBy(how=How.XPATH, using = "//*[text()='Welcome FirstName']")
	public WebElement welcomeFirstName;
	
	public void clickWelcome() {
		welcomeFirstName.click();
	}

}

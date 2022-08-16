package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOutPage {
	
	WebDriver driver;
	
	public SignOutPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(how=How.ID, using = "aboutDisplayLink")
	public WebElement about;
	
	@FindBy(how=How.XPATH, using = "//*[text()='Support']")
	public WebElement support;
	
	@FindBy(how=How.XPATH, using = "//*[text()='Logout']")
	public WebElement logout;
	
	public void clickAbout() {
		about.click();
	}
	
	public void clickSupport() {
		support.click();
	}
	
	public void clicklogout() {
		logout.click();
	}

}

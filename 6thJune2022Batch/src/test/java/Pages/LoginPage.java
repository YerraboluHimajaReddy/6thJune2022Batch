package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public By userName_Textbox=By.id("txtUsername"); 

	public By password_Textbox=By.id("txtPassword"); 
	
	public By login_Button=By.id("btnLogin"); 
	
	public By ForgorPassword_Link=By.linkText("Forgot your password?"); 


}

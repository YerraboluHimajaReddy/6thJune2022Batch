package Methods;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;

public class LoginPageMethods {

	WebDriver driver;

	LoginPage lp = new LoginPage(driver);

	public LoginPageMethods(WebDriver driver) {

		this.driver = driver;
	}

	public void enterUserName() {

		driver.findElement(lp.userName_Textbox).sendKeys("Admin");
	}

	public void enterPassword(String password) {

		driver.findElement(lp.password_Textbox).sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(lp.login_Button).click();
	}

	public void clickForgotpassword() {

		driver.findElement(lp.ForgorPassword_Link).click();
	}
}

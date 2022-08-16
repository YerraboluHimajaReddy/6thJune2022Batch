package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.ForgotPasswordPageMethods;
import Methods.LoginPageMethods;

public class ForgorPassword {

	public WebDriver driver;
	
	LoginPageMethods lpm;
	
	ForgotPasswordPageMethods fpm;
	
	@BeforeSuite
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		lpm=new LoginPageMethods(driver);
		
		fpm=new ForgotPasswordPageMethods(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test
	public void clickForgotPassword() {
		
		System.out.println(driver.getTitle());
		lpm.clickForgotpassword();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void enterDatainForgotPasswordPage() {
		
		fpm.enterOrangeHRMUserName();
		fpm.clickCancel();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		//driver.close();
	}
}

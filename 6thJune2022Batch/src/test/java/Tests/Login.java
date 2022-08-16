package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.LoginPageMethods;

public class Login {

	public WebDriver driver;
	
	LoginPageMethods lpm;
	
	@BeforeSuite
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		lpm=new LoginPageMethods(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test
	public void enterCredentials() {
		
		lpm.enterUserName();
		lpm.enterPassword("admin123");
		lpm.clickLogin();
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	}
}

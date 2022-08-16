package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.LoginPageMethods;
import Pages.HomePage;
import Pages.SignOutPage;

public class LoginAndLogout {

	public WebDriver driver;

	LoginPageMethods lpm;

	HomePage hp;

	SignOutPage sp;

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		// page object model

		lpm = new LoginPageMethods(driver);

		// page factory

		hp = PageFactory.initElements(driver, HomePage.class);

		sp = PageFactory.initElements(driver, SignOutPage.class);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}

	@Test(priority = 0)
	public void enterCredentials() {

		lpm.enterUserName();
		
		lpm.enterPassword("admin123");
		
		lpm.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 1)
	public void logout() {
		
		hp.clickWelcome();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		sp.clicklogout();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}

	@AfterSuite
	public void closeBrowser() {

		driver.close();
	}
}

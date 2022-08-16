package TestNg_Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_TestNg {

	public WebDriver driver;
	
	SoftAssert assertion = new SoftAssert();

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@BeforeClass
	public void maximizeBrowser() {

		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void waitTime() {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		System.out.println("In before method");
	}

	@Test(priority = 0)
	public void openURL() {

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	}

	@Test(priority = 1)
	public void verifyPageTitle() {

		

		// to verify positive testing
		
		String actual = "Gmail";

		String expected = driver.getTitle();

		assertion.assertEquals(actual, expected);

		System.out.println("Both actual and expected are same");
		
		assertion.assertAll();
		
	}
	
	@Test(priority = 2)
	public void verifyPageTitle_Negative() {

		String actual = "Testing";

		String expected = driver.getTitle();

		assertion.assertEquals(actual, expected ," actual and expected are not same ");

		System.out.println("Both actual and expected are not  same");
		
		assertion.assertAll();

	}
	
	@Test(priority = 3)
	public void verifyPageTitle_NotEquals() {

		String actual = "Testing";

		String expected = driver.getTitle();

		assertion.assertNotEquals(actual, expected ," actual and expected are same in not equals method ");

		System.out.println("Both actual and expected are  same in not equals method");
			
		assertion.assertAll();

	}

	@AfterMethod
	public void waitTime1() {
		

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		System.out.println("In After method");
	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();

	}

}

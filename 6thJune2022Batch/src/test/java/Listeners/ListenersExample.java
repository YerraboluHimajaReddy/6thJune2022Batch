package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ListenersExample extends SeleniumWebDriverListeners {
	
	public static ExtentTest test;
	public static ExtentReports report;
	public WebDriver driver;

	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\Listeners.html");
		test = report.startTest("ExtentDemo");
	}
	
	@BeforeSuite
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void verifyGoogle() {
		
		
		beforeNavigateTo("https://www.google.co.in", driver);
		
		afterNavigateTo("https://www.google.co.in", driver);

		driver.manage().window().maximize();

		if (driver.getTitle().equals("Himaja")) {
			
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, " extentReportsDemo Test Failed");
		}
		
		
	}
	
	@Test
	public void verifyDate() {
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		beforeClickOn(driver.findElement(By.id("datepicker")), driver);
		
		driver.findElement(By.id("datepicker")).click();
		
		afterClickOn(driver.findElement(By.id("datepicker")), driver);

	}
	
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}

	@AfterSuite
	public void closeBrowser() {

		driver.close();
	}
	
	


}

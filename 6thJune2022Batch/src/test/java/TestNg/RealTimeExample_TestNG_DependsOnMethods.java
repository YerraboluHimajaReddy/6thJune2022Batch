package TestNg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RealTimeExample_TestNG_DependsOnMethods {

	public WebDriver driver;

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

	@Test()
	public void openURL() {

		driver.get("https://demoqa.com/browser-windows");

	}

	@Test(dependsOnMethods = "openURL")
	public void clickWindowButton() {

		 driver.findElement(By.id("windowButton")).click();
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

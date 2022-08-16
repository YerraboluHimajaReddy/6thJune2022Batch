package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelTesting_Example2 extends DriverExtensions {
	
	@BeforeSuite
	public void launchBrowser() {

		launchBrowser("edge");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void openURL() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void enterCredentails() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}
	
	@Test
	public void clickLogin() {
		
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
	}
}

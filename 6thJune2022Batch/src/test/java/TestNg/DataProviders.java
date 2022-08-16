package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends DriverExtensions {

	@BeforeSuite
	public void launchBrowser() {

		launchBrowser("chrome");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void openURL() {

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@DataProvider(name = "LoginValues")
	public Object[][] defineData() {

		Object[][] values = new Object[4][2]; //object[rows][columns]

		values[0][0] = "Nousheen";
		values[0][1] = "Nousheen123";
		
		values[1][0] = "Himaja";
		values[1][1] = "Himaja123";
		
		values[2][0] = "Sailu";
		values[2][1] = "Sailu123";	
		
		values[3][0] = "Admin";
		values[3][1] = "admin123";

		return values;
	}

	@Test(dataProvider = "LoginValues" , priority = 0)
	public void enterCredentails(String username, String password) {

		driver.findElement(By.id("txtUsername")).clear();
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		
		driver.findElement(By.id("txtPassword")).clear();
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@Test(priority = 1)
	public void clickLogin() {

		driver.findElement(By.id("btnLogin")).click();
	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();
	}

}

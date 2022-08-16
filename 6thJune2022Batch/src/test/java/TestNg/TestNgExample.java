package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample {
	
	WebDriver driver;
	
	@Test
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test
	public void openURL() {		

		driver.get("https://demoqa.com/browser-windows");
		
		driver.close();
		
	}
}

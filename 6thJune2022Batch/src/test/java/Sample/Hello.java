package Sample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to maven 6th june batch");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		WebElement newWindow=driver.findElement(By.id("windowButton"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("windowButton")));
		
		newWindow.click();
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.titleContains("ToolsQA"));
		
		driver.quit();
	}

}

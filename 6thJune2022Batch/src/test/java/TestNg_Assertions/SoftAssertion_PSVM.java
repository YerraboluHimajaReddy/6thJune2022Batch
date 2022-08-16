package TestNg_Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_PSVM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		SoftAssert assertion = new SoftAssert();

		// to verify positive testing
		
		String actual = "Gmail";

		String expected = driver.getTitle();

		assertion.assertEquals(actual, expected);

		System.out.println("Both actual and expected are same");

		System.out.println("==============================");

		// to verify negative testing

		actual = "Testing";

		assertion.assertEquals(actual, expected ,"Both actual and expected are  not same");

		System.out.println("Both actual and expected are  not same");
		
		assertion.assertAll();

		driver.close();

	}

}

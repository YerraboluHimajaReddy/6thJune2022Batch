package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverExtensions {
	
	 public WebDriver driver;
	 
	 DriverExtensions(){
		 
		 this.driver=driver;
	 }
	 
	
	public void launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\himaj\\Desktop\\06thJune2022\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{

			System.setProperty("webdriver.edge.driver", "C:\\Users\\himaj\\Desktop\\06thJune2022\\edgedriver_win64 (3)\\msedgedriver.exe");
			
			 driver=new EdgeDriver();
		}
		
	}

}

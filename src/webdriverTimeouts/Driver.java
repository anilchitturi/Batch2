package webdriverTimeouts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	//static WebDriver driver =null;

	public static WebDriver driverInstance(String browser){
		WebDriver driver =null;
	
		if(browser=="firefox"){
			
			  driver = new FirefoxDriver();

		}
		else if(browser=="chrome"){
			 System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		     driver = new ChromeDriver();
		}
		return driver;
	}

}

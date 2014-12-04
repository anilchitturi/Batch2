package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class Driver {
	public WebDriver driverInstance(String browserType){
		WebDriver driver=null;	
		if(browserType=="firefox"){
		 driver = new FirefoxDriver();}
		else if(browserType=="chrome"){
		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
		driver = new ChromeDriver();
	}
		System.out.println("driver"+driver);
		return driver;
}
	

}

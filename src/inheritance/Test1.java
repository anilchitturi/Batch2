package inheritance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test1 extends Driver{

private static WebDriver driver=null;

	public static void main(String[] args) throws Exception{
		
		/*create a class object instance and getting the driver object
		Driver dv=new Driver();
		driver=dv.dranceInstance("firefox");*/
		
		//getting webdriver instance by extending the base class
		//driver=dranceInstance("firefox");
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("gbqfq"));
		Thread.sleep(10000);
		element.sendKeys("books");
		element.submit();		
		driver.quit();	
	}

}

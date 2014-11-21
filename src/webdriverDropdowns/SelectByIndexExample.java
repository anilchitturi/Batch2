package webdriverDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexExample {

	   public static void main(String [] args)
	{
   	WebDriver driver = new FirefoxDriver();
   	driver.get("file:///C:/Users/anil/Desktop/indexbyvaluesdemo.html");
   	WebElement element=driver.findElement(By.name("Mobiles"));
   	Select se=new Select(element);
   	se.selectByIndex(3);
 	}
}


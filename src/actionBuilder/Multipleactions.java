package actionBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Multipleactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		 Thread.sleep(10000);
		WebElement email_text=driver.findElement(By.id("email"));
		Actions builder= new Actions(driver);
		 Action mosehover=builder.moveToElement(email_text)
				                 .click()
				                 .keyDown(email_text,Keys.SHIFT)
				                 .sendKeys(email_text, "hello")
				                 .keyUp(email_text,Keys.SHIFT)
				                 .doubleClick(email_text)
				                 .contextClick()
				                 .build();
		 mosehover.perform();		 
		 Thread.sleep(10000);
	}

}

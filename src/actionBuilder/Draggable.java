package actionBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		 Thread.sleep(30000);
		WebElement drag_item=driver.findElement(By.id("draggable"));
		 new Actions(driver).dragAndDropBy(drag_item, 120, 120).build().perform();
	}

}

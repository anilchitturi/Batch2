package actionBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;



public class MouseActions {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement home_link=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
		
		Actions builder= new Actions(driver);
		 Action mosehover=builder.moveToElement(home_link).build();
		 String bgcolor=home_link.getCssValue("background-color");
		 System.out.println("Before hover: "+bgcolor );
		 mosehover.perform();		 
		 System.out.println("After hover: "+bgcolor );
		//element.sendKeys("books");
		//element.submit();		
		driver.quit();	
	}

}

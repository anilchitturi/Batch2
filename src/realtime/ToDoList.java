package angularJS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class ToDoList {
	public WebDriver driver;
	@Test
	public void ALaunch(){			
		
		driver=new FirefoxDriver();
			driver.get("https://angularjs.org/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			}
	
	@Test
	public void BADD(){
		
		WebElement ADDBTn=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/div/form/input[2]"));
		
		WebElement ADDText=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/div/form/input[1]"));
		Actions builder= new Actions(driver);
		 Action msehover=builder.moveToElement(ADDBTn)	
				              .build();
		 			msehover.perform();
		ADDText.sendKeys("Selenium"); 			
		ADDBTn.click();
		//Verify that it is added??
		
	}
	 
	
}

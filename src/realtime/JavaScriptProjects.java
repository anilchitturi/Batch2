package realtime;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;


public class JavaScriptProjects{
	public WebDriver driver;
	@Test
	public void ALaunch(){			
		
		driver=new FirefoxDriver();
			driver.get("https://angularjs.org/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			}
	@Test
	public void Click_ADD(){
			
			WebElement ADDSign=driver.findElement(By.xpath("/html/body/div[3]/div[6]/div[2]/div[2]/div/table/thead/tr/th[3]/a/i"));
			Actions builder= new Actions(driver);
			 Action msehover=builder.moveToElement(ADDSign)	
					              .build();
			 			msehover.perform();	
			ADDSign.click();
			
		}
	
	@Test
	public void ProjectDetails(){
		WebElement EnterName=driver.findElement(By.xpath("/html/body/div[3]/div[6]/div[2]/div[2]/div/form/div[1]/input"));
		EnterName.sendKeys("Selenium Project");
		
		WebElement EnterWebsite=driver.findElement(By.xpath("/html/body/div[3]/div[6]/div[2]/div[2]/div/form/div[2]/input"));
		EnterWebsite.sendKeys("https://Selenium.xyz");
		
		WebElement EnterDescrptn=driver.findElement(By.xpath("/html/body/div[3]/div[6]/div[2]/div[2]/div/form/textarea"));
		EnterDescrptn.sendKeys("Selenium Project description ");
		
		WebElement SaveBttn=driver.findElement(By.xpath("/html/body/div[3]/div[6]/div[2]/div[2]/div/form/button[1]"));
		SaveBttn.click();
		
	}

}

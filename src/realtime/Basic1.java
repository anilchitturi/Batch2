package realtime;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.*;
import org.testng.annotations.*;
import junit.framework.Assert;

public class Basic1 {
	public WebDriver driver;
	//WebDriver driver=new FirefoxDriver();
	
	@BeforeSuite
	  public void Launch(){					
		driver=new FirefoxDriver();
			driver.get("https://angularjs.org/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			}
	@Test
	public void A_PAGEDOWN(){
	//WebElement email_text=driver.findElement(By.id("email"));
		WebElement EdtBTn=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/span[2]/form/button"));
		
		Actions builder= new Actions(driver);
		 Action msehover=builder.moveToElement(EdtBTn)	
				              .build();
		 			msehover.perform();
		 				
		 				
		/*Boolean ChkPresence=EdtBTn.isDisplayed();
		
	 				 while(ChkPresence=false) {	 					 
	 					Actions builder= new Actions(driver);
	 					 Action KeyDwn=builder.keyDown(Keys.ARROW_DOWN)	
	 							              .build();
	 					 				KeyDwn.perform();
	 			         
	 			      }*/
	 	//EdtBTn.click();
	 	//driver.switchTo().alert().accept();
	 	//driver.switchTo().alert().dismiss();
	 	}
	
	@Test
	public void B_EnterName(){
		WebElement NameField=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[2]/div/input"));
		/*Actions builder= new Actions(driver);
		 Action msehover1=builder.moveToElement(NameField)	
				              .build();
		 			msehover1.perform();*/
		
		
		NameField.sendKeys("Shruti");
		
		WebElement CheckText=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[2]/div/h1"));
		String TextVal=CheckText.getText();
		Boolean Chk=TextVal.contains("Shruti");
		//Assert.assertThat("albumen", both(containsString("a")).and(containsString("b")));
		//Assert.assertTh
		if(Chk=false){
			System.out.println("Text dosnot contain expected value");
		}else{
			System.out.println("Expected value matched");
		
		}
			
		//Assert.assertEquals(actual, expected, message);
	}
	
}
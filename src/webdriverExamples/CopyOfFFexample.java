package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;



public class CopyOfFFexample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://we2o.org");
		Thread.sleep(20000);
		WebElement home_contanier=driver.findElement(By.id("home-isotope"));
		home_contanier.click();		
		WebElement first_charity=driver.findElement(By.xpath("//*[@id=\"home-isotope\"]/ul[1]/li[1]/div/div[1]/img"));
		Actions action = new Actions(driver);
	        action.moveToElement(first_charity).perform();
			Thread.sleep(10000);
	        ((JavascriptExecutor) driver).executeScript("javascript:document.getElementsByClassName('we2o-red-button')[0].click();");

	}

}

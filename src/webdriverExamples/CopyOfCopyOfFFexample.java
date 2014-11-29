package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CopyOfCopyOfFFexample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://we2o.org");
		Thread.sleep(20000);
		WebElement home_contanier=driver.findElement(By.id("home-isotope"));
		home_contanier.click();
		Thread.sleep(10000);
		WebElement next_btn=driver.findElement(By.xpath("//*[@id='container1']/div[2]/div/div[3]"));
		next_btn.click();
		Thread.sleep(10000);
		WebElement prev_btn=driver.findElement(By.xpath("//*[@id='container1']/div[2]/div/div[2]"));
		prev_btn.click();
	}

}

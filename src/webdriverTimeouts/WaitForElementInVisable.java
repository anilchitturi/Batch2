package webdriverTimeouts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitForElementInVisable {

    private static WebDriver driver;
    

    public static void main(String[] args) throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("file:///E:/waitforvisable.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      //Wait for element invisible
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='text4']")));

        System.out.print("Text box text4 is now invisible"); 
        driver.quit();
    
}
}

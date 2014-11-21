package webdriverTimeouts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitForElementVisable {

    private static WebDriver driver;
    

    public static void main(String[] args) throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("file:///E:/waitforvisable.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //To wait for element visible
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']")));
        
        driver.findElement(By.xpath("//input[@id='text3']")).sendKeys("Text box is visible now");
        System.out.print("Text box text3 is now visible");   
        driver.quit();
    
}
}

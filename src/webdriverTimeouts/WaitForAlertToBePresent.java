package webdriverTimeouts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitForAlertToBePresent {

    private static WebDriver driver;
    

    public static void main(String[] args) throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("file:///E:/waitforalert.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='fnamegdtg']")).sendKeys("My Name");
       
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        
        String alrt = driver.switchTo().alert().getText();
        System.out.print(alrt);
        Thread.sleep(1000);
        driver.quit();
    
}
}

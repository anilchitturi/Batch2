package webdriverTimeouts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitForTitleToBePresent {

    private static WebDriver driver;
    

    public static void main(String[] args) throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("file:///E:/waitforelementpresent.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

        //Wait for page title
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains(": MyTest"));

        //Get and store page title in to variable
        String title = driver.getTitle();
        System.out.print(title);
        driver.quit();
    
}
}

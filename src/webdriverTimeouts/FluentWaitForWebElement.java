package webdriverTimeouts;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FluentWaitForWebElement {

    private static WebDriver driver;
    

    public static void main(String[] args) throws InterruptedException {
    	 WebElement countdown;
        driver = new FirefoxDriver();
        //driver.get("http://stuntsnippets.com/javascript-countdown/");
        driver.get("http://seleniumsimplified.com/testpages/javascript_countdown.html");
    
        driver.navigate().refresh();

        countdown = driver.findElement(By.id("javascript_countdown_time"));

        new WebDriverWait(driver,10).
                until(ExpectedConditions.visibilityOf(countdown));
    
        new FluentWait<WebElement>(countdown).
                withTimeout(10, TimeUnit.SECONDS).
                pollingEvery(100,TimeUnit.MILLISECONDS).
                until(new Function<WebElement, Boolean>() {
                    @Override
                    public Boolean apply(WebElement element) {
                        return element.getText().endsWith("044");
                    }
                }
                );
   
        driver.quit();
    
}
}

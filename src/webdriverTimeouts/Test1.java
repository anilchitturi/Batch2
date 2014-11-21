package webdriverTimeouts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;



public class Test1 extends Driver {

	 private static WebDriver driver = null;
	 
	    public static void main(String[] args) throws InterruptedException {
	    	
//	   Driver dv = new Driver();
//	   driver= dv.driverInstance("firefox");
 	  driver= driverInstance("firefox");

	   System.out.println("printin obejcet driver " +driver);

     // And now use this to visit Google
     driver.get("http://www.google.com");
    /* WebDriver.manage().timeouts()
     * implicitlyWait
     * The ImplicitWait will tell the webDriver to poll the DOM for a certain duration when trying to find the element, this will be useful when certain elements on the webpage will not be available immediately and needs some time to load.
     * By default it ill take the value to 0, for the life of the WebDriver object instance through out the test script. */
     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     
     /*page load timeout
      * set the amount of time to wait for a page load to complete before throwing error,if the timeout is negative,page load can be infinite
      */
     driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
     
     /*setScriptTimeout
      * set the amount of time to wait for a asynchronous script to finish execution,if the timeout is negative,page load can be infinite
      */
     driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
     
     /*fluent wait
      * waiting 30 sec for an element to be present on the page
      * checking for its presence once in every 5 second
      */
     Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    		 .withTimeout(30, TimeUnit.SECONDS)
    		 .pollingEvery(5,TimeUnit.SECONDS)
    		 .ignoring(NoSuchElementException.class);
    		 
     WebElement ele=wait.until
    		 (new Function<WebDriver, WebElement>()
    				 {
    			 		public WebElement apply(WebDriver driver)
    			 		{
    			 			return driver.findElement(By.id("foo"));
    			 		}
    				 }
    		 );
     ele.click();
     
    // Thread.sleep(3000);

     // Find the text input element by its name
     WebElement element = driver.findElement(By.name("q"));

     // Enter something to search for
     element.sendKeys("Cheese!");

     // Now submit the form. WebDriver will find the form for us from the element
     element.submit();

     // Check the title of the page
     System.out.println("Page title is: " + driver.getTitle());

     driver.quit();
	}


}

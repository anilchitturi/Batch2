package webdriverDropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExamples {

	public static void main(String [] args) throws InterruptedException

	{

		WebDriver driver = new FirefoxDriver();    	

	   	driver.get("file:///C:/Users/anil/Desktop/dropdown-select.html");

		WebElement element=driver.findElement(By.name("Mobdevices"));

		Select se=new Select(element);

		//Here we will take multi select dropdown to show you the difference

		se.selectByVisibleText("HTC");

		se.selectByValue("nokia");


		//From the above two commands, in the dropdown two values will be selected.

 		//Now we will try to deselect any of the One

		//Im using thread to see the difference when selecting and selecting

		Thread.sleep(3000);

		se.deselectByValue("nokia");


		//You can deselect the value by specifying the index, value and VisibleText


		//It will work if you the index is already selected

		se.deselectByIndex(1);


		//It will deselect if the visible text HTC is in selected mode

		se.deselectByVisibleText("HTC");


		//It will de-select all the values which are selected

		se.deselectAll();

	}

}


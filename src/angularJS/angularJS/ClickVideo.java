package angularJS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class ClickVideo extends Basic1{
	@Test
	public void BuildAppVideo(){
		WebElement ClickVideo=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[3]"));
		ClickVideo.click();
	}
}

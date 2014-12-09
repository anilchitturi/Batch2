package realtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tv.adap.util.driver.Util;

public class demoExample  {
   private WebDriver driver;

    @FindBy(id="un")
    private WebElement userName;
    @FindBy(id="pw")
    private WebElement password;
    @FindBy(id="btnLogin")
    private WebElement login;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/div/div/div/div/ul[2]/li[5]/a")
    private WebElement loggedInUserName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/form/img")
    private WebElement loginIcon;
    @FindBy(id="errorMsg")
    private WebElement loginErrorMessage;


  
    public void enterCredentials(String userNameTxt, String passwordTxt)
            throws InterruptedException {
        userName.clear();
        userName.sendKeys(userNameTxt);
        password.clear();
        password.sendKeys(passwordTxt);
        login.click();
    }

    public void waitForLoggedInUserName()
            throws InterruptedException {
    }

    public void waitForErrorMsg()
            throws InterruptedException {
    }

    //getters
    public WebElement getLoggedInUserName() {
        return loggedInUserName;
    }

    public WebElement getLoginErrorMessage() {
        return loginErrorMessage;
    }
}
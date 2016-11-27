package Pages;

import DriverFactory.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

/**
 * Created by Student on 12.11.2016.
 */
public class LoginPage extends BasePage {


    
	@FindBy(id="mailbox__login")
	private WebElement loginName;

    @FindBy(id="mailbox__password")
    private WebElement loginPassword;


    @FindBy(id="mailbox__auth__button")
    private WebElement authButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

  public   AfterLoginPage login (String name, String password) throws InterruptedException {
        loginName.sendKeys(name);
         loginPassword.sendKeys(password);
        authButton.click();
      Thread.sleep(2000);
        return new AfterLoginPage(driver);

    }
}
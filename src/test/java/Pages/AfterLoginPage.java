package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Student on 12.11.2016.
 */
public class AfterLoginPage extends BasePage {
    @FindBy(id="PH_user-email")
    private WebElement userEmail;

//    @FindBy(xpath=".//*[@id='def8320ca-4ac9-ce4b-b05c-f069bf8cf58']/div/div/div[2]/div/a")
//    private WebElement writeButton;


    public AfterLoginPage(WebDriver driver) {
        super(driver);
    }

   public String userEmailText(){
        return userEmail.getText();
    }

//    public Button(){
//        writeButton.click();
//        return new AfterSendPage(driver);
//    }
}

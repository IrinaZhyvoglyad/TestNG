package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Student on 13.11.2016.
 */
public class AfterSendPage extends BasePage {

    @FindBy(xpath=".//*[@id='b-compose__sent']/div/div[1]/div")
    private WebElement emailCompose;

    public AfterSendPage(WebDriver driver) {
        super(driver);
    }
}

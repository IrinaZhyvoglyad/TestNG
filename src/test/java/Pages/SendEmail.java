package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Student on 13.11.2016.
 */
public class SendEmail extends BasePage {

    @FindBy(xpath=".//*[@id='def8320ca-4ac9-ce4b-b05c-f069bf8cf58']/div/div/div[2]/div/a")
    private WebElement writeButton;

    @FindBy(xpath=".//*[@id='toolkit-147902451270237composeForm']/div[1]/div/div[3]/div[1]/div/div/div[2]/div")
    private WebElement emailAddress;

    @FindBy(xpath=".//*[@id='toolkit-147902451270237composeForm']/div[1]/div/div[3]/div[4]/div/div/div[2]")
    private WebElement emailTitle;

    @FindBy(id="tinymce")
    private WebElement emailText;

    @FindBy(xpath=".//*[@id='a4bb7a02f-b120-fd78-4b75-98d5676c8fb']/div/div/div[2]/div[1]/div")
    private WebElement sendButton;


    public SendEmail(WebDriver driver) {
        super(driver);
    }

    public   AfterSendPage send (String address, String title, String text) throws InterruptedException {
        writeButton.click();
        emailAddress.sendKeys(address);
        emailTitle.sendKeys(title);
        emailText.sendKeys(text);
        sendButton.click();
        Thread.sleep(2000);
        return new AfterSendPage(driver);
    }
}

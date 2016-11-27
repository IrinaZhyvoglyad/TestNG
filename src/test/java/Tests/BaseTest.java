package Tests;

import DriverFactory.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Student on 12.11.2016.
 */
public class BaseTest {
    WebDriver driver;

    @BeforeSuite
    public void setSuite() throws Exception {
        driver = Drivers.getDriver();


    }

    @AfterSuite
    public void afterSuite() throws Exception {
            driver.quit();
        }

    }


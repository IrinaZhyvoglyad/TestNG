package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Student on 12.11.2016.
 */
public class Drivers {
  public static WebDriver getDriver() {
        WebDriver driver = null;
        String namedriver = System.getProperty("driver");
      if (namedriver != null) {
          switch (namedriver) {
              case "chrome":
                  System.setProperty("webdriver.chrome.driver", "src\\test\\java\\chromedriver.exe");
                  driver = new ChromeDriver();
                  break;
              case "fireFox":
                  System.setProperty("webdriver.chrome.driver", "src\\test\\java\\chromedriver.exe");
                  driver = new FirefoxDriver();
                  break;
          }
      } else {

                System.setProperty("webdriver.chrome.driver", "src\\test\\java\\chromedriver.exe");
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

}

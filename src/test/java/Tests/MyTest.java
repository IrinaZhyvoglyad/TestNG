package Tests;

import Pages.LoginPage;
import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by UITS-Admin on 30.10.2016.
 */
class MyTest extends BaseTest {
    LoginPage loginPage;


    @BeforeClass
    public void setUp() throws Exception {
        driver.get("https://mail.ru/");
        loginPage = new LoginPage(driver);
    }

    @Test
   public void testName() throws Exception {
        //should be returned: start
//       String actual = loginPage.login("irina5331test", "Qwerty1!").userEmailText();
//        Assert.assertEquals(actual,"irina5331test@mail.ru","Error");
//       end

        //should be deleted: start
        driver.get("https://translate.google.ru/");
        System.out.println("CURRENT URL!!!:" + driver.getCurrentUrl());
       // System.out.println("PAGE SOURCE!!!:" + driver.getPageSource());
        System.out.println("TITLE!!!:" + driver.getTitle());
        System.out.println("HANDLE!!!:" + driver.getWindowHandle());
        System.out.println("---");
        driver.getWindowHandles().forEach(System.out::println);
        //end
   }

}

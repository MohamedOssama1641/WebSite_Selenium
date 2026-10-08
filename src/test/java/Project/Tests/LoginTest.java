package Project.Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Project.Factory.DriverFactory;
import org.testng.annotations.Test;
import Project.hooks.hook;
import org.testng.asserts.SoftAssert;

public class LoginTest extends hook {
    @Test
    public void Login(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
        MainPage mainPage = loginPage.Login();
        softAssert.assertEquals(mainPage.Check(),"Add to cart","Error in Login");
        softAssert.assertAll();

    }
}

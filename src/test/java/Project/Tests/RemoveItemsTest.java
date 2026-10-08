package Project.Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Project.Factory.DriverFactory;
import Project.hooks.hook;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RemoveItemsTest extends hook {
    @Test
    public void Removeitems(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
        MainPage mainPage = loginPage.Login();
        softAssert.assertEquals(mainPage.RemoveItems(),"1","Error in Remove");
        softAssert.assertAll();
    }
}

package Project.Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Project.Factory.DriverFactory;
import Project.hooks.hook;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddItemsTest extends hook {
    @Test
    public void Additives(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
        MainPage mainPage = loginPage.Login();
        softAssert.assertEquals(mainPage.AddItems(),"2","Error in Add");
        softAssert.assertAll();
    }
}

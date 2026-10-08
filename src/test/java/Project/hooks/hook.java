package Project.hooks;

import Project.Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class hook {

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        WebDriver driver = DriverFactory.initDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void clear() {
        DriverFactory.quitDriver();
    }
}
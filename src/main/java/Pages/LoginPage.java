package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By UserName = By.id("user-name");
    private final By Password = By.id("password");
    private final By Submit = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage Login(){
        enterText(UserName,"standard_user");
        enterText(Password,"secret_sauce");
        clickElement(Submit);
        return new MainPage(driver);
    }
}

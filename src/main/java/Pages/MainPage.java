package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private final By Item1_Add = By.id("add-to-cart-sauce-labs-backpack");
    private final By Item2_Add = By.id("add-to-cart-sauce-labs-bike-light");
    private final By Item_Remove = By.id("remove-sauce-labs-backpack");
    private final By Number = By.className("shopping_cart_badge");
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String Check(){
        return getElementText(Item1_Add);
    }

    public String AddItems(){
        clickElement(Item1_Add);
        clickElement(Item2_Add);
        return getElementText(Number);  //Number = 2
    }

    public String RemoveItems(){
        clickElement(Item1_Add);
        clickElement(Item2_Add);
        clickElement(Item_Remove);
        return getElementText(Number);  //Number = 1
    }
}

package pageLocators;

import org.openqa.selenium.By;

public class ProductLocators {

    public static final By addToBasketElement = By.xpath("//button[text()='Add to basket']");
    public static final By basketConfirmationMessage = By.cssSelector(".woocommerce-message");
}

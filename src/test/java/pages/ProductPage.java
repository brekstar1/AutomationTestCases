package pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.ProductLocators;

public class ProductPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void clickOnAddToCartButton(){
        elementHelper.clickLocator(ProductLocators.addToBasketElement);
    }

    public void validateCartMessage(String expectedMessage){
        elementHelper.validateMessageContains(ProductLocators.basketConfirmationMessage, expectedMessage);
    }
}

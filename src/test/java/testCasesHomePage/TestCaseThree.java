package testCasesHomePage;

import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class TestCaseThree extends SharedData {

    @Test
    public void testMethod() {

        ElementHelper elementHelper = new ElementHelper(getDriver());

        By adsConsentElement = By.xpath("//p[text()='Consent']");
        elementHelper.clickLocator(adsConsentElement);

        By shopButtonElement = By.cssSelector("#menu-item-40");
        elementHelper.clickLocator(shopButtonElement);

        By homeMenuButtonElement = By.xpath("//div[@id='site-logo']/a/img");
        elementHelper.clickJSLocator(homeMenuButtonElement);

        By slidersElement = By.cssSelector(".sub_row_1-0-2>div");
        elementHelper.validateSizeList(slidersElement, 3);

        By seleniumRubyElement = By.xpath("//h3[text()='Selenium Ruby']");
        elementHelper.clickJSLocator(seleniumRubyElement);

        By addToBasketElement = By.xpath("//button[text()='Add to basket']");
        elementHelper.clickLocator(addToBasketElement);

        By basketConfirmationMessage = By.cssSelector(".woocommerce-message");
        String expectedMessage = "has been added to your basket";
        elementHelper.validateMessageContains(basketConfirmationMessage, expectedMessage);

        elementHelper.clickLocator(homeMenuButtonElement);

        By thinkingInHTMLElement = By.xpath("//h3[text()='Thinking in HTML']");
        elementHelper.clickLocator(thinkingInHTMLElement);
        elementHelper.clickLocator(addToBasketElement);
        elementHelper.validateMessageContains(basketConfirmationMessage, expectedMessage);

        elementHelper.clickLocator(homeMenuButtonElement);

        By javaScriptElement = By.xpath("//h3[text()='Mastering JavaScript']");
        elementHelper.clickLocator(javaScriptElement);
        elementHelper.clickLocator(addToBasketElement);
        elementHelper.validateMessageContains(basketConfirmationMessage, expectedMessage);
    }
}
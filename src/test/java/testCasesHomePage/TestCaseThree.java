package testCasesHomePage;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ProductPage;
import sharedData.SharedData;

public class TestCaseThree extends SharedData {

    @Test
    public void testMethod() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickOnAdsConsentButton();
        indexPage.clickOnShopButton();
        indexPage.clickOnHomeMenuButton();
        indexPage.validateSliderElement(3);
        indexPage.clickOnArrivalRuby();

        ProductPage productPage = new ProductPage(getDriver());
        productPage.clickOnAddToCartButton();
        productPage.validateCartMessage("has been added to your basket");

        indexPage.clickOnHomeMenuButton();
        indexPage.clickOnArrivalThinkingHTML();

        productPage.clickOnAddToCartButton();
        productPage.validateCartMessage("has been added to your basket");

        indexPage.clickOnHomeMenuButton();
        indexPage.clickOnArrivalJavaScrip();

        productPage.clickOnAddToCartButton();
        productPage.validateCartMessage("has been added to your basket");
    }
}
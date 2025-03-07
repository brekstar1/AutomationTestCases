package testCasesHomePage;

import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class TestCaseTwo extends SharedData {

    @Test
    public void metodaTest(){

        ElementHelper elementHelper = new ElementHelper(getDriver());

        By adsConsentElement = By.xpath("//p[text()='Consent']");
        elementHelper.clickLocator(adsConsentElement);

        By shopButtonElement = By.cssSelector("#menu-item-40");
        elementHelper.clickLocator(shopButtonElement);

        By homeMenuButtonElement = By.xpath("//div[@id='site-logo']/a/img");
        elementHelper.clickLocator(homeMenuButtonElement);

        By slidersElement = By.cssSelector(".sub_row_1-0-2>div");
        elementHelper.validateSizeList(slidersElement,3);
    }
}
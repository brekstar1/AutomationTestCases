package testCasesHomePage;

import org.testng.annotations.Test;
import pages.IndexPage;
import sharedData.SharedData;

public class TestCaseOne extends SharedData {

    @Test
    public void metodaTest(){
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickOnAdsConsentButton();
        indexPage.clickOnShopButton();
        indexPage.clickOnHomeMenuButton();
        indexPage.validateSliderElement(3);
    }
}

package pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.IndexLocators;

public class IndexPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void clickOnAdsConsentButton(){
        elementHelper.clickLocator(IndexLocators.adsConsentElement);
    }

    public void clickOnShopButton(){
        elementHelper.clickLocator(IndexLocators.shopButtonElement);
    }

    public void clickOnHomeMenuButton(){
        elementHelper.clickLocator(IndexLocators.homeMenuButtonElement);
    }

    public void validateSliderElement(int expectedSize){
        elementHelper.validateSizeList(IndexLocators.slidersElement,expectedSize);
    }

    public void validateArrivalsSize(int expectedSize){
        elementHelper.validateSizeList(IndexLocators.arrivalsElement,expectedSize);
    }

    public void clickOnArrivalRuby(){
        elementHelper.clickJSLocator(IndexLocators.seleniumRubyElement);
    }

    public void clickOnArrivalThinkingHTML(){
        elementHelper.clickJSLocator(IndexLocators.thinkingInHTMLElement);
    }

    public void clickOnArrivalJavaScrip(){
        elementHelper.clickJSLocator(IndexLocators.javaScriptElement);
    }
}

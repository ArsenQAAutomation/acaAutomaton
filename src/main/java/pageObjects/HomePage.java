package pageObjects;

import helpers.Delay;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testCases.BaseClass;

public class HomePage {
    WebDriver driver;
    BaseClass bs = new BaseClass();
    Delay delay = new Delay(bs.driver);
    @FindBy(xpath = "//img[@alt='My Store']")
    @CacheLookup
    WebElement logo;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a")
    @CacheLookup
    WebElement firstItem;

    @FindBy(id = "search_query_top")
    @CacheLookup
    WebElement searchBox;

    @FindBy(name = "submit_search")
    @CacheLookup
    WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }




    public void clickOnLogo() {
        logo.click();
    }
    public void delayClickOnLogo(){
        delay.waitUntilWebElementWillBeVisible_Click(logo);
    }



    public void clickOnFirstItem() {
        firstItem.click();
    }
    public void delayClickOnFirstItem(){
        delay.waitUntilWebElementWillBeVisible_Click(firstItem);
    }



    public void clickOnSearchButton() {
        searchButton.click();
    }
    public void delayClickOnSearchButton() {
        delay.waitUntilWebElementWillBeVisible_Click(searchButton);
    }



    public void sendTextForSearch(String text) {
        searchBox.clear();
        searchBox.sendKeys(text);
    }
    public void delaySendKeyOnSearchBox(String text) {
        delay.waitUntilWebElementWillBeVisible_SendKeys(searchBox,text);
    }



}

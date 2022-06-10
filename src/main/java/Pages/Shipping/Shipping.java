package Pages.Shipping;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shipping extends BasePage {
    private final BasePage basePage;
    public Shipping(WebDriver driver){
        super(driver);
        basePage=new BasePage(driver);
    }
    @FindBy(xpath = "//a[@title='Previous']")
    public WebElement backAddress;

    @FindBy(xpath = "//button[@name='processAddress']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement termsOfService;

    @FindBy(xpath = "//a[@class='home']")
    public WebElement returnToHome;

    @FindBy(xpath = "//a[@class='iframe']")
    public WebElement readTerms;

    @FindBy(xpath = "//h1[@class='page-heading']")
    public WebElement pageHeading;

    @FindBy(xpath =  "class='delivery_option_price'")
    public WebElement deliveryFee;

    @FindBy(xpath = "//*[@id='form']/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/strong" )
    public WebElement carrier ;

    @FindBy(xpath = "//div[@class='radio']")
    public WebElement deliveryOption;

    public void clickbackAddress(){
        basePage.waitElementToBeVisible(backAddress);
        backAddress.click();}

    public void clickproceedToCheckout(){
        basePage.waitElementToBeVisible(proceedToCheckout);
        proceedToCheckout.click();}

    public void clicktermsOfService(){
        basePage.waitElementToBeVisible(termsOfService);
        termsOfService.click();}

    public void clickreturnToHome(){
        basePage.waitElementToBeVisible(returnToHome);
        returnToHome.click();}

    public void clickreadTerms(){
        basePage.waitElementToBeVisible(readTerms);
        readTerms.click();}

    public String getPageHeading(){
        basePage.waitElementToBeVisible(pageHeading);
       return pageHeading.getText();}

    public String getDeliveryFee(){
        basePage.waitElementToBeVisible(deliveryFee);
        return deliveryFee.getText();}

    public String getCarrier(){
        basePage.waitElementToBeVisible(carrier);
        return carrier.getText();}

    public void getDeliveryOption(){
        basePage.waitElementToBeVisible(deliveryOption);
        deliveryOption.click();}
}

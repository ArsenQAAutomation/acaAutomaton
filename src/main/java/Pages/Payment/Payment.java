package Pages.Payment;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment extends BasePage {
    private final BasePage basePage;

    public Payment(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);

    }
    @FindBy(className = "product-name")
    public WebElement productName;
    @FindBy(id = "bigpic")
    public WebElement ViewLarger;
    @FindBy(className = "btn btn-default btn-twitter")
    public WebElement twitterButton;
    @FindBy(className = "btn btn-default btn-facebook")
    public WebElement facebookButton;
    @FindBy(className = "btn btn-default btn-google-plus")
    public WebElement googlePlusButton;
    @FindBy(className = "btn btn-default btn-pinterest")
    public WebElement pinterestButton;
    @FindBy(id = "our_price_display")
    public WebElement priceDisplay;
    @FindBy(id = "quantity_wanted")
    public WebElement quantityTextBox;
    @FindBy(className = "icon-minus")
    public WebElement quantityMinusButton;
    @FindBy(className = "icon-plus")
    public WebElement quantityPlusButton;
    @FindBy(className = "form-control attribute_select no-print")
    public WebElement selectionBox;
    @FindBy(className = "buttons_bottom_block no-print")
    public WebElement addToCartButton;
    @FindBy(id = "wishlist_button")
    public WebElement addToWishList;
    @FindBy(id = "new_comment_tab_btn")
    public WebElement addReview;

    public void clickOnViewLarger(){
        basePage.waitElementTobeClickable(ViewLarger);
        basePage.clickOnelement(ViewLarger);
    }
    public void Tweet(){
        basePage.waitElementTobeClickable(twitterButton);
        basePage.clickOnelement(twitterButton);
    }
    public void Facebook(){
        basePage.waitElementTobeClickable(facebookButton);
        basePage.clickOnelement(facebookButton);
    }
    public void googlePlus(){
        basePage.waitElementTobeClickable(googlePlusButton);
        basePage.clickOnelement(googlePlusButton);
    }

    public void QuantityAdd(String Quantity){
        basePage.waitElementTobeClickable(quantityTextBox);
        basePage.clickOnelement(quantityTextBox);
        quantityTextBox.sendKeys(Quantity);
    }
    public void QuantityPlus(){
        basePage.waitElementTobeClickable(quantityPlusButton);
        basePage.clickOnelement(quantityPlusButton);
    }
    public void QuantityMinus(){
        basePage.waitElementTobeClickable(quantityMinusButton);
        basePage.clickOnelement(quantityMinusButton);
    }
}

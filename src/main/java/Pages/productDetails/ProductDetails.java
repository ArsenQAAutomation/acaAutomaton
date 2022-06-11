package Pages.productDetails;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductDetails extends BasePage {
    private BasePage basePage;

    //New Object creation
    public ProductDetails(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }


    @FindBy(id = "bigpic")
    private WebElement ViewLarger;
    @FindBy(id = "thumb_1")
    private WebElement FirstImage;
    @FindBy(id = "thumb_2")
    private WebElement SecondImage;
    @FindBy(id = "thumb_3")
    private WebElement ThirdImage;
    @FindBy(id = "thumb_4")
    private WebElement ForthImage;
    @FindBy(className = "fancybox-nav fancybox-prev")
    private WebElement PreviousButton;
    @FindBy(className = "fancybox-nav fancybox-next")
    private WebElement NextButton;
    @FindBy(className = "fancybox-item fancybox-close")
    private WebElement CloseButton;
    @FindBy(className = "btn btn-default btn-twitter")
    public WebElement twitterButton;
    @FindBy(className = "btn btn-default btn-facebook")
    public WebElement facebookButton;
    @FindBy(className = "btn btn-default btn-google-plus")
    public WebElement googlePlusButton;
    @FindBy(className = "btn btn-default btn-pinterest")
    public WebElement pinterestButton;
    @FindBy(id = "send_friend_button")
    public WebElement sendEmailButton;
    @FindBy(linkText = "javascript:print();")
    public WebElement printButton;
    @FindBy(name = "qty")
    public WebElement QuantityButton;
    @FindBy(className = "btn btn-default button-minus product_quantity_down")
    public WebElement quantityMinusButtonButton;
    @FindBy(className = "btn btn-default button-plus product_quantity_up")
    public WebElement quantityPlusButton;
    @FindBy(id = "group_1")
    public WebElement sizeButton;
    @FindBy(id = "color_13")
    public WebElement color1Button;
    @FindBy(id = "color_14")
    public WebElement color2Button;
    @FindBy(id = "add_to_cart")
    private WebElement addToCardButton;
    @FindBy(id = "wishlist_button")
    public WebElement wishListButton;




    // ***** Searching and clicking for an image maximizing button
    public void clickOnViewLarger() {
        basePage.waitElementTobeClickable(ViewLarger);
        basePage.clickOnelement(ViewLarger);
    }


    // ***** creation clickable method for each next image
    public void clickOnFirstImage() {
        basePage.waitElementTobeClickable(FirstImage);
        basePage.clickOnelement(FirstImage);
    }
    public void clickOnSecondImage() {
        basePage.clickOnelement(SecondImage);
    }
    public void clickOnThirdImage() {
        basePage.clickOnelement(ThirdImage);
    }
    public void clickOnForthImage() {
        basePage.clickOnelement(ForthImage);
    }


    // ***** click previous and next image and close it
    public void clickOnPreviousButton() {
        basePage.waitElementTobeClickable(PreviousButton);
        basePage.clickOnelement(PreviousButton);
    }
    public void clickOnNexButton() {
        basePage.waitElementTobeClickable(NextButton);
        basePage.clickOnelement(NextButton);
    }
    public void clickOnCloseButton() {
        basePage.waitElementTobeClickable(CloseButton);
        basePage.clickOnelement(CloseButton);
    }

    // ***** Social media sharing methods
    public void Tweeter() {
        basePage.waitElementTobeClickable(twitterButton);
        basePage.clickOnelement(twitterButton);

    }
    public void Face() {
        basePage.waitElementTobeClickable(facebookButton);
        basePage.clickOnelement(facebookButton);
    }
    public void GooglePlus() {
        basePage.waitElementTobeClickable(googlePlusButton);
        basePage.clickOnelement(googlePlusButton);
    }
    public void Pinterest() {
        basePage.waitElementTobeClickable(pinterestButton);
        basePage.clickOnelement(pinterestButton);
    }
    public void sendEmail() {
        basePage.waitElementTobeClickable(sendEmailButton);
        basePage.clickOnelement(sendEmailButton);
    }
    public void Print() {
        basePage.waitElementTobeClickable(printButton);
        basePage.clickOnelement(printButton);
    }

    // ***** define quantity of product
    public void inputQuantity() {
        basePage.waitElementTobeClickable(QuantityButton);
        basePage.clickOnelement(QuantityButton);
    }
    public void quantityMinus() {
        basePage.waitElementTobeClickable(quantityMinusButtonButton);
        basePage.clickOnelement(quantityMinusButtonButton);
    }
    public void quantityPlus() {
        basePage.waitElementTobeClickable(quantityPlusButton);
        basePage.clickOnelement(quantityPlusButton);

    }

    // ***** product size method
    public void size() {
        basePage.waitElementTobeClickable(sizeButton);
        basePage.clickOnelement(sizeButton);
    }


    // ***** product colors method
    public void color1() {
        basePage.waitElementTobeClickable(color1Button);
        basePage.clickOnelement(color1Button);
    }
    public void color2() {
        basePage.waitElementTobeClickable(color2Button);
        basePage.clickOnelement(color2Button);
    }


    // ***** add to Card method
    public void clickOnAddToCartButton() {
        basePage.clickOnelement(addToCardButton);
    }

    // ***** wishing list method
    public void wishList() {
        basePage.waitElementTobeClickable(wishListButton);
        basePage.clickOnelement(wishListButton);

    }
}

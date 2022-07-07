package Pages.women;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WomenPage extends BasePage {
    private final BasePage basePage;

    public WomenPage(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(xpath = "//a[@title=\"Women\"]")
    public WebElement womenTitle;

    @FindBy(id = "layered_category_8")
    public WebElement dressCheckBox;

    @FindBy(id = "layered_id_attribute_group_1")
    public WebElement sizeS;

    @FindBy(id = "layered_id_attribute_group_2")
    public WebElement sizeM;

    @FindBy(id = "Add to cart")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@class = layer_cart_product_info]")
    public WebElement cartAddedProductInfo;

    public String getTextFromCartAddedProductInfo() {
        return  cartAddedProductInfo.getText().toString();
    }

    public void clickOnWomenTitleMenuButton() {
        basePage.waitElementTobeClickable(womenTitle);
        basePage.clickOnelement(womenTitle);
    }

    public void clickOnDressCheckBox() {
        basePage.clickOnelement(dressCheckBox);
    }

    public void clickOnSizeSCheckbox() {
        basePage.clickOnelement(sizeS);
    }

    public void clickOnSizeMCheckbox() {
        basePage.waitElementTobeClickable(sizeM);
        basePage.clickOnelement(sizeM);
    }
    public void clickOnAddToCartButton() {
        basePage.waitElementToBeVisible(addToCart);
        basePage.clickOnelement(addToCart);
    }
}
package Pages.productDetails;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends BasePage {
    private BasePage basePage;

    public ProductDetails(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(id = "add_to_cart")
    private WebElement addToCartbutton;

    public  void clickOnAddToCartButton(){
        basePage.clickOnelement(addToCartbutton);
    }

}

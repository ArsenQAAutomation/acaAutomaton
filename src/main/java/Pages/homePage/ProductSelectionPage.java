package Pages.homePage;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSelectionPage extends BasePage {
    private final BasePage basePage;

    public ProductSelectionPage(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);

    }

    @FindBy(id = "header_logo")
    public WebElement logo;

    @FindBy(className = "product_img_link")
    public WebElement firstItem;


    public void clickOnLogo(){
        basePage.waitElementTobeClickable(logo);
        basePage.clickOnelement(logo);
    }

    public void clickOnFiorstItem(){
        basePage.clickOnelement(firstItem);
    }

    public String getTextFromEsimINch(){
        return "";
    };


}

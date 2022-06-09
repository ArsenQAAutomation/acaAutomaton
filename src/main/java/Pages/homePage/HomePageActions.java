package Pages.homePage;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageActions extends BasePage {
    private final BasePage basePage;
    private HomePageElements homePageElements = new HomePageElements();

    public HomePageActions(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);

    }

    @FindBy(id = "header_logo")
    public WebElement logo;

    @FindBy(className = "product_img_link")
    public WebElement firstItem;


    public void clickOnLogo(){
        basePage.clickOnelement(logo);
    }

    public void clickOnFiorstItem(){
    basePage.clickOnelement(firstItem);
    }



}

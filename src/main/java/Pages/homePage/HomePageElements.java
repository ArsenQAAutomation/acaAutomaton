package Pages.homePage;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements extends BasePage {
    private BasePage basePage;
    WebDriver driver;

    public HomePageElements(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }
    public HomePageElements() {

    }

    @FindBy(id = "header_logo")
    public WebElement logo;

    @FindBy(className = "product_img_link")
    public WebElement firstItem;
}

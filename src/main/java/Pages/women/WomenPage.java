package Pages.women;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void womenTitle() {
        basePage.waitElementTobeClickable(womenTitle);
        basePage.clickOnelement(womenTitle);
    }

    public void DressCheckBox() {
        basePage.clickOnelement(dressCheckBox);
    }

    public void sizeS() {
        basePage.clickOnelement(sizeS);
    }

    public void sizeM() {
        basePage.waitElementTobeClickable(sizeM);
        basePage.clickOnelement(sizeM);
    }
}
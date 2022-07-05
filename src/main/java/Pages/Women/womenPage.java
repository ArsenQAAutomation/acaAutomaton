package Pages.Women;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class womenPage extends BasePage {
        private final BasePage basePage;


        public womenPage(WebDriver driver) {
            super(driver);
            basePage = new BasePage(driver);

        }

        @FindBy(xpath = "//a[@title=\"Women\"])")
        public WebElement womenTitle;

        @FindBy(id = "uniform-layered_category_4")
        public WebElement topsCategory;

        @FindBy(id = "uniform-layered_category_8")
        public WebElement dressesCategory;

        @FindBy(id = "layered_id_attribute_group_1")
        public WebElement sizeS;

        @FindBy(id = "layered_id_attribute_group_2")
        public WebElement sizeM;

        @FindBy(id = "layered_id_attribute_group_3")
        public WebElement sizeL;

              
        public void womenTitle(){
                basePage.waitElementTobeClickable(womenTitle);
                basePage.clickOnelement(womenTitle);
                }

        public void topsCategory(){
                basePage.waitElementTobeClickable(topsCategory);
                basePage.clickOnelement(topsCategory);
                }
        
        public void dressesCategory(){
                basePage.waitElementTobeClickable(dressesCategory);
                basePage.clickOnelement(dressesCategory);
                }

        public void sizeS(){
                basePage.waitElementTobeClickable(sizeS);
                basePage.clickOnelement(sizeS);
                }

        public void sizeM(){
                basePage.waitElementTobeClickable(sizeM);
                basePage.clickOnelement(sizeM);
                }

        public void sizeL(){
                basePage.waitElementTobeClickable(sizeL);
                basePage.clickOnelement(sizeL);
                }
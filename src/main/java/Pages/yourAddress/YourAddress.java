package Pages.yourAddress;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAddress {
    public class yourAddress extends BasePage {
        private final BasePage basePage;

        public yourAddress(WebDriver driver) {
            super(driver);
            basePage = new BasePage(driver);
        }

        @FindBy(id = "firstname")
        public WebElement firstName;

        @FindBy(id = "lastname")
        public WebElement lastName;

        @FindBy(name = "company")
        public WebElement company;

        @FindBy(name = "address1")
        public WebElement address1;

        @FindBy(name = "address2")
        public WebElement address2;

        @FindBy(name = "city")
        public WebElement city;

        @FindBy(id = "id_state")
        public WebElement selectState;

        @FindBy(name = "postcode")
        public WebElement postCode;

        @FindBy(id = "id_country")
        public WebElement selectCountry;

        @FindBy(id = "other")
        public WebElement info;

        @FindBy(id = "phone")
        public WebElement homePhone;

        @FindBy(id = "phone_mobile")
        public WebElement mobilePhone;

        @FindBy(id = "alias")
        public WebElement alias;

        @FindBy(xpath = "//i[@class='icon-chevron-right right']")
        public WebElement registerButton;

        public void enterFirstName(String text) {
            basePage.waitElementToBeVisible(firstName);
            firstName.sendKeys(text);
        }

        public void enterLastName(String text) {
            basePage.waitElementToBeVisible(lastName);
            lastName.sendKeys(text);
        }

        public void enterCompany(String text) {
            basePage.waitElementToBeVisible(company);
            company.sendKeys(text);
        }

        public void enterAddress(String text) {
            basePage.waitElementToBeVisible(address1);
            address1.sendKeys(text);
        }

        public void enterAddress2(String text) {
            basePage.waitElementToBeVisible(address2);
            address2.sendKeys(text);
        }

        public void enterCity(String text) {
            basePage.waitElementToBeVisible(city);
            city.sendKeys(text);
        }

        public void selectState(String text) {
            basePage.waitElementToBeVisible(selectState);
            selectState.isSelected();
        }

        public void enterPostCode(String text) { //bayc ete postCode tveric a baghkacats stegh jisht e grel string?
            basePage.waitElementToBeVisible(postCode);
            postCode.sendKeys(text);
        }

        public void SelectCountry(String text) {
            basePage.waitElementToBeVisible(selectCountry);
            selectCountry.sendKeys(text);
        }

        public void enterInfo(String text) {
            basePage.waitElementToBeVisible(info);
            info.sendKeys(text);
        }

        public void enterHomePhone(String text) {
            basePage.waitElementToBeVisible(homePhone);
            homePhone.sendKeys(text);
        }

        public void enterMobilePhone(String text) {
            basePage.waitElementToBeVisible(mobilePhone);
            mobilePhone.sendKeys(text);
        }

        public void enterAlias(String text) {
            basePage.waitElementToBeVisible(alias);
            alias.sendKeys(text);
        }
        public void clickOnRegisterButton(String text){
            basePage.waitElementTobeClickable(registerButton);
            registerButton.click();
        }
    }
}

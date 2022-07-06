package Pages.yourPersonalInformation;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class YourPersonalInformation extends BasePage {
    private BasePage basePage;

    public YourPersonalInformation(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }
   /* @FindBy(xpath =//*[text()='My personal information'] );
            @CacheLookup
            private WebElement  MyPersonalInformationButton;*/


   /* @FindBy(xpath = "//*[@id=\"email_create\"]")
    @CacheLookup
    private WebElement EmailButton;
    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    @CacheLookup
    private WebElement SubmitButton;*/
    @FindBy(id = "id_gender2")
    @CacheLookup
    private WebElement GenderButton;
    @FindBy(id = "customer_firstname")
    @CacheLookup
    private WebElement FirstNameButton;
    @FindBy(id = "customer_lastname")
    @CacheLookup
    private WebElement LastNameButton;
    @FindBy(id = "email")
    @CacheLookup
    private WebElement EmailButton2;
    @FindBy(id = "passwd")
    @CacheLookup
    private WebElement PasswordButton;
    @FindBy(id = "days")
    @CacheLookup
    private WebElement DayButton;
    @FindBy(id = "months")
    @CacheLookup
    private WebElement MonthsButton;
    @FindBy(xpath = "//*[@id='years']")
    @CacheLookup
    private WebElement YearButton;
    @FindBy(id = "optin")
    @CacheLookup
    private WebElement OptinButon;

  /* public void MyPersonalInformationButtonClick(){
       basePage.waitElementTobeClickable(MyPersonalInformationButton);
       basePage.clickOnelement(MyPersonalInformationButton);
   }
   */
    //**Searching and fill the email box
    /*public void SendEmail(String text) {
        basePage.waitElementToBeVisible(EmailButton);
        EmailButton.sendKeys(text);


    }

    //**********Searching and cliking on submit button
    public void Submit() {
        basePage.waitElementTobeClickable(SubmitButton);
        basePage.clickOnelement(SubmitButton);
    }*/

    //********Search and click on gender button
    public void Gender() {
        basePage.waitElementTobeClickable(GenderButton);
        basePage.clickOnelement(GenderButton);
    }

    //***Search and fill customer's first name field
    public void FirstName(String text) {
        basePage.waitElementToBeVisible(FirstNameButton);
        FirstNameButton.sendKeys(text);
    }

    //*******Search and fill customer's last name
    public void LastName(String text) {
        basePage.waitElementToBeVisible(LastNameButton);
        LastNameButton.sendKeys(text);
    }

    //*****Search  and fill email field
    public void EmailButton2(String text) {
        basePage.waitElementToBeVisible(EmailButton2);
        EmailButton2.sendKeys(text);
    }

    //*****Search and fill password in the accord field
    public void Password(String text) {
        basePage.waitElementToBeVisible(PasswordButton);
        PasswordButton.sendKeys(text);
    }

    //*******Search and choose day of birth
    public void Day(String text) {
        basePage.waitElementToBeVisible(DayButton);
        DayButton.sendKeys(text);
    }

    //*********Search and choose month of birth
    public void Month(String text) {
        basePage.waitElementToBeVisible(MonthsButton);
        MonthsButton.sendKeys(text);
    }

    //*****Search and choose year of birth
    public void Year(String text) {
        basePage.waitElementToBeVisible(YearButton);
        YearButton.sendKeys(text);
    }

    //********Find and click on optim button
    public void LastAction() {
        basePage.waitElementTobeClickable(OptinButon);
        OptinButon.click();
    }

}


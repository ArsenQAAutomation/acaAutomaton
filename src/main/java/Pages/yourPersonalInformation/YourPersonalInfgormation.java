package Pages.yourPersonalInformation;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;

public class YourPersonalInfgormation {
    public class YourPersonalInformation extends BasePage{
        private BasePage basePage;
        public YourPersonalInformation (WebDriver driver) {
            super(driver);
            basePage = new BasePage(driver);
        }

       @FindBy(xpath="//*[@id=\"email_create\"]")
          private  WebElement EmailButton;
        @FindBy(xpath="//*[@id=\"SubmitCreate\"]")
          private WebElement SubmitButton;
        @FindBy(id="id_gender2")
        private WebElement GenderButton ;
        @FindBy(id="customer_firstname")
        private WebElement FirstNameButton;
        @FindBy(id="customer_lastname")
        private WebElement LastNameButton;
        @FindBy(id="email")
        private WebElement EmailButton2;
        @FindBy(id="passwd")
        private WebElement PasswordButton;
        @FindBy(id="days")
        private WebElement DayButton;
        @FindBy(id="months")
        private WebElement MonthsButton;
        @FindBy(xpath = "//*[@id='years']")
        private WebElement YearButton;
        @FindBy(id = "optin")
        private WebElement OptinButon;

        //**Searching and fill the email box
        public void SendEmail(){
            basePage.waitElementToBeVisible(EmailButton);
            EmailButton.sendKeys("AAA@.gmail.com");

        }
        //**********Searching and cliking on submit button
        public void Submit(){
            basePage.waitElementTobeClickable(SubmitButton);
            basePage.clickOnelement(SubmitButton);
        }
        //********Search and click on gender button
        public void Gender(){
            basePage.waitElementTobeClickable( GenderButton);
            basePage.clickOnelement( GenderButton);
        }
        //***Search and fill customer's first name field
        public void FirstName(){
            basePage.waitElementToBeVisible(FirstNameButton);
            FirstNameButton.sendKeys("Anna");
        }
        //*******Search and fill customer's last name
        public void LastName(){
            basePage.waitElementToBeVisible( LastNameButton);
            LastNameButton.sendKeys("Vahanyan");
        }
        //*****Search  and fill email field
        public void EmailButton2(){
            basePage.waitElementToBeVisible(EmailButton2);
            EmailButton2.sendKeys("AAA@gmail.com");
        }
        //*****Search and fill password in the accord field
        public void Password(){
            basePage.waitElementToBeVisible(PasswordButton);
            PasswordButton.sendKeys("888888abcd");
        }
        //*******Search and choose day of birth
        public void Day(){
            basePage.waitElementToBeVisible(DayButton);
            DayButton.sendKeys("18");
        }
        //*********Search and choose month of birth
        public void Month(){
            basePage.waitElementToBeVisible(MonthsButton);
            MonthsButton.sendKeys("August");
        }
        //*****Search and choose year of birth
        public void Year(){
            basePage.waitElementToBeVisible(YearButton);
            YearButton.sendKeys("2022");
        }
        //********Find and click on optim button
        public void LastAction(){
            basePage.waitElementTobeClickable(OptinButon);
            OptinButon.click();
        }

    }

}

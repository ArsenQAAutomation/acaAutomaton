package Pages.SignUpSignIn;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignUpSignIn extends BasePage {

    private final BasePage basePage;
    public SignUpSignIn(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(xpath = "//a[@class='login']")
    @CacheLookup
    WebElement buttonBasePageSignIn;

    @FindBy(xpath = "//h3[@class='page-subheading' and contains(text(),'personal')]")
    @CacheLookup
    WebElement registerPageHeader;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/p")
    @CacheLookup
    WebElement errorText;

    @FindBy(tagName = "a")
    @CacheLookup
    public List<WebElement> links;


    @FindBy(xpath = "//h1[@class='page-heading']")
    @CacheLookup
    WebElement pageHeading;

    @FindBy(xpath = "//h3[@class='page-subheading' and contains(text(),'Create') ]")
    @CacheLookup
    WebElement createAccountHeading;

    @FindBy(xpath = "//*[@class='icon-home']")
    @CacheLookup
    WebElement buttonIconHome;

    @FindBy(id = "email_create")
    @CacheLookup
    WebElement textBoxEmailCreate;

    @FindBy(name = "SubmitCreate")
    @CacheLookup
    WebElement buttonCreateAnAccount;

    @FindBy(xpath = "//h3[@class='page-subheading' and contains(text(),'register') ]")
    @CacheLookup
    WebElement signINHeading;

    @FindBy(id = "email")
    @CacheLookup
    WebElement textBoxEmail;

    @FindBy(id = "passwd")
    @CacheLookup
    WebElement textBoxPassword;

    @FindBy(xpath = "//a[@title='Recover your forgotten password']")
    @CacheLookup
    WebElement linkForgetYourPassword;

    @FindBy(id = "SubmitLogin")
    @CacheLookup
    WebElement buttonSignIn;

    public void clickButtonBasePageSignIn(){
        basePage.waitElementToBeVisible(buttonBasePageSignIn);
        buttonBasePageSignIn.click();
    }

    public String getRegisterPageHeader(){
        basePage.waitElementToBeVisible(registerPageHeader);
        return registerPageHeader.getText();
    }

    public String getErrorText(){
        basePage.waitElementToBeVisible(errorText);
        return errorText.getText();
    }



    public String getPageTitle(){
        String title = getDriver().getTitle();
        return title;
    }

    public String getPageHeading(){
        basePage.waitElementToBeVisible(pageHeading);
        return pageHeading.getText();
    }

    public String getCreateAccountHeading(){
        basePage.waitElementToBeVisible(createAccountHeading);
        return createAccountHeading.getText();
    }

    public void clickIconHome(){
        basePage.waitElementToBeVisible(buttonIconHome);
        buttonIconHome.click();
    }

    public void sendTextEmailCreate(String text){
        basePage.waitElementToBeVisible(textBoxEmailCreate);
        textBoxEmailCreate.sendKeys(text);
    }

    public void clickButtonCreateAnAccount(){
        basePage.waitElementToBeVisible(buttonCreateAnAccount);
        buttonCreateAnAccount.click();
    }

    public String getSignInHeading(){
        basePage.waitElementToBeVisible(signINHeading);
        return signINHeading.getText();
    }

    public void sendTextEmail(String text){
        basePage.waitElementToBeVisible(textBoxEmail);
        textBoxEmail.sendKeys(text);
    }

    public void sendTextPassword(String text){
        basePage.waitElementToBeVisible(textBoxPassword);
        textBoxPassword.sendKeys(text);
    }

    public void clickLinkForgetYourPassword(){
        basePage.waitElementToBeVisible(linkForgetYourPassword);
        linkForgetYourPassword.click();
    }

    public void clickButtonSignIn(){
        basePage.waitElementToBeVisible(buttonSignIn);
        buttonSignIn.click();
    }
}

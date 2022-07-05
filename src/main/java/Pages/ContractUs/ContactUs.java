package Pages.ContractUs;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends BasePage {
    private final BasePage basePage;


    public ContactUs(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    public WebElement title;
    @FindBy(id = "center_column")
    public WebElement customerserivce;
    @FindBy(id = "id_contact")
    public WebElement formchoose;
    @FindBy(className = "form-control grey validate")
    public WebElement email;
    @FindBy(className = "form-control grey")
    public WebElement ordereference;
    @FindBy(className = "uploader hover")
    public WebElement fileupload;
    @FindBy(className = "form-control")
    public WebElement message;

    public void title() {
        basePage.waitElementTobeClickable(title);
        basePage.clickOnelement(title);
    }

    public void CustomerService() {
        basePage.waitElementTobeClickable(customerserivce);
        basePage.clickOnelement(customerserivce);
    }

    public void SubjectHeading() {
        basePage.waitElementTobeClickable(formchoose);
        basePage.clickOnelement(formchoose);
    }

    public void Emailaddress() {
        basePage.waitElementTobeClickable(email);
        basePage.clickOnelement(email);
    }

    public void OrderReference() {
        basePage.waitElementTobeClickable(ordereference);
        basePage.clickOnelement(ordereference);
    }

    public void AttachFile() {
        basePage.waitElementTobeClickable(fileupload);
        basePage.clickOnelement(fileupload);
    }

    public void Message(String Fill) {
        basePage.waitElementTobeClickable(message);
        basePage.clickOnelement(message);
        message.sendKeys(Fill);
    }
}

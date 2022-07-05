package Pages.Newsletter;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsLetterPage extends BasePage {
    private final BasePage basePage;


    public NewsLetterPage(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    @FindBy(id = "newsletter-input")
    WebElement emailInput;

    @FindBy(xpath = "//*[@name= 'submitNewsletter']")
    WebElement submitNewsletterButton;

    @FindBy(xpath = "//*[text() = 'Newsletter']")
    WebElement newsletterLabel;






    public void addEmailTextToEmailInoutFiled(String emailText){
        basePage.scrollToElementJS(emailInput);
        waitElementToBeVisible(emailInput);
        waitElementTobeClickable(emailInput);
        basePage.fillTextToElement(emailInput, emailText);
    }

    /**
     * Click on Submit Newsletter Button
     *
     * @param
     * @return
     */
    public void clickOnSubmitNewsletterButton (){
        basePage.clickOnelement(submitNewsletterButton);
    }

    /**
     * Get NewsLetter Lable Text
     *
     * @param
     * @return String text
     */
    public String getTextFromNewsletterLabel(){
        return  newsletterLabel.getText().toString();
    }
}

package Pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public BasePage() {
    }

    public WebDriver getDriver() {
        return this.driver;
    }

// this method will used for clicking on element which is visible
    public void clickOnelement(WebElement element){
        this.waitElementToBeVisible(element);
        this.waitElementTobeClickable(element);
        element.click();
    }

    public void waitElementToBeVisible(WebElement element){
        this.webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementTobeClickable(WebElement element){
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void fillTextToElement(WebElement element,String text){
        waitElementToBeVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    public void scrollToElementJS(WebElement webElement) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public String generateRandomEmail(){
        String randomEmail;
        String generatedString = RandomStringUtils.randomAlphanumeric(10);
        randomEmail = generatedString + "@gmail.com";
        return randomEmail;
    }

}

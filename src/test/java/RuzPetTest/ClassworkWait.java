package RuzPetTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.xpath;

public class ClassworkWait {
    @Test
    public void explicitWait() {
        WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");
        Actions act = new Actions(driver);
        WebElement firstItem = driver.findElement(By.className("product-container"));
        act.moveToElement(firstItem).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product-container")));
        if (element.isDisplayed()) {
            System.out.println("Element is visible=");
        } else {
            System.out.println("Element is not visible");
        }
    }
}
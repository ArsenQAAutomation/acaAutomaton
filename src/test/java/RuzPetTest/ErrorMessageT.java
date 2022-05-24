package RuzPetTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.xpath;

public class ErrorMessageT {
    @Test
    public void  test() throws InterruptedException {
        WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Actions act = new Actions(driver);
        WebElement firstItm = driver.findElement(By.className("product-container"));
        act.moveToElement(firstItm).build().perform();
        WebElement addToCardButton = driver.findElement(By.cssSelector("[data-id-product=\"1\"]"));
        addToCardButton.click();
        driver.findElement(xpath("//a[contains(@title,'Proceed to checkout')]")).click();
        driver.findElement(xpath("//a[contains(@class,'button btn btn-default ')]")).click();
        driver.findElement(By.id("email")).sendKeys("hafhaf@mail.ru");
        driver.findElement(By.id("passwd")).sendKeys("123456");
        driver.findElement(By.id("SubmitLogin")).click();
        WebElement errorElement = driver.findElement(By.xpath("//*[contains(@class,'alert alert-danger')]"));
        assertEquals(errorElement.getText().toString(), "There is 1 error\n" +
                "Authentication failed.");
        driver.quit();
    }
}
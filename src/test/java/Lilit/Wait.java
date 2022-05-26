package Lilit;

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

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

public class Wait {
    @Test
    public  void mainTest () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(20));
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        // Wait till the element becomes visible
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default']")));
        if (element.isDisplayed()) {
            System.out.println("Element is visible");
        } else {
            System.out.println("Element is not visible");
        }
        driver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default']")).click();// add to card
        
        WebElement webElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title,'Proceed to checkout')]")));
        if (element.isDisplayed()) {
            System.out.println("Element1 is clickable");
        } else {
            System.out.println("Element1 is not clickable");
            driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();//proceed to check out
        }
        
        WebElement webElement2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btn-default button button-medium']")));
        if (element.isDisplayed()){
            System.out.println("Element2 is clickable");
        } else {
            System.out.println("Element2 is not clickable");
        }
        driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']")).click(); // proceed to check out
        
        WebElement webElement3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("//*[contains(@class,'is_required validate account')]")));
        if (element.isDisplayed()) {
            System.out.println("Email field is visible");
        } else {
            System.out.println("Email field is not visible");
        }
        WebElement EmailButton = driver.findElement(By.className("//*[contains(@class,'is_required validate account')]"));
               EmailButton.sendKeys("tumanyanlili3@gmail.com");
        
        WebElement webElement4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
                if (element.isDisplayed()) {
            System.out.println("password field is visible");
        } else {
            System.out.println("password field is not visible");
        }
        driver.findElement(By.id("passwd")).sendKeys("asl123");

        WebElement webElement5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(@class,'icon-lock left')]")));
        
        if (element.isDisplayed()) {
            System.out.println("Sign in button is clickable");
        } else {
            System.out.println("Sign in button is not clickable");
        }
        WebElement ClickButton = driver.findElement(By.xpath("//i[contains(@class,'icon-lock left')]"));
              ClickButton.click();
        
        WebElement ClickButton1 = driver.findElement(By.xpath("//i[contains(@class,'icon-lock left')]"));
              ClickButton1.click();
            String actualResult = driver.findElement(By.xpath("//*[text() = 'Authentication failed.']")).getText();
             String expectedResult = "Authentication failed.";
             assertEquals(actualResult, expectedResult);
            driver.close();
    }
}





package ShoghikGasparyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class acaAutomationTest1 {

        public static void main(String[] args) {
            WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();
            try {
                driver.get("http://automationpractice.com/index.php");
                WebElement element = driver.findElement(By.tagName("title"));
                System.out.println("the title name is: " + element.getAttribute("text"));
                assertEquals( "My Store", element.getAttribute("text"));

            } finally {
                driver.quit();
            }
        }
    }


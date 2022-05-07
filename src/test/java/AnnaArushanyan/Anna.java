package AnnaArushanyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Anna {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        try {
            driver.get("http://automationpractice.com/index.php");
            WebElement element = driver.findElement(By.tagName("title"));
            System.out.println("the title name is: " + element.getAttribute("text"));
            assertEquals( "My Store", element.getAttribute("text"));

        } finally {
            driver.quit();}
    }
}
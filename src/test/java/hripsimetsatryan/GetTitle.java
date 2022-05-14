package hripsimetsatryan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTitle { public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    try {
        driver.get("http://automationpractice.com/index.php");
        WebElement element = driver.findElement(By.tagName("title"));
        System.out.println("The page title is " + element.getAttribute("text"));
        assertEquals("My Store" , element.getAttribute("text"));
    }
    finally {
        driver.quit();
    }
    }
}

package AnnaVahanyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJavaCalss {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {

            driver.get("http://automationpractice.com/index.php");
            WebElement element = driver.findElement(By.tagName(" title "));
            System.out.println("The title name is :" + element.getAttribute("text"));
            assertEquals(" My store ", element.getAttribute("text"));
        } finally {
            driver.quit();
        }
    }
}


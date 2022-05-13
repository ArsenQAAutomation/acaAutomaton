package AnnaVahanyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJavaCalss {
    public static void main(String[] args) {
        WebDriver driver;
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();



            driver.get("http://automationpractice.com/index.php");
            String tittel = driver.getTitle();
            assertEquals("My Store", tittel);
            driver.quit();
            // String tittel=driver.getTitle();
            String textElement = driver.findElement(By.xpath("/html/head/title")).getAttribute("text");

            assertEquals("My Store", textElement);
            //  driver.quit();
        }
    }




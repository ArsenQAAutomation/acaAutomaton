package ShushanikKarapetyan;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.*;


public class MyStoreTitle {

        WebDriver driver;

       @Test
        void testGoogleAvailable () throws InterruptedException {
            // Driver management and WebDriver instantiation
            driver = WebDriverManager.getInstance(ChromeDriver.class).create();

            // Exercise
            driver.get("http://automationpractice.com");
            String title = driver.getTitle();
            WebElement element = driver.findElement(By.className("img-responsive"));
            element.click();

            assertTrue(title.contains("My Store"));
        }



}


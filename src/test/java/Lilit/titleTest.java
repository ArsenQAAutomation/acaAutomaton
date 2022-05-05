package Lilit;

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

public class titleTest {
    WebDriver driver;

    @AfterEach
    void teardown() {

        driver.quit();
    }
    @Test
    void testGoogleAvailable()  {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        //driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.get("http://automationpractice.com/index.php");
        String title = driver.getTitle();
        assertEquals( "My Stor", title);
    }

}

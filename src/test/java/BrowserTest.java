
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

public class BrowserTest {
    WebDriver driver;

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Tag("google")
    @Test
    void testGoogleAvailable() throws InterruptedException {
        assertFalse(Config.FAIL_TESTS);
        // Driver management and WebDriver instantiation
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();

        // Exercise
        driver.get("https://google.com");
        String title = driver.getTitle();
        WebElement element = driver.findElement(By.className("gLFyf"));
        element.click();
        element.sendKeys("blabla");


        //Thread.sleep(5000);
        //element.clear();
        // assertEquals( "blaBla", textElement.getText());
        Thread.sleep(5000);
        WebElement searchElement = driver.findElement(By.className("gNO89b"));
        searchElement.click();
        Thread.sleep(1000);
        WebElement textElement = driver.findElement(By.className("gLFyf"));
        assertEquals( "blaBla", textElement.getText());

        // Verify
        assertTrue(title.contains("Google"));
        //assertEquals(driver.getClass(), ChromeDriver.class, "fail on browsers other than Chrome");
    }

}
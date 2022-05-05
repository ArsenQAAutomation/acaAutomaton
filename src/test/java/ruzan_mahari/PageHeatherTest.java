package ruzan_mahari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PageHeatherTest {
    WebDriver driver;

    @AfterEach
    void teardown() {
        driver.quit();
    }


    @Tag("google")
    @Test
    void testHeader() throws InterruptedException {
        ////?  assertFalse(Config.FAIL_TESTS);
        // Driver management and WebDriver instantiation
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();


        // Exercise
        driver.get("http://automationpractice.com/index.php");//"https://google.com");
        String title = driver.getTitle();
        System.out.println("This is the title of the page:  " + title);
        //WebElement element = driver.findElement(By.className("gLFyf"));
        //element.click();

    }
}

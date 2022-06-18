package Lilit.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class SearchPage {
    private static WebElement element = null;

    public static WebElement text_search(WebDriver driver){
        WebElement element = driver.findElement(By.name("search_query"));
        return element;
    }
    public static WebElement button_search(WebDriver driver){
        WebElement element = driver.findElement(By.name("submit_search"));
        return element;
    }
}
public class SearchTest {
    @Test
    public void mainTest() {
        private static WebElement element = null;
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        //WebElement text_search = driver.findElement(By.name("search_query")).sendKeys("dress");
        Pages.text_search(driver).sendKeys("dress");
        Pages.button_search(driver).click();
        }
    }

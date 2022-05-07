package GorBabloyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TitleTest {
    public WebDriver driver;

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void Title() {
        driver.get("http://automationpractice.com/index.php"); //
        String title = driver.getTitle();
        Assert.assertEquals(title, "My Store");
    }

    @Test
    void Title_2() {
        driver.get("http://automationpractice.com/index.php");
        String title = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a")).getAttribute("title");
        Assert.assertEquals(title, "My Store");
    }

    @AfterClass
    void quit() {
        driver.quit();
    }
}

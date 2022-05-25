package AnnaVahanyan;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ShopingProcess {
    @Test
    public void TestMethod2() throws InterruptedException {
        WebDriver driver;
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        // WebElement el = driver.findElement(By.xpath("//*[@class=\"content_price\"]"));
        Actions actions = new Actions(driver);
        //  actions.moveToElement(el).build().perform();
        //Thread.sleep(2000);
        List<WebElement> AddToCart = driver.findElements(By.xpath("//*[@class='content_price']"));
        for (WebElement element : AddToCart) {
            String s = element.getText();
            System.out.println(s);
            if (s.contains("%") && element.isDisplayed()) {
                actions.moveToElement(element).perform();
                element.click();

            }
        }

        WebElement ClickAddButton = driver.findElement(By.xpath("//*[@title='Log in to your customer account']"));
        ClickAddButton.click();
        WebElement ProceedToCheckOut1=driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']"));
driver.quit();
    }
}
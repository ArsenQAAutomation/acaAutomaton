package ShushanikKarapetyan;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    @Test
       void testExplicitWait() throws InterruptedException{
        WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();

    Actions action = new Actions(driver);
    driver.get("https://amx.am/?");
        driver.manage().window().maximize();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(15))
           .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div/div/ul/li[4]")));
        action.moveToElement(firstResult).perform();

        WebElement secondResult = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/header/div/div[3]/div/div/ul/li[4]/div/div/div[1]/div[2]/ul/div/div[1]/ul/div[2]/li/a")));
        action.moveToElement(firstResult).perform();
        secondResult.click();

        WebElement thirdResult = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div/div/div/div/div[1]/div[2]]")));
        action.moveToElement(firstResult).perform();
        thirdResult.click();
       // thirdResult.sendKeys("UNIBBA");
        //Thread.sleep(2000);


    }
}

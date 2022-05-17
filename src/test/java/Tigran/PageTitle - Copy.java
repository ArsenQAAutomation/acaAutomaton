package Tigran;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class PageTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        List<WebElement> elements = driver.findElements(By.xpath("//div[@itemprop='offers']"));
        Actions actions = new Actions(driver);
        WebElement firstItm = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
                actions.moveElement(firstItm);
        WebElement addToCardButton = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
        addToCardButton.click();

        for (WebElement e : elements) {
            String value = e.getText();
            if (value.contains("%")) {
                System.out.println(value);
                actions.moveToElement(e).perform();
            }
        }

        driver.quit();
    }
}
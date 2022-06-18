package Tigran;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BuyCard1
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        List<WebElement> elements = driver.findElements(By.xpath("//div[@itemprop='offers']"));
        driver.findElement(By.xpath("//<span>Add to cart</span>")).sendKeys("Your-Name"); // Will send values to First Name tab

        Actions actions=new Actions(driver);
        for (WebElement e:elements){
            String value =e.getText();
            if (value.contains("%")){
                System.out.println(value);
                actions.moveToElement(e).perform();}
        }

        driver.quit();
    }
}
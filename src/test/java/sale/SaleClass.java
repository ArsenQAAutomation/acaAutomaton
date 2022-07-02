package sale;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SaleClass {
            @Test
    public static void main(String [] args) {
        WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        try {
            driver.get("http://automationpractice.com/index.php");
            driver.manage().window().maximize();
            WebElement element = driver.findElement(By.tagName("title"));
            System.out.println("the title name is: " + element.getAttribute("text"));
            assertEquals( "My Store", element.getAttribute("text"));
            List<WebElement> saleElement = driver.findElements(By.xpath("//span[@class  =  'price-percent-reduction']"));
            System.out.println("1111111 " + saleElement.size());
            for(WebElement element1 : saleElement)
            {
                if(element1.isDisplayed()){
                    Actions action = new Actions(driver);
                    action.moveToElement(element1).perform();
                    Thread.sleep(2000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
         WebElement id=driver.findElement(By.id("data-id-product=\"5\""));
        id.click();
            }
}

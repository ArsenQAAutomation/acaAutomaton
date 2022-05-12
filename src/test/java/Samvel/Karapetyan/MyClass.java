package Samvel.Karapetyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class MyClass {




        public static void main(String[] args) {
            WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();

                driver.get("http://automationpractice.com/index.php?");
                List<WebElement> element = driver.findElements(By.xpath("//span[@class='price-percent-reduction']"));

                System.out.println(" CLASS  Elements size " + element.size());
for (WebElement el:element){
    System.out.println(el.isDisplayed());
    System.out.println(el.getText());


}


                driver.quit();

        }
    }


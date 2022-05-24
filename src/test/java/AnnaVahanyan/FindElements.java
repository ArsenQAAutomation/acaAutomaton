package AnnaVahanyan;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class FindElements {
   public static void main(String args[]){
        WebDriver driver;
      driver = WebDriverManager.getInstance(ChromeDriver.class).create();
      driver.get("http://automationpractice.com/index.php");
      List<WebElement> elements= driver.findElements(By.xpath("//div[@itemprop='offers']"));
       for(WebElement element: elements){
           String s=element.getText();
           if(s.contains("%")){
              System.out.println(s);
           }
        }
     driver.quit();
  }
   }


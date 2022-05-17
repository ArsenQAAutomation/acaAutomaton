package Armen;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class TestRegistration {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("http://automationpractice.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            List<WebElement> seleElement=driver.findElements(By.xpath("//div[@itemprop ='offers']"));
            Actions actions=new Actions(driver);
            for(WebElement e:seleElement){
                String volume= e.getText();
                if (volume.contains("%")){
                    actions.moveToElement(e).perform();
                    driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]")).click();
                    driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
                    driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]")).click();
                    driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i")).click();
                    driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span/i")).click();
                    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("armenharutyunyan");
                    driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("aca");
                    driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
                }
            }

        }
    }


package ShushanikKarapetyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.interactions.Actions;

public class MyStoreDiscount {


        public static void main(String[] args)throws InterruptedException {

            WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();
            Actions action = new Actions(driver);
                driver.get("http://automationpractice.com/index.php?");
                driver.manage().window().maximize();
                List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]]"));
                            for(WebElement elem:element) {
                                if(elem.isDisplayed()){
                                    action.moveToElement(elem).perform();

                                    System.out.println("Discount is visible "+ elem.getText());

                                }
                                System.out.println("Discount is not  visible ");
            }
            System.out.println("Size is "+ element.size());
            driver.quit();

        }

        }


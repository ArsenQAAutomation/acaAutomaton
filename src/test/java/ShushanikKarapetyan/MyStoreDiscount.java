package ShushanikKarapetyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.interactions.Actions;

public class MyStoreDiscount {


        public static void main(String[] args)throws InterruptedException {

            WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();
            Actions action = new Actions(driver);

                driver.get("http://automationpractice.com/index.php?");
                List<WebElement> element = driver.findElements(By.xpath("//span[@class='price-percent-reduction']"));
                            for(WebElement i:element) {
                                if(i.isDisplayed() == true){
                                    action.moveToElement(i).perform();
                                    Thread.sleep(3000);
                                    System.out.println("Discount is visible "+ i.getText());
                                }
                                System.out.println("Discount is not  visible ");
            }

            System.out.println("Size is "+ element.size());
            driver.quit();

        }

        }


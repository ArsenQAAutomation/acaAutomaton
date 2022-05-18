package ruzan_mahari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PageHeaderTest {
    WebDriver driver;

    @AfterEach
    void teardown() {
        driver.quit();
    }


    @Tag("google")
    @Test
    void testHeader() throws InterruptedException {
        ////?  assertFalse(Config.FAIL_TESTS);
        // Driver management and WebDriver instantiation
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();


        // Exercise
        driver.get("http://automationpractice.com/index.php");//"https://google.com");
        String title = driver.getTitle();
        System.out.println("This is the title of the page:  " + title);

        WebElement hihi = driver.findElement(By.xpath("/html/head/title"));

        title = hihi.getAttribute("text");// hihi.getText();
        System.out.println("This is the title of the page:  " + title);
        hihi = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[1]/span[2]"));

        String namnam = hihi.getText();

        System.out.println("This is the text of element  " + namnam);

      //finding the first photo dress

        //   hihi.clear();?
      hihi = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));///////"//*[@id="homefeatured"]/li[1]/div/div[2]/div[2]/a[1])"));
      //Creating object of an Actions class
      Actions action = new Actions(driver);

      //Performing the mouse hover action on the target element.
      action.moveToElement(hihi).perform();

        // Locating the element from Sub Menu
        WebElement AddToCard = driver.findElement(By.xpath ("//*[contains(text(),'Add to cart')]"));

        //norm driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span"));//.className("button ajax_add_to_cart_button btn btn-default"));


        AddToCard.click();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

      //////  WebElement proceed = driver.findElement(By.xpath ("//*[contains(text(),'Proceed to checkout')]"));//(By.xpath("//*[ text() = ‘Proceed to checkout’ ]"));
        WebElement proceed = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
            //    "\t\t\t\t\t\t\tProceed to checkout']"));//on-medium" href="http://automationpractice.com/index.php?controller=order" title="Proceed to checkout" rel="nofollow">
        proceed.click();


        //page-down?
        action.sendKeys(Keys.PAGE_DOWN).build().perform();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  Second "Proceed to checkout"

        driver.findElement(By.xpath ("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();

        //wrong login
        driver.findElement(By.cssSelector("#email")).sendKeys("bubu");

        driver.findElement(By.cssSelector("#passwd")).sendKeys("bubu");
        driver.findElement(By.cssSelector("#SubmitLogin")).click();

        WebElement errMsg = driver.findElement(By.xpath ("//*[contains(text(),'There is 1 error')]"));

     ///
        Boolean boo = errMsg.isDisplayed();
        if(boo) {
            List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
            if (elements.size() > 0) {      //assert?

                    assertEquals("Invalid email address.",elements.get(0).getText()," Err msg N1 is wrong");

                    System.out.println("errMsg is proper: Invalid email address.");
             }
           //     else
           //         System.out.println(" Err msg N1 is wrong");

           else
                System.out.println("There is no err msg N1");
        }

        //////simon?    action.click();//.build().perform();  ??
        ////////////
        /////add to basket all the items with cell.new part
        List<WebElement>  elements1 = driver.findElements(By.xpath("//span[@class='price-percent-reduction']"));
        for(int i=0; i< elements1.size(); i++){


        }
        }


    }


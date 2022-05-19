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

import static org.bouncycastle.asn1.isismtt.x509.DeclarationOfMajority.dateOfBirth;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreatrAccountAndByDresses {
    ////////////
    WebDriver driver;

    @AfterEach
    void teardown() {
        driver.quit();
    }


    @Tag("google")
    @Test
    void createAccountAndBuyDresses() throws InterruptedException {

      // Driver management and WebDriver instantiation
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();

        driver.get("http://automationpractice.com/index.php");


        Actions action = new Actions(driver);

     /*   // Locating the element from Sub Menu
        WebElement AddToCard = driver.findElement(By.xpath("//*[contains(text(),'Add to cart')]"));

        //norm driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span"));//.className("button ajax_add_to_cart_button btn btn-default"));


        AddToCard.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement proceed = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
        proceed.click();


        //page-down?
        action.sendKeys(Keys.PAGE_DOWN).build().perform();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  Second "Proceed to checkout"

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();

      *simon end*/
        //Mazimize current window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      //  action.sendKeys(Keys.PAGE_DOWN);//build().perform();

        /////add to basket all the items with cell.new part
    ///    List<WebElement> elements1 = driver.findElements(By.xpath("//span[@class='old-price product-price']//ancestor::div[@class='content_price']"));//replace-2x img-responsive']"));
        List<WebElement> elements1 = driver.findElements(By.cssSelector("ul[id='homefeatured'] div[class='right-block']  span[class='price-percent-reduction']"));
                //driver.findElements(By.xpath("//span[@class='price-percent-reduction']//ancestor::div[@class='product-container']"));
        WebElement bubu;
        WebElement bu;
        List<WebElement> AddToCardEls ;//=  driver.findElements(By.xpath("//*[contains(text(),'Add to cart')]"));//ancestor::div[@class='price-percent-reduction']"));
        int saledDressNumb = elements1.size();
        for (int i = 0; i < saledDressNumb; i++) {

            elements1 = driver.findElements(By.cssSelector("ul[id='homefeatured'] div[class='right-block']  span[class='price-percent-reduction']"));
            //hover
            bubu = elements1.get(i);


            // hover on element to see the "Add to cart"
            action.moveToElement(bubu).perform();
            AddToCardEls = driver.findElements(By.xpath("//*[contains(text(),'Add to cart')]"));
            for (int j = 0; j < AddToCardEls.size(); j++) {
                bu = AddToCardEls.get(j);


                if (bu.isDisplayed()) {
                    bu.click();
                    WebElement proceed = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
                    proceed.click();
                    //Continue shopping
                    driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[2]")).click();//("//a[@class='button-exclusive btn btn-default']")).click();
                    //page-down?
                    action.sendKeys(Keys.PAGE_DOWN).build().perform();
                    break;


                }
            }
        }
            driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).click();//("//a[@class='button-exclusive btn btn-default']")).click();
            driver.findElement(By.xpath("//*[contains(text(),'Check out')]"));

            //page-down?
            //    action.sendKeys(Keys.PAGE_DOWN).build().perform();

            //  Second "Proceed to checkout"

            driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
            //email
         //    if(i==0) {

                //create account
               String myMail = "ruz13@hotmail.com";
                driver.findElement(By.cssSelector("#email_create")).sendKeys(myMail);
                WebElement account = driver.findElement(By.id("SubmitCreate"));
                Thread.sleep(3000);
                account.click();
                //!!!test whether this email is already used
               WebElement myErr = driver.findElement(By.id("create_account_error"));
              do{

                 myMail = "1" + myMail;
                 driver.findElement(By.cssSelector("#email_create")).sendKeys(myMail);
                 account.click();
              }while( myErr.isDisplayed());



               // Thread.sleep(3000);
               // account.click();
                 Thread.sleep(1500);
                driver.findElement(By.id("id_gender2")).click();
                driver.findElement(By.name("customer_firstname")).sendKeys("Ru");
                driver.findElement(By.name("customer_lastname")).sendKeys("Ma");
                 driver.findElement(By.name("passwd")).sendKeys("Bibik");
                 Select se = new Select(driver.findElement(By.id("days")));
                 se.selectByValue("3");
                 se = new Select(driver.findElement(By.id("months")));
                 se.selectByValue("11");

                 se = new Select(driver.findElement(By.id("years")));
                 se.selectByValue("2007");
                 driver.findElement(By.id("optin")).click();
                 driver.findElement(By.id("address1")).sendKeys("huhuhuhu");
                 driver.findElement(By.id("postcode")).sendKeys("00014");

                 se = new Select(driver.findElement(By.id("id_state")));
                 se.selectByValue("11");


                 driver.findElement(By.id("city")).sendKeys("Yerevan");
                 driver.findElement(By.id("phone_mobile")).sendKeys("32132132111");
                 driver.findElement(By.id("submitAccount")).click();



          //  }
          //  else{
          //      //log in with credentials

        }

    }

//stale element reference: element is not attached to the page document
//testng
//number of saled dresses
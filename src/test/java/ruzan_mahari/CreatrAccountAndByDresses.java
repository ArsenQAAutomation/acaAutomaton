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

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        // Driver
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();

        driver.get("http://automationpractice.com/index.php");


        Actions action = new Actions(driver);


        //Maximize current window
        driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //waits


        /////add to basket all the items with cell.new part
        List<WebElement> elements1 = driver.findElements(By.cssSelector("ul[id='homefeatured'] div[class='right-block']  span[class='price-percent-reduction']"));
        WebElement bubu, bu;

        List<WebElement> AddToCardEls;//=  driver.findElements(By.xpath("//*[contains(text(),'Add to cart')]"));//ancestor::div[@class='price-percent-reduction']"));
        int saledDressNumb = elements1.size();
        for (int i = 0; i < saledDressNumb; i++) {

            ///should wait until page will be visible
            elements1 = driver.findElements(By.cssSelector("ul[id='homefeatured'] div[class='right-block']  span[class='price-percent-reduction']"));
            //hover
            bubu = elements1.get(i);


            Thread.sleep(3000);/////?chto vmesto?

            // hover on element to see the "Add to cart"
            action.moveToElement(bubu).perform();


            AddToCardEls = driver.findElements(By.xpath("//*[contains(text(),'Add to cart')]"));
            for (int j = 0; j < AddToCardEls.size(); j++) {
                bu = AddToCardEls.get(j);


                if (bu.isDisplayed()) {
                    bu.click();

                    WebElement proceed = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.
                            xpath("//span[normalize-space()='Proceed to checkout']")));
                    proceed.click();
                    //Continue shopping
                    WebElement continueShop = new WebDriverWait(driver, Duration.ofSeconds(5))
                            .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='center_column']/p[2]/a[2]")));
                    continueShop.click();
                    //page-down
                    action.sendKeys(Keys.PAGE_DOWN).build().perform();
                    break;
                }

            }
        }
            //go to Cart on the top -right of page
                  action.sendKeys(Keys.PAGE_UP).build().perform();
                  WebElement checkOut = new WebDriverWait(driver, Duration.ofSeconds(10))
                            .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")));
                    checkOut.click();
                    //          driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).click();
                    ////simon         driver.findElement(By.xpath("//*[contains(text(),'Check out')]"));



            //  Second "Proceed to checkout"

        checkOut = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")));
        checkOut.click();
        //   driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();


            //create account
            String myMail = "rrr@hotmail.com";
            WebElement myMailPlace = driver.findElement(By.cssSelector("#email_create"));
            myMailPlace.sendKeys(myMail);
            WebElement account = driver.findElement(By.id("SubmitCreate"));

            account.click();

            //test whether this email is already used
            WebElement isErrPresent;
            while (true) {
                try {
                    isErrPresent = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.id("create_account_error")));


                    //     isErrPresent = driver.findElement(By.id("create_account_error"));
                    myMail = "1" + myMail;
                    myMailPlace.clear();
                    myMailPlace.sendKeys(myMail);
                    account.click();


                } catch (Exception e) {

                    break;
                }
            }
   Thread.sleep(3000);
            //kuku
      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     //       wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("id_gender2"))));
            driver.findElement(By.id("id_gender2")).click();
      // gender.click();
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
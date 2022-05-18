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

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

      */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /////add to basket all the items with cell.new part
        List<WebElement> elements1 = driver.findElements(By.xpath("//span[@class='price-percent-reduction']"));
        for (int i = 0; i < elements1.size(); i++) {
            //hover
            action.moveToElement(elements1.get(i)).perform();


            // Locating the element from Sub Menu
            WebElement  AddToCard = driver.findElement(By.cssSelector("a[class='button lnk_view btn btn-default'] [style='display:block']"));//xpath("//*[contains(text(),'Add to cart')]"));

            //#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.last-line.first-item-of-mobile-line.hovered > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span
///dobavit' zdes' isVisible()v CSS!!!!! i prineset tol'ko vidimiy , i toko togda (v tsikle?- click
            AddToCard.click();

            WebElement  proceed = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
            proceed.click();


            //page-down?
            action.sendKeys(Keys.PAGE_DOWN).build().perform();

            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //  Second "Proceed to checkout"

            driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
            //email
            driver.findElement(By.cssSelector("#email")).sendKeys("ruz@hotmail.com");
            //create account
            driver.findElement(By.xpath("//*[contains(text(),'Create an account')]")).click();
            driver.findElement(By.id("id_gender2")).click();

        }
    }
}

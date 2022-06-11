package AnnaVahanyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Practice1 {
    @Test
    public void TestMethod1() throws InterruptedException {
        WebDriver driver;
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.get("http://automationpractice.com/index.php");

        WebElement icon = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[1]/div/a[1]/img"));
        Thread.sleep(2000);
        WebElement AddCartButton = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]/span"));
        AddCartButton.click();
        Thread.sleep(2000);
        WebElement CheckoutButton = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        CheckoutButton.click();
        Thread.sleep(3000);
        WebElement CheckOutButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
        CheckOutButton.click();
        Thread.sleep(2000);
        WebElement emailboxElement = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        emailboxElement.sendKeys("VVAnna1808@gmail.com");
        Thread.sleep(2000);
        WebElement CreateAnAcountElement = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        CreateAnAcountElement.click();
        Thread.sleep(2000);
        WebElement gender = driver.findElement(By.id("id_gender1"));
        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        FirstName.sendKeys("Anna");
        Thread.sleep(2000);
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        LastName.sendKeys("Vahanyan");
        Thread.sleep(2000);
        WebElement emailbox1= driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailbox1.sendKeys("");
        Thread.sleep(2000);
        WebElement PswdElement =driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        PswdElement.sendKeys("12345678");
        Thread.sleep(2000);
        WebElement Day= driver.findElement(By.xpath("//*[@id=\"days\"]"));
        Day.sendKeys("18");
        WebElement Month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        Month.sendKeys("August");
        WebElement Year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        Year.sendKeys("1982");
        Thread.sleep(2000);
        WebElement Company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        Company.sendKeys("ACA");
        WebElement Address1 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        Address1.sendKeys("Hakob Hakobyan");
        //Thread.sleep(2000);
        WebElement AddresLine2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
        AddresLine2.sendKeys("Mergelyan");
        WebElement City = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        City.sendKeys("Yerevan");
        WebElement State = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
        State.sendKeys("Center");
        //Select st = new Select(state);
        WebElement ZipElement=driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        ZipElement.sendKeys("0002");
        WebElement Country = driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
        WebElement Aditional =driver.findElement(By.xpath("//*[@id=\"other\"]"));
        WebElement phone= driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        WebElement mobailphone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        WebElement myadress = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        WebElement RegisterButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span/i"));
        RegisterButton.click();

    }

    }


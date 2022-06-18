package Tigran;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class PageTitleCopy {
   // @Test
    public static void  main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> elements = driver.findElements(By.xpath("//div[@itemprop='offers']"));
        //driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();
        ;
        Actions actions = new Actions(driver);
       // WebElement firstItm = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
              //  actions.moveToElement(firstItm);
        for (WebElement e : elements) {
            String value = e.getText();
            if (value.contains("%")) {
              //  System.out.println(value);
                actions.moveToElement(e).perform();
                driver.findElement(By.xpath("//div/a[@data-id-product=\"5\"]/span")).click();
                driver.findElement(By.xpath("//div/span[@title=\"Continue shopping\"]/span")).click();
                driver.findElement(By.xpath("//div/a[@data-id-product=\"7\"]/span")).click();
                driver.findElement(By.xpath("//div/a[@title=\"Proceed to checkout\"]/span")).click();
                driver.findElement(By.xpath("//p/a[@title=\"Proceed to checkout\"]/span")).click();
                driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("tttyhya@mail.ru");
                driver.findElement(By.xpath("//div/button[@id=\"SubmitCreate\"]/span")).click();
                driver.findElement(By.xpath("//label/div/span/input[@id=\"id_gender1\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("tatata");
                driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("atatat");
                driver.findElement(By.id("passwd")).sendKeys("55555");

                driver.findElement(By.id("uniform-days")).click();
                driver.findElement(By.xpath("//div/select[@id=\"days\"]/option[6]")).click();
                driver.findElement(By.id("uniform-months")).click();
                driver.findElement(By.xpath("//div/select[@id=\"months\"]/option[6]")).click();
                driver.findElement(By.id("uniform-years")).click();
                driver.findElement(By.xpath("//div/select[@id=\"years\"]/option[6]")).click();
                driver.findElement(By.id("newsletter")).click();
                driver.findElement(By.id("optin")).click();

                driver.findElement(By.id("address1")).sendKeys("atabgtb gftat");
                driver.findElement(By.id("city")).sendKeys("grggtrhegrgfs");
                driver.findElement(By.id("uniform-id_state")).click();
                driver.findElement(By.xpath("//div/select[@id=\"id_state\"]/option[6]")).click();
                driver.findElement(By.id("postcode")).sendKeys("00005");
                driver.findElement(By.id("uniform-id_country")).click();
                driver.findElement(By.xpath("//div/select[@id=\"id_country\"]/option[2]")).click();
                driver.findElement(By.id("phone_mobile")).sendKeys("+374555000");
                driver.findElement(By.id("alias")).clear();
                driver.findElement(By.id("alias")).sendKeys("Armenia 05");


                driver.findElement(By.id("submitAccount")).click();
                driver.findElement(By.name("processAddress")).click();
                driver.findElement(By.id("cgv")).click();
                driver.findElement(By.name("processCarrier")).click();




            }
        //WebElement addToCardButton = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
        //addToCardButton.click();


      // WebElement ProceedToCheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        //actions.moveToElement(ProceedToCheckout);
        //ProceedToCheckout.click();
        /*for (WebElement e : elements) {
            String value = e.getText();
            if (value.contains("%")) {
                System.out.println(value);
                actions.moveToElement(e).perform();
            }
        }*/

        //driver.quit();
    }}
}
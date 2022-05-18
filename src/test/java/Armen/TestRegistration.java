package Armen;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;
import java.util.List;
public class TestRegistration {
    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        List<WebElement> seleElement = driver.findElements(By.xpath("//div[@itemprop ='offers']"));
        Actions actions = new Actions(driver);
        for (WebElement e : seleElement) {
            String volume = e.getText();
            if (volume.contains("%")) {
                actions.moveToElement(e).perform();
                driver.findElement(By.xpath("//div/a[@data-id-product=\"5\"]/span")).click();
                driver.findElement(By.xpath("//div/span[@title=\"Continue shopping\"]/span")).click();
                driver.findElement(By.xpath("//div/a[@data-id-product=\"7\"]/span")).click();
                driver.findElement(By.xpath("//div/a[@title=\"Proceed to checkout\"]/span")).click();
                driver.findElement(By.xpath("//p/a[@title=\"Proceed to checkout\"]/span")).click();
                driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("arm.28@gmail.com");
                driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
                driver.findElement(By.xpath("//*[@id=\"uniform-id_gender1\"]/span")).click();
                driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Armen");
                driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Harutyunyan");
                driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Arm2003348");
                driver.findElement(By.xpath("//div[@id=\"uniform-days\"]")).click();
                driver.findElement(By.xpath("//select[@id=\"days\"]/option[15]")).click();
                driver.findElement(By.xpath("//div[@id=\"uniform-months\"]")).click();
                driver.findElement(By.xpath("//select[@id=\"months\"]/option[11]")).click();
                driver.findElement(By.xpath("//div[@id=\"uniform-years\"]")).click();
                driver.findElement(By.xpath("//select[@id=\"years\"]/option[30]")).click();
                driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[7]/label")).click();
                driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[8]/label")).click();
                driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Teryan");
                driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Echmiadzin");
                driver.findElement(By.xpath("//div[@id=\"uniform-id_state\"]")).click();
                driver.findElement(By.xpath("//select[@id=\"id_state\"]/option[11]")).click();
                driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("21145");
                driver.findElement(By.xpath("//div[@id=\"uniform-id_country\"]")).click();
                driver.findElement(By.xpath("//select[@id=\"id_country\"]/option[2]")).click();
                driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("+37477442114");
                driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Vahan Teryan");
                driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
                driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
                driver.findElement(By.xpath("//*[@id=\"form\"]/div/p[2]/label")).click();
                driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();


            }

        }
    }
}


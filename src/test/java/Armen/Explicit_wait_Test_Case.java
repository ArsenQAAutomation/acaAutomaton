package Armen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit_wait_Test_Case {
    public static  void  main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement el = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]"));
       actions.moveToElement(el).perform();
       By More=By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]/span");
       wait.until(ExpectedConditions.elementToBeClickable (More)).click();
       By Quantity=By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]");
       wait.until(ExpectedConditions.presenceOfElementLocated(Quantity)).click();
       By Size=By.id("group_1");
       wait.until(ExpectedConditions.presenceOfElementLocated(Size)).click();
       By Size1=By.xpath("//*[@id=\"group_1\"]/option[2]");
       wait.until(ExpectedConditions.presenceOfElementLocated(Size1)).click();
       By Color =By.id("color_14");
       wait.until(ExpectedConditions.presenceOfElementLocated(Color)).click();
       By Add=By.xpath("//*[@id=\"add_to_cart\"]/button/span");
       wait.until(ExpectedConditions.presenceOfElementLocated(Add)).click();
       By checkout =By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
       wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();
       By checkout1 =By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
       wait.until(ExpectedConditions.presenceOfElementLocated(checkout1)).click();
       By Email =By.xpath("//*[@id=\"email\"]");
       wait.until(ExpectedConditions.presenceOfElementLocated(Email)).sendKeys("lj.28@gmail.com");
       By pas =By.xpath("//*[@id=\"passwd\"]");
       wait.until(ExpectedConditions.presenceOfElementLocated(pas)).sendKeys("Arm2003348");
       By Sing_in =By.xpath("//*[@id=\"SubmitLogin\"]/span");
       wait.until(ExpectedConditions.presenceOfElementLocated(Sing_in)).click();
       By checkout2 =By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
       wait.until(ExpectedConditions.presenceOfElementLocated(checkout2)).click();





    }
}

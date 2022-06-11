package AnnaVahanyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class MyFirstJavaClass {
    @Test
    public void testMethod()  throws InterruptedException{
        WebDriver driver;
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.get("http://automationpractice.com/index.php");
        String titel = driver.getTitle();
        assertEquals("My Store", titel);
        //driver.quit();
        String tit = driver.getTitle();
        String textElement = driver.findElement(By.xpath("/html/head/title")).getAttribute("text");

        assertEquals("My Store", textElement);
        // driver.quit();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@itemprop='offers']"));
        for (WebElement element : elements) {
            String s = element.getText();
            if (s.contains("%")) {
                System.out.println(s);
            }
        }

        WebElement el = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]"));
        //MouseHover
        Actions action = new Actions(driver);
        action.moveToElement(el).build().perform();
        //Find the first element and click on "Add Cart"
        Thread.sleep(2000);
        WebElement addToCardButton = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
        addToCardButton.click();
        Thread.sleep(3000);
        //Find "Proceed to checkout
        WebElement processTocheckoitButton = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        processTocheckoitButton.click();
        //Find "Proceed to checkout
        WebElement processTocheckout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
        processTocheckout.click();
        //Find "email" box element
        WebElement emailboxelement = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailboxelement.sendKeys("VVAnna1808@gmail.com");
        emailboxelement.click();
        WebElement pswdbox = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        pswdbox.sendKeys("123456");
        pswdbox.click();
        WebElement signinbutton = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
        signinbutton.click();
        WebElement errorbutton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
        action.moveToElement(errorbutton).build().perform();
        // Thread.sleep(2000);
        // String actual_error = driver.el1.getText();
        //  String expected_error = " Please enter your email";
        //Assert.assertEquals(actual_error, expected_error);
       // driver.quit();
    }


}










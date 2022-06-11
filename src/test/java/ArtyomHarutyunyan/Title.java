package ArtyomHarutyunyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Title {
   // public static void main(String[] args){
   @Tag("My Store")
   @Test
   void testGoogleAvailable() throws InterruptedException {

       WebDriver  driver= WebDriverManager.getInstance(ChromeDriver.class).create();


        driver.get("http://automationpractice.com");
        WebElement element = driver.findElement(By.tagName("title"));
       System.out.println("The title name is " + element.getAttribute("text"));
       assertEquals("My Store", element.getAttribute("text"));

       List <WebElement> elementofSaleProduct = driver.findElements(By.className("price-percent-reduction"));
       for(WebElement element23:elementofSaleProduct){
           if(element23.isDisplayed()){
               System.out.println("The price-percent-reduction is " + element23.getAttribute("text"));
               assertEquals("-5%", element23.getText());
           }

       }

//       List <WebElement> element9 = driver.findElements(By.xpath("//span[@ class ='price-percent-reduction']"));
//       for(WebElement element23:element9){
//          if(element23.isDisplayed()) {
//              System.out.println("The price-percent-reduction is " + element23.getAttribute("text"));
//              assertEquals("-20%", element23.getText());
//          }
//
//       }

        driver.quit();

    }
}




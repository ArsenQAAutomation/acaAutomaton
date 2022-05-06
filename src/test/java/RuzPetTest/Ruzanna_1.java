package RuzPetTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ruzanna_1 {
    @Test
    public void test(){
        WebDriver driver= WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.get("http://automationpractice.com/");
       // String tittel=driver.getTitle();
        String textElement = driver.findElement(By.xpath("/html/head/title")).getAttribute("text");

           assertEquals( "My Store", textElement);
      //  driver.quit();
    }
}

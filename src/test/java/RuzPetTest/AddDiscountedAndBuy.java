package RuzPetTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class AddDiscountedAndBuy {
    @Test
    public void mainTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("http://automationpractice.com/index.php");
    List<WebElement> allElements = driver.findElements(By.xpath("//*[@class='content_price']"));
for (WebElement ele : allElements) {
        String a = ele.getText();
        if (a.contains("%")) {
            System.out.println(a);
            Actions action;
            Action.moveToElement(allElements).perform();
            List<WebElement> all = driver.findElements(By.xpath())

    List<WebElement> all = driver.findElements(By.xpath("//span[contains(text(),'Add to cart')]"));
    for (WebElement one : all) {
        if (one.isDisplayed()) {
            one.click();
            WebElement close =driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
            close.click();
}}}}
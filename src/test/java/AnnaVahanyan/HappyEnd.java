package AnnaVahanyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

 public  class HappyEnd {
    @Test
    public void TestMethod() throws InterruptedException {
        WebDriver driver;
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        // WebElement el = driver.findElement(By.xpath("//*[@class=\"content_price\"]"));
        Actions actions = new Actions(driver);
        //  actions.moveToElement(el).build().perform();
        //Thread.sleep(2000);
        List<WebElement> AddToCart = driver.findElements(By.xpath("//*[@class='content_price']"));
        for (WebElement element : AddToCart) {
            String s = element.getText();
            System.out.println(s);
            if (s.contains("%") && element.isDisplayed()) {
                actions.moveToElement(element).perform();
                element.click();

            }
        }


        WebElement ClickAddButton = driver.findElement(By.xpath("//*[@title='Log in to your customer account']"));
        ClickAddButton.click();
        //Thread.sleep(10000);
        //WebElement cont = driver.findElement(By.xpath("//*[@class='icon-chevron-left left']"));
        //cont.click();
        WebElement ProceedElement = driver.findElement(By.xpath("//*[@title='View my shopping cart']"));
        ProceedElement.click();
      //  Thread.sleep(10000);
        WebElement ProceedElement2 = driver.findElement(By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']"));
        ProceedElement2.click();
       // Thread.sleep(10000);
        WebElement EmailElement = driver.findElement(By.xpath("//*[@name='email_create']"));
        EmailElement.sendKeys("VVAnna1808@gmail.com");
        WebElement CreatAnAcount = driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
        CreatAnAcount.click();
        WebElement ErrorMessage = driver.findElement(By.xpath("//*[text()='An account using this email address has already been registered. Please enter a valid password or request a new one. ']"));

        driver.quit();
    }

}










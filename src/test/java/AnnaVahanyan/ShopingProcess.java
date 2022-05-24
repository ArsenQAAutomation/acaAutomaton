package AnnaVahanyan;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class ShopingProcess {
    @Test
    public void TestMethod3() throws InterruptedException {
        WebDriver driver;
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
        Actions action = new Actions(driver);
        WebElement ThefirstElement = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div"));
        action.moveToElement(ThefirstElement).perform();
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"btn btn-default button button-medium\"]")));
        WebElement ProceedButton1= driver.findElement(By.xpath("//*[@class=\"btn btn-default button button-medium\"]"));
        ProceedButton1.click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"button btn btn-default standard-checkout button-medium\"]")));
       WebElement ProceedButton2=driver.findElement(By.xpath("//*[@class=\"button btn btn-default standard-checkout button-medium\"]"));
        ProceedButton2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email_create\"]")));
        WebElement EmailButton = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        EmailButton.sendKeys("rob.n07@mail.ru");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmitCreate\"]")));
        WebElement CreatAcountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
        CreatAcountButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender2")));
        WebElement GenderButton = driver.findElement(By.id("id_gender2"));
        GenderButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
        WebElement FirstNameButton = driver.findElement(By.id("customer_firstname"));
        FirstNameButton.sendKeys("Anna");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_lastname")));
        WebElement LastNameButton = driver.findElement(By.id("customer_lastname"));
        LastNameButton.sendKeys("Vahanyan");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement EmailCheckButton = driver.findElement(By.id("email"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
        WebElement PasswordButton = driver.findElement(By.id("passwd"));
        PasswordButton.sendKeys("12345678");

       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("days")));
        WebElement DayButton = driver.findElement(By.id("days"));

        DayButton.sendKeys("18");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("months")));
        WebElement MonthButton = driver.findElement(By.id("months"));

        MonthButton.sendKeys("August");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        WebElement YearButton = driver.findElement(By.xpath("//*[@id='years']"));
        YearButton.sendKeys("1982");
       // wait.until(ExpectedConditions.elementToBeClickable(By.id("optin")));
        WebElement SPButton = driver.findElement(By.id("optin"));
        SPButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='address1']")));
        WebElement AddressButton = driver.findElement(By.xpath("//*[@id='address1']"));
        AddressButton.sendKeys("Pushkin 1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='city']")));
        WebElement CityButton = driver.findElement(By.xpath("//*[@name='city']"));
        CityButton.sendKeys("Yerevan");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_state']")));
        WebElement StateButton = driver.findElement(By.xpath("//*[@id='id_state']"));
        StateButton.sendKeys("Alabama");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='postcode']")));
        WebElement ZipCodeButton = driver.findElement(By.xpath("//*[@id='postcode']"));
        ZipCodeButton.sendKeys("00002");
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_country']")));
        WebElement CountryButton = driver.findElement(By.xpath("//*[@id='id_country']"));
        CountryButton.sendKeys("USA");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone_mobile")));
        WebElement MobailButton = driver.findElement(By.id("phone_mobile"));
        MobailButton.sendKeys("098765433");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alias")));
        WebElement AliasButton = driver.findElement(By.id("alias"));
        AliasButton.sendKeys("Amiryan 5 ");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='submitAccount']")));
        WebElement RegisterButton = driver.findElement(By.xpath("//*[@id='submitAccount']"));
        RegisterButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='button btn btn-default button-medium']")));
        WebElement ProceedButton4 = driver.findElement(By.xpath("//*[@class='button btn btn-default button-medium']"));
        ProceedButton4.click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cgv']")));
        WebElement button = driver.findElement(By.xpath("//*[@id='cgv']"));
        button.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='processCarrier']")));
        WebElement ProceedButton5 = driver.findElement(By.xpath("//*[@name='processCarrier']"));
        ProceedButton5.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Pay by bank wire']")));
        WebElement BankCard = driver.findElement(By.xpath("//*[@title='Pay by bank wire']"));
        BankCard.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button-exclusive btn btn-default']")));
        WebElement ConfirmButton = driver.findElement(By.xpath("//*[@class='button-exclusive btn btn-default']"));
        ConfirmButton.click();
       driver.quit();
    }
}






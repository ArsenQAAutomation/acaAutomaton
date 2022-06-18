package ArtyomHarutyunyan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Tag;
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

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkout {
    @Tag("My Store")
    @Test
    void checkouttest() throws InterruptedException {

        WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.get("http://automationpractice.com");
//        WebElement element = driver.findElement(By.tagName("title"));
//        System.out.println("The title name is " + element.getAttribute("text"));
//        assertEquals("My Store", element.getAttribute("text"));


        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        WebElement elem1 = driver.findElement(By.xpath("//*[@id=\\\"homefeatured\\\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
        action.moveToElement(elem1).perform();
        driver.findElement(By.xpath("//*[@id=\\\"homefeatured\\\"]/li[1]/div/div[2]/div[2]/a[1]/span")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]")));
        WebElement elem2= driver.findElement(By.xpath("//*[@id=\\\"layer_cart\\\"]/[1]/div[2]/div[4]/a/span"));
        elem2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]")));
        WebElement elem3=driver.findElement(By.xpath("//*[@id=\\\"center_column\\\"]/p[2]/a[1]/span"));
        elem3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email_create\"]")));
        WebElement EmailButton = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        EmailButton.sendKeys("asd120@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmitCreate\"]")));
        WebElement CreateanAccountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
        CreateanAccountButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id_gender1\"]")));
        WebElement GenderButton1 = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        GenderButton1.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"id_gender2\\\"]")));
        WebElement GenderButton2 = driver.findElement(By.xpath("//*[@id=\\\"id_gender2\\\"]"));
        GenderButton2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customer_firstname\"]")));
        WebElement FirstNameButton = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        FirstNameButton.sendKeys("arafaefv");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"customer_lastname\\\"]")));
        WebElement LastNameButton = driver.findElement(By.xpath("//*[@id=\\\"customer_lastname\\\"]"));
        LastNameButton.sendKeys("farafaefv");
        /////
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
        WebElement EmailCheckfield = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        /////
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"passwd\"]")));
        WebElement PasswordButton = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        PasswordButton.sendKeys("123qwe");
        WebElement DayButton = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        DayButton.sendKeys("12");
        WebElement MonthButton = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        MonthButton.sendKeys("June");
        WebElement YearButton = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        YearButton.sendKeys("1993");
        WebElement CheckButton1 = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
        CheckButton1.click();
        WebElement CheckButton2 = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
        CheckButton2.click();
        ////
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"firstname\"]")));
        WebElement Firstnamefield = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lastname\"]")));
        WebElement Lastnamefield = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
        ///
        WebElement CompanyButton = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        CompanyButton.sendKeys("btrbtbe");
        WebElement Address1Button = driver.findElement(By.xpath("//*[@id='address1']"));
        Address1Button.sendKeys("sdaef,srgrg,erte,asd");
        WebElement Address2Button = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
        Address2Button.sendKeys("sfbsbs,se,gse,sdve");
        WebElement CityButton = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        CityButton.sendKeys("fbfsb");
        WebElement StateButton = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
        StateButton.sendKeys("Alabama");
        WebElement PostalcodeButton = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
        PostalcodeButton.sendKeys("538");
        WebElement CountryButton = driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
        CountryButton.sendKeys("United States");
        WebElement AddinfoButton = driver.findElement(By.xpath("//*[@id=\"other\"]"));
        AddinfoButton.sendKeys("");
        WebElement HomephoneButton = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        HomephoneButton.sendKeys("");
        WebElement MobilephoneButton = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        MobilephoneButton.sendKeys("");
        WebElement otheraddressButton = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
        otheraddressButton.sendKeys("");
        WebElement Registerbutton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        Registerbutton.click();










//        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
//        element2.click();
//        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
//        element3.click();
//        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
//        element4.click();
//        WebElement element5 = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
//        element5.sendKeys("asd120@gmail.com");
//        element5.click();
//        WebElement element6 = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
//        element6.click();
//        WebElement element7 = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
//        element7.click();
//        WebElement element8 = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
//        element8.sendKeys("arafaefv");
//        element8.click();
//        WebElement element9 = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
//        element9.sendKeys("farafaefv");
//        element9.click();
//        WebElement element10 = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
//        element10.sendKeys("123qwe");
//        element10.click();
//        WebElement element11 = driver.findElement(By.xpath("//*[@id=\"uniform-days\"]"));
//        element11.
//        element11.click();
//        WebElement element12 = driver.findElement(By.xpath("//*[@id=\"uniform-months\"]"));
//        element12.
//        element12.click();
//        WebElement element13 = driver.findElement(By.xpath("//*[@id=\"uniform-years\"]"));
//        element13.
//        element13.click();
//        WebElement element14 = driver.findElement(By.xpath("//*[@id=\"uniform-newsletter\"]"));
//        element14.click();
//        WebElement element15 = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
//        element15.click();
//        WebElement element16 = driver.findElement(By.xpath("//*[@id=\"company\"]"));
//        element16.sendKeys("btrbtbe");
//        element16.click();
//        WebElement element17 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
//        element17.sendKeys("sdaef,srgrg,erte,asd");
//        element17.click();
//        WebElement element18 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
//        element18.sendKeys("sfbsbs,se,gse,sdve");
//        element18.click();
//        WebElement element19 = driver.findElement(By.xpath("//*[@id=\"city\"]"));
//        element19.sendKeys("fbfsb");
//        element19.click();
//        WebElement element20 = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
//        element20.
//        element20.click();
//        WebElement element21 = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
//        element21.sendKeys("538");
//        element21.click();
//        WebElement element22 = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
//        element22.
//        element22.click();
//        WebElement element23 = driver.findElement(By.xpath("//*[@id=\"other\"]"));
//        element23.sendKeys("none");
//        element23.click();
//        WebElement element24 = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
//        element24.sendKeys("");
//        WebElement element25 = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
//        element25.sendKeys("");
//        element25.click();
//        WebElement element26 = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
//        element26.sendKeys("");
//        element26.click();
//        WebElement element27 = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
//        element27.click();


    }
}
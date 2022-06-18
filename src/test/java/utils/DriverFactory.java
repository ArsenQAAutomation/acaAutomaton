package utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.HashMap;



public class DriverFactory {
    public WebDriver driver;



    public DriverFactory() {

    }

    public void initDriver(String siteUrl, Boolean remote) {
        driver = WebDriverManager.getInstance(ChromeDriver.class).create();
        driver.manage().window().maximize();
        driver.get(siteUrl);
    }

}


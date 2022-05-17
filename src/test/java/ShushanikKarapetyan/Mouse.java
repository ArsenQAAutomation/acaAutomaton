package ShushanikKarapetyan;

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

    public class Mouse {
        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = WebDriverManager.getInstance(ChromeDriver.class).create();

            driver.manage().window().maximize();
            driver.get("https://www.browserstack.com/");

            ((JavascriptExecutor) driver).executeScript("scroll(0,300)");

            Actions ac = new Actions(driver);

            WebElement live= driver.findElement(By. cssSelector("div.product-cards-wrapper--click a[title='Live']"));
            ac.moveToElement(live).build().perform();

            Thread.sleep(3000);

            WebElement automate= driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='App Automate']"));

            automate.click();

            Thread.sleep(2000);

            //Thread.sleep(4000);

            driver.quit();
        }

    }

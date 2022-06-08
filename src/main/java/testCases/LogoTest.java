package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class LogoTest extends BaseClass{

    @Test(description = "Test logos functionality")
    public void logoTest(){
        HomePage hp = new HomePage(driver);
        String homePageTitle = driver.getTitle();
        hp.delayClickOnFirstItem();
        hp.delayClickOnLogo();
        String title = driver.getTitle();
        Assert.assertEquals(title, homePageTitle);
    }

}

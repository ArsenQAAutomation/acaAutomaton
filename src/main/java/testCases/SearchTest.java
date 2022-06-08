package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class SearchTest extends BaseClass{
    @Test(description = "Test search box functionality")
    public void searchTest(){
        HomePage hp = new HomePage(driver);
        String expectedSearchTitle = "Search - My Store";
        hp.delaySendKeyOnSearchBox("T-Shirt");
        hp.clickOnSearchButton();
        String actualSearchTitle = driver.getTitle();
        Assert.assertEquals(actualSearchTitle,expectedSearchTitle);
    }
}

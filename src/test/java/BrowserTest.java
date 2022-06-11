
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class BrowserTest extends BaseTest {


    @Test
    void testGoogleAvailable() throws InterruptedException {

        homePageActions.clickOnLogo();
        homePageActions.clickOnFiorstItem();
        productDetails.clickOnAddToCartButton();
        homePageActions.clickOnLogo();
        Assert.assertEquals(homePageActions.getTextFromEsimINch(), "isssss");
        Thread.sleep(4000);

    }


}
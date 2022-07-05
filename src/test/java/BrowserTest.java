
import org.junit.jupiter.api.Test;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
=======
>>>>>>> 4c8bfdaf5d9972d73690dfc003632309ac841f17
import org.testng.Assert;


public class BrowserTest extends BaseTest {


    @Test
    void testGoogleAvailable() throws InterruptedException {

        homePageActions.clickOnLogo();
<<<<<<< HEAD
        homePageActions.clickOnFiorstItem();
        productDetails.clickOnAddToCartButton();
        homePageActions.clickOnLogo();
        Assert.assertEquals(homePageActions.getTextFromEsimINch(), "isssss");
        Thread.sleep(4000);

=======
        newsLetterPage.addEmailTextToEmailInoutFiled("kuku@mailinator.com");
        Assert.assertEquals(newsLetterPage.getTextFromNewsletterLabel(), "My Store");
        newsLetterPage.clickOnSubmitNewsletterButton();
>>>>>>> 4c8bfdaf5d9972d73690dfc003632309ac841f17
    }


}
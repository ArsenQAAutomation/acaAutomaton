
import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class BrowserTest extends BaseTest {


    @Test
    void testGoogleAvailable() throws InterruptedException {

        //homePageActions.clickOnLogo();
        //Thread.sleep(300);
        newsLetterPage.addEmailTextToEmailInoutFiled("kuku@mailinator.com");
        Assert.assertEquals(newsLetterPage.getTextFromNewsletterLabel(), "Newsletter");
        newsLetterPage.clickOnSubmitNewsletterButton();
    }


}
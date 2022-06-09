
import org.junit.jupiter.api.Test;


public class BrowserTest extends BaseTest {


    @Test
    void testGoogleAvailable() throws InterruptedException {

        homePageActions.clickOnLogo();
        homePageActions.clickOnFiorstItem();
        productDetails.clickOnAddToCartButton();
        homePageActions.clickOnLogo();
        Thread.sleep(4000);

    }


}
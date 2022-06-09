import Pages.homePage.ProductSelectionPage;
import Pages.productDetails.ProductDetails;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class BaseTest extends DriverFactory {
    //region <Page Class Instance Declaration>
    public ProductSelectionPage homePageActions;
    public ProductDetails productDetails;
    //endregion


    public static final String ENVIRONMENT_URL = "http://automationpractice.com/index.php";
    private final boolean REMOTE = false;


    public BaseTest() {
    }



    @BeforeEach
    public void setup() {
        try {
            super.initDriver(ENVIRONMENT_URL, REMOTE);
        } catch (org.openqa.selenium.TimeoutException exception) {
            super.initDriver(ENVIRONMENT_URL, REMOTE);
        }
        //region <Page Class Instance Initialization >
        homePageActions = PageFactory.initElements(driver, ProductSelectionPage.class);
        productDetails = PageFactory.initElements(driver, ProductDetails.class);
        //endregion
    }

    @AfterEach
    public void afterMethod() {
        try {
            this.driver.quit();
        } catch (Exception exception) {

        }
    }
}
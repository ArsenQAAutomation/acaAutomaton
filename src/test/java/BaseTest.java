import Pages.ContractUs.ContactUs;
import Pages.SignUpSignIn.SignUpSignIn;
import Pages.homePage.ProductSelectionPage;
import Pages.productDetails.ProductDetails;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class BaseTest extends DriverFactory {
    //region <Page Class Instance Declaration>
    public ProductSelectionPage homePageActions;
    public ProductDetails productDetails;
    public Pages.ContractUs.ContactUs ContactUs;
    //endregion
    public SignUpSignIn signUpSignIn;

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
        signUpSignIn = PageFactory.initElements(driver,SignUpSignIn.class);
        ContactUs = PageFactory.initElements(driver, ContactUs.class);
        //endregion
    }

    @AfterEach
    public void afterMethod() {
        try {
            this.driver.quit();
        } catch (Exception exception) {

        }
    }
    public String generateRandomEmail(){
        String randomEmail;
        String generatedString = RandomStringUtils.randomAlphanumeric(10);
        randomEmail = generatedString + "@gmail.com";
        return randomEmail;
    }
}
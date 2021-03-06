
import Pages.Newsletter.NewsLetterPage;
import Pages.ContractUs.ContactUs;
import Pages.Shipping.Shipping;
import Pages.SignUpSignIn.SignUpSignIn;
import Pages.homePage.ProductSelectionPage;
//import Pages.productDetails.ProductDetails;
import Pages.women.WomenPage;
import Pages.yourAddress.YourAddress;
import Pages.yourPersonalInformation.YourPersonalInformation;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class BaseTest extends DriverFactory {
    //region <Page Class Instance Declaration>
    public ProductSelectionPage homePageActions;
    //public ProductDetails productDetails;
    public SignUpSignIn signUpSignIn;
    public NewsLetterPage newsLetterPage;
    //public Pages.ContractUs.ContactUs ContactUs;
    public ContactUs contactUs;
    //public ProductDetails productDetails;
    public YourPersonalInformation yourPersonalInformation;
    public YourAddress yourAddress;
    public WomenPage womenPage;
    public Shipping shipping;
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
       // productDetails = PageFactory.initElements(driver, ProductDetails.class);
        //productDetails = PageFactory.initElements(driver, ProductDetails.class);
        signUpSignIn = PageFactory.initElements(driver,SignUpSignIn.class);
        contactUs = PageFactory.initElements(driver, ContactUs.class);
        newsLetterPage = PageFactory.initElements(driver, NewsLetterPage.class);
        //ContactUs = PageFactory.initElements(driver, ContactUs.class);
        yourPersonalInformation=PageFactory.initElements(driver,YourPersonalInformation.class);
        yourAddress = PageFactory.initElements(driver,YourAddress.class);
        womenPage = PageFactory.initElements(driver, WomenPage.class);
        shipping =PageFactory.initElements(driver,Shipping.class);
        //endregion
    }

    @AfterEach
    public void afterMethod() {
        try {
           // this.driver.quit();
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
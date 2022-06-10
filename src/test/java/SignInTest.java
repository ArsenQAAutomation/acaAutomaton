import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SignInTest extends BaseTest {


    @Test
    public void titleTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        String actualTitle = signUpSignIn.getPageTitle();
        String expectedTitle = "Login - My Store";
        Assertions.assertEquals(expectedTitle, actualTitle, "Expected title of the page is <<Login - My Store>> ");
    }

    @Test
    public void pageHeaderTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        String actualText = signUpSignIn.getPageHeading();
        String expectedText = "AUTHENTICATION";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<AUTHENTICATION>> ");
    }

    @Test
    public void createAccountHeaderTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        String actualText = signUpSignIn.getCreateAccountHeading();
        String expectedText = "CREATE AN ACCOUNT";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<CREATE AN ACCOUNT>> ");


    }

    @Test
    public void signInHeaderTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        String actualText = signUpSignIn.getSignInHeading();
        String expectedText = "ALREADY REGISTERED?";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<ALREADY REGISTERED?>> ");
    }

    @Test
    public void createAnAccountTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        signUpSignIn.sendTextEmailCreate(super.generateRandomEmail());
        signUpSignIn.clickButtonCreateAnAccount();
        String actualText = signUpSignIn.getRegisterPageHeader();
        String expectedText = "YOUR PERSONAL INFORMATION";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<YOUR PERSONAL INFORMATION>> ");
    }

    @Test
    public void SignInTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        signUpSignIn.sendTextEmail("123456");
        signUpSignIn.sendTextPassword("123456");
        signUpSignIn.clickButtonSignIn();
        if (signUpSignIn.getErrorText().equals("There is 1 error")) {
            Assertions.assertTrue(true);
        } else {
            Assertions.fail();
        }
    }

}

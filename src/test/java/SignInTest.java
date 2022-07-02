import io.qameta.allure.*;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class SignInTest extends BaseTest {

    SoftAssertions softAssertions =new SoftAssertions();

    @Test()
    @Severity(SeverityLevel.MINOR)
    @Epic("SignIn Page: SignIn Page Title Test")
    @Feature("Title Test")
    @Description("Validate SignIn Page Title")
    public void titleTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        String actualTitle = signUpSignIn.getPageTitle();
        String expectedTitle = "Login - My Store";
        Assertions.assertEquals(expectedTitle, actualTitle, "Expected title of the page is <<Login - My Store>> ");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("SignIn Page: SignIn Page Header Test")
    @Feature("Header Test")
    @Description("Validate SignIn Page Header")
    public void pageHeaderTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        String actualText = signUpSignIn.getPageHeading();
        String expectedText = "AUTHENTICATION";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<AUTHENTICATION>> ");
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("SignIn Page: SignIn Page Create Account Header Test")
    @Feature("Create Account header Test")
    @Description("Validate SignIn Page Header of Create Account")
    public void createAccountHeaderTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        String actualText = signUpSignIn.getCreateAccountHeading();
        String expectedText = "CREATE AN ACCOUNT";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<CREATE AN ACCOUNT>> ");


    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("SignIn Page: SignIn Page SignIn Header Test")
    @Feature("SignIn Header Test")
    @Description("Validate SignIn Page Header of SignIn")
    public void signInHeaderTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        String actualText = signUpSignIn.getSignInHeading();
        String expectedText = "ALREADY REGISTERED?";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<ALREADY REGISTERED?>> ");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("SignIn Page: SignIn Page Create Account Positive Test")
    @Feature("Create Account Test")
    @Description("Validate SignIn Page Functionality of Create Account")
    public void createAnAccountPositiveTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        signUpSignIn.sendTextEmailCreate(super.generateRandomEmail());
        signUpSignIn.clickButtonCreateAnAccount();
        String actualText = signUpSignIn.getRegisterPageHeader();
        String expectedText = "YOUR PERSONAL INFORMATION";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<YOUR PERSONAL INFORMATION>> ");
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("SignIn Page: SignIn Page Create Account With Repeating Email")
    @Feature("Create Account Test Negative test")
    @Description("Validate SignIn Page Functionality of Create Account With Repeating Email")
    public void createAnAccountRepeatEmailTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        signUpSignIn.sendTextEmailCreate("TestEmailHelloWorld@gmail.com");
        signUpSignIn.clickButtonCreateAnAccount();
        String actualText = signUpSignIn.getRepeatEmailErrorText();
        String expectedText = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
        Assertions.assertEquals(expectedText, actualText, "Expected header of the page is <<YOUR PERSONAL INFORMATION>> ");
    }


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("SignIn Page: SignIn Page Create Account With Negative Inputs")
    @Feature("Create Account Test Negative test")
    @Description("Validate SignIn Page Functionality of Create Account With Invalid Email")
    public void signInNegativeTest() {
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

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Epic("SignIn Page: SignIn Functionality")
    @Feature("SignIn Test")
    @Description("Validate SignIn Functionality with positive values")
    public void signInPositiveTest() {
        signUpSignIn.clickButtonBasePageSignIn();
        signUpSignIn.sendTextEmail("TestEmailHelloWorld@gmail.com");
        signUpSignIn.sendTextPassword("123456");
        signUpSignIn.clickButtonSignIn();
        Assertions.assertEquals("My account - My Store", signUpSignIn.getPageTitle());
    }



    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("SignIn Page: All Links")
    @Feature("Link Test")
    @Description("Validate All Links Connection in SignIn Page")
    public void signInPageLinksTest() throws IOException {
        signUpSignIn.clickButtonBasePageSignIn();
        for (WebElement link:signUpSignIn.links){
            String url = link.getAttribute("href");
            if (url.equals(null)|| url.isEmpty()){
                softAssertions.fail("Its a empty link -->" + link.getText());
            }
            else{
                try {
                    URL Url = new URL(url);
                    HttpURLConnection connection = (HttpURLConnection) Url.openConnection();
                    connection.setConnectTimeout(2000);
                    connection.connect();
                    int cod = connection.getResponseCode();
                    if (cod>=400){
                        softAssertions.fail(url + "  <-- Not Valid URL");
                    }
                    else {
                        Assertions.assertTrue(true,url + "  <-- Valid URL");
                    }
                }
                catch (Exception e){
                    softAssertions.fail("We have Exception on link -->" + url + "  Exception is " + e);

                }
            }
        }
        softAssertions.assertAll();
    }


}

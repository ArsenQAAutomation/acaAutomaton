import io.qameta.allure.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class YourAddressTest extends BaseTest {

    @Test

public void testValidateTitle()  {
        signUpSignIn.clickButtonBasePageSignIn(); // click on the button "sign in" on right top og the page
        String actualResult = signUpSignIn.getPageTitle();
        String expectedResult = "Login - My Store123";
        Assertions.assertEquals(expectedResult,actualResult);
    }
@Test

    public void creatAcount(){
    signUpSignIn.clickButtonCreateAnAccount();// click on the "create an account" button and write some email
    String actualResult = RandomStringUtils.randomAlphanumeric(123);
    String expectedResult = "generatedString + \"@gmail.com\"";
    Assertions.assertEquals(expectedResult,actualResult);
}
@Test

    public void firstName(){
        yourAddress.enterFirstName("Lilit");
//        String actualResult = yourAddress.
}

@Test

    public void lastName(){
        yourAddress.enterLastName("Tumanyan");
}
    @Test

    public void company(){
        yourAddress.enterCompany("AcaAcademy");
    }
@Test

    public void address(){
        yourAddress.enterAddress("Vagharshyan");
}

@Test

    public void address2(){
        yourAddress.enterAddress2("Komitas");
}
@Test

    public void city(){
        yourAddress.enterCity("Yerevan");
        yourAddress.enterCity("Moscow");// karogh em senc grel?
}
@Test

    public void state(){
        yourAddress.selectState("abc");
}
@Test

    public void ziPostalCode(){
        yourAddress.enterPostCode("123");
}
@Test

    public void country(){
        yourAddress.selectCountry("Armenia");
}
@Test

    public void info(){
        yourAddress.enterInfo("abcd");
}
@Test

    public void homePhone(){
        yourAddress.enterHomePhone("010123441");
}
@Test

    public void mobilePhone(){
        yourAddress.enterMobilePhone("099123456");
}
@Test

    public void alias(){
        yourAddress.enterAlias("efgh");
}
@Test

    public void registerButton(){
        yourAddress.clickOnRegisterButton("");// ete click petq a ani, el inch petq a lracvi, vor text a uzum
}

}


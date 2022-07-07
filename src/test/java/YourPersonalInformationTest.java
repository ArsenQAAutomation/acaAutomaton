import Pages.SignUpSignIn.SignUpSignIn;
import org.junit.jupiter.api.Test;

class YourPersonalInformationTest  extends BaseTest{


    @Test
  public void MyTestMethod()

  {
      signUpSignIn.clickButtonBasePageSignIn();
      signUpSignIn.sendTextEmailCreate("sfdhhg@gmail.com");
      signUpSignIn.clickButtonCreateAnAccount();

    /* yourPersonalInformation.SendEmail("abcd@gmail.com");
      yourPersonalInformation.Submit();*/
      yourPersonalInformation.Gender();
      yourPersonalInformation.FirstName("Anna");
      yourPersonalInformation.LastName("Vahanyan");
      yourPersonalInformation.EmailButton2("erdfg@gmail.com");
      yourPersonalInformation.Password("12345");
      yourPersonalInformation.Day("10");
      yourPersonalInformation.Month("5");
      yourPersonalInformation.Year("2022");
      yourPersonalInformation.LastAction();
  }



}

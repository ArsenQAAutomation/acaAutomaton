import Pages.SignUpSignIn.SignUpSignIn;
import org.junit.jupiter.api.Test;

class YourPersonalInformationTest  extends BaseTest{

    @Test
 public void GorsTestMethod(){
        signUpSignIn.clickButtonBasePageSignIn();
        signUpSignIn.sendTextEmail("sfdhhg@gmail.com");
    }
    @Test
  public void MyTestMethod()

  {

      yourPersonalInformation.SendEmail(super.generateRandomEmail());
      yourPersonalInformation.Submit();
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

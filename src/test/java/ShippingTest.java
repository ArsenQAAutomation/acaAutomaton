
import Pages.SignUpSignIn.SignUpSignIn;
import org.junit.jupiter.api.Test;

public class ShippingTest extends  BaseTest{
    @Test
    public  void  signin(){
        signUpSignIn.clickButtonBasePageSignIn();
        signUpSignIn.sendTextEmail("dfac@gmail.com");

    }



    @Test
    public void backinAddress(){

        shipping.backAddress.click();
    }
    @Test
    public void proceedToCheckout(){
        shipping.proceedToCheckout.click();
    }

}

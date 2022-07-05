
import org.junit.jupiter.api.Test;

public class ShippingTest extends  BaseTest{
    @Test
    public void backinAddress(){

        shipping.backAddress.click();
    }
    @Test
    public void proceedToCheckout(){
        shipping.proceedToCheckout.click();
    }

}

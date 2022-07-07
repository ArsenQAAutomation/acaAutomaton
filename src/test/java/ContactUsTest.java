import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class ContactUsTest extends BaseTest {
    @Test
    public void testingContactUs(){
        contactUs.titlepage();
        Assertions.assertEquals("Contact us - My Store", contactUs.getPageTitle(), "Expected title of the page is 'Contact us - My Store' ");
        String customerservice = "Customer service";
        String Webmaster = "Webmaster";
        contactUs.selectDropDownItemByName(contactUs.formchoose, customerservice);
        contactUs.Emailaddress("Asd123456@gmail.com");
        contactUs.OrderReference("123456");
        contactUs.AttachFile();
        contactUs.Message("some information");
        contactUs.Send();
    }
}


import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class WomenPageSizeCheckTest extends BaseTest{
        @Test
        public void testValidateDressSizeCheck() {
            womenPage.clickOnWomenTitleMenuButton();
            womenPage.clickOnDressCheckBox();
            womenPage.clickOnSizeMCheckbox();
            womenPage.clickOnSizeSCheckbox();
            Assert.assertEquals(womenPage.getTextFromCartAddedProductInfo(), "Dress");
            Assert.assertEquals(womenPage.getTextFromCartAddedProductInfo(), "S");
            Assert.assertEquals(womenPage.getTextFromCartAddedProductInfo(), "M");

    }
}

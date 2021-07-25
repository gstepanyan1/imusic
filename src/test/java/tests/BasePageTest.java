package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utils.ActionHelper;
import utils.DriverFactory;

public class BasePageTest extends BaseTest {

    @Test
    void test1(){
        BasePage b = new BasePage();
        DriverFactory.getDriver().get("https://imusic.am/user/profile");
        ActionHelper.clickOnElement(b.returnBut());
        sleep(3);
    }
}

package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.*;

@Epic("Login module")
@Feature("Home page Title")
public class LoginTest extends BaseTest {
    @Test(description = "verify that Home page title is correct")
    @Severity(SeverityLevel.NORMAL)
    @Story("Check Home Page Title")
    @Description("Test Description: verifying the title of home page ")
    public void verifyHomePageTitle() {
        String title=driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise");
    }
}

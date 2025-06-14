package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= DriverFactory.initDriver();
        driver.get("https://automationexercise.com/");
    }
    @AfterMethod
    public void tearDown(){
DriverFactory.quitDriver();
}
}
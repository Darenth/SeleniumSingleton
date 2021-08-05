package base;


import base.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

public class BaseTests {

    WebDriver driver;
    WebDriverWait wait;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebDriverWait();
        goHome();
        homePage = new HomePage(driver);

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}

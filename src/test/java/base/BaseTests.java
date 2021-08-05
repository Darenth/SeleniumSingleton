package base;


import base.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }


}

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

    @BeforeClass (alwaysRun = true)
    public void setUp() {
       // System.out.println("BeforeSuite");
        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebDriverWait();
        goHome();
        homePage = new HomePage(driver);

    }
    @BeforeMethod (alwaysRun = true)
    public void goHome(){
        System.out.println(driver==null);
        if(driver==null){
            driver = getChromeDriver();}
        driver.get("https://the-internet.herokuapp.com/");
        //System.out.println("BeforeMethod");
    }



    @AfterSuite (alwaysRun = true)
    public void tearDown() {
        //System.out.println("AfterSuite");
        driver.quit();
    }


}

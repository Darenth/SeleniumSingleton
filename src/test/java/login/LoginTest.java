package login;

import base.BaseTests;
import base.pages.LoginPage;
import base.pages.SecurePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {

    @Test(groups = {"LoginTest","regressionTests"})
    public void testSucessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLoginButton();
        System.out.println(securePage.getAlertStatus());
        assertTrue(securePage.getAlertStatus().contains("You logged into a secure area"),"Alert text is not correct");
    }
}

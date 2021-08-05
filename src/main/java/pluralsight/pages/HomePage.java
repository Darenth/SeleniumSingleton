package pluralsight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static pluralsight.DriverFactory.getChromeDriver;
public class HomePage {

    WebDriver driver=getChromeDriver();

    public void search(String value) {
        WebElement magnifierButton= driver.findElement(By.className("ps-nav--primary"));
        WebElement search = driver.findElement(By.className("header_search--input"));
        magnifierButton.click();
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
    }
}

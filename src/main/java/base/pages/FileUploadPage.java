package base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.className("button");
    private By nameOfUploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getNameOfUploadedFile() {
        return driver.findElement(nameOfUploadedFile).getText();
    }

}

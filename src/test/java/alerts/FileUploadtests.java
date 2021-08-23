package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadtests extends BaseTests {

    @Test(groups = {"FileUploadtests","regressionTests"})
    public void testFileUpload(){
        var uploadPage= homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\Photo\\AsF9vYTw__Q.jpg");
        Assert.assertEquals(uploadPage.getNameOfUploadedFile(),"AsF9vYTw__Q.jpg");
    }
}

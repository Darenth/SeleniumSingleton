package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test(groups = {"DropdownTests","regressionTests"})
    public void testSelectOption() {
        var dropdown = homePage.clickDropdown();
        String option="Option 1";
        dropdown.selectFromDropdown(option);
        var selectedOption = dropdown.getSelectedOption();
        Assert.assertEquals(dropdown.getSelectedOption().size(),1," Incorrect number of seleted options");
        Assert.assertTrue(selectedOption.contains(option));
    }
}

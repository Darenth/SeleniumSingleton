package pluralsight;

import org.testng.annotations.Test;
import pluralsight.pages.HomePage;
import pluralsight.pages.SearchPage;

public class SearchTest extends BaseTestClass{
    HomePage homePage= new HomePage();
    SearchPage search = new SearchPage();



    public void basicFilterByTest(){
        homePage.search("Java");


        homePage.search("Java");

        search.filterBySkillLevel("Beginner");
        search.filterByRole("Software Development");
        search.selectTabCourse();
        search.selectCourse("Java Fundamentals: The Java Language");
    }

}

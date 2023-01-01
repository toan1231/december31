package tutorialsNinjiaLogin;

import org.testng.annotations.DataProvider;

public class TutorialsNinjiaLoginPageData {
    @DataProvider(name = "regression")
    public Object[][] method(){
        return new Object[][]{
                {"Chau", "Thai", "66790909997@gmail.com", "1234967", "Kiwismart1", "Kiwismart1"},

                {"binh","Thai","9667790990990@gmail.com","1234567","Kiwismart1","Kiwismart1"}};
        }

}

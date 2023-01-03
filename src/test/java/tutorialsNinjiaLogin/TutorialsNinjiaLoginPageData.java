package tutorialsNinjiaLogin;

import org.testng.annotations.DataProvider;

public class TutorialsNinjiaLoginPageData {
    @DataProvider(name = "regression")
    public Object[][] method(){
        return new Object[][]{
                {"Chau", "Thai", "66790ooopop909om997@gmail.com", "1234967", "Kiwismart1", "Kiwismart1"},

                {"binh","Thai","96677oo909opop909m990@gmail.com","1234567","Kiwismart1","Kiwismart1"}};
        }

}

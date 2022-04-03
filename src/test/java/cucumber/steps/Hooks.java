package cucumber.steps;

import extensions.Driver;
import pages.Pages;

public class Hooks {

    protected final String URL = "http://automationpractice.com/index.php";

    @cucumber.api.java.Before
    public void setup() {
        Pages.mainPage.openPage();
    }


    @cucumber.api.java.After
    public void teardown() {
        Driver.quit();
    }
}

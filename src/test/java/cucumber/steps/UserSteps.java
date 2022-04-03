package cucumber.steps;

import cucumber.api.java.en.When;
import pages.Pages;

public class UserSteps {
    @When("^User click the banner$")
    public void userClickTheBanner() {
        Pages.mainPage.clickBanner();
    }

    @When("^User click the Contact Us link$")
    public void userClickTheContactUsLink() {
        Pages.mainPage.clickContactUsLink();
    }

    @When("^User click Submit button$")
    public void userClickSubmitButton() {
        Pages.contactPage.clickSubmitButton();
    }

    @When("^User click Dresses title$")
    public void userClickDressesTitle() {
        Pages.mainPage.clickDressesTitle();
    }
}

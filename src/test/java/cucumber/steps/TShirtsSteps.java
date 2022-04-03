package cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Pages;

public class TShirtsSteps {
    @When("^User click the T-Shirts Category$")
    public void userClickTheTShirtsCategory() {
        Pages.mainPage.clickTShirtsCategory();
    }

    @Then("^New page is open\\. The header text is T-SHIRTS$")
    public void newPageIsOpenTheHeaderTextIsTSHIRTS() {
        Pages.tShirtsPage.headerTextTrue();
    }
}

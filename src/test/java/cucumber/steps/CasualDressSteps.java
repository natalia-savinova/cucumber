package cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Pages;

public class CasualDressSteps {
    @When("^User click checkbox Casual Dresses category$")
    public void userClickCheckboxCasualDressesCategory() {
        Pages.dressesPage.clickCheckboxCasualDressesCategory();
    }

    @Then("^Shown the results for Casual Dresses$")
    public void shownTheResultsForCasualDresses() {
        Pages.dressesPage.checkHeaderText();
    }
}

package cucumber.steps;

import config.Config;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Pages;

public class ContactUsSteps {
    @Then("^New page is open\\. New page link is https://www.prestashop.com/en$")
    public void newPageIsOpenNewPageLinkIs() {
    }

    @Then("^Alert Danger is shown$")
    public void alertDangerIsShown() {
        Pages.contactPage.checkAlertDangerText();
    }

    @When("^User elects Subject Heading Customer Service$")
    public void userElectsSubjectHeadingCustomerService() {
        Pages.contactPage.selectSubjectHeadingCustomerService();
    }

    @When("^User fills Email field$")
    public void userFillsEmailField() {
        Pages.contactPage.fillEmailField(Config.correctEmail);
    }

    @When("^User fills Message Field$")
    public void userFillsMessageField() {
        Pages.contactPage.fillMessageField(Config.messageText);
    }

    @When("^User click Submit Button$")
    public void userClickSubmitButton() {
        Pages.contactPage.clickSubmitButton();
    }

    @Then("^Alert Success is shown$")
    public void alertSuccessIsShown() {
        Pages.contactPage.checkAlertSuccessText();
    }
}

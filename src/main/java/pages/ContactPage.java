package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactPage extends BasePage{

    private By subjectHeadingCustomerService = By.xpath("//select/option[@value = '2']");
    private By emailField = By.cssSelector("#email");
    private By messageField = By.cssSelector("#message");
    private By submitButton = By.xpath("//button[@name = 'submitMessage']");
    private By alertDanger = By.xpath("//div[@class = 'alert alert-danger']");
    private By alertSuccess = By.xpath("//p[@class = 'alert alert-success']");

    public ContactPage() {
    }

    @Step("Click submit button")
    public ContactPage clickSubmitButton() {
        getElement(submitButton).click();
        return this;
    }

    @Step("Select option Subject Heading Customer Service")
    public ContactPage selectSubjectHeadingCustomerService() {
        getElement(subjectHeadingCustomerService).click();
        return this;
    }

    @Step("Fill the email field with email {email}")
    public ContactPage fillEmailField(String email) {
        getElement(emailField).sendKeys(email);
        return this;
    }

    @Step("Fill the message field with text {message}")
    public ContactPage fillMessageField(String message) {
        getElement(messageField).sendKeys(message);
        return this;
    }

    @Step("Check Alert Danger text")
    public ContactPage checkAlertDangerText() {
        assertTrue(getElement(alertDanger).getText().contains("Invalid email address"), "Alert text is incorrect");
        return this;
    }

    @Step("Check Alert Success text")
    public ContactPage checkAlertSuccessText() {
        assertTrue(getElement(alertSuccess).getText().contains("Your message has been successfully sent to our team."),
                "Alert text is incorrect");
        return this;
    }
}

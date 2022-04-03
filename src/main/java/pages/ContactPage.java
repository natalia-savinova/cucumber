package pages;

import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class ContactPage extends BasePage{

    private By subjectHeadingCustomerService = By.xpath("//select/option[@value = '2']");
    private By emailField = By.cssSelector("#email");
    private By messageField = By.cssSelector("#message");
    private By submitButton = By.xpath("//button[@name = 'submitMessage']");
    private By alertDanger = By.xpath("//div[@class = 'alert alert-danger']");
    private By alertSuccess = By.xpath("//p[@class = 'alert alert-success']");


    public ContactPage() {
    }

    public ContactPage clickSubmitButton() {
        getElement(submitButton).click();
        return this;
    }

    public ContactPage selectSubjectHeadingCustomerService() {
        getElement(subjectHeadingCustomerService).click();
        return this;
    }

    public ContactPage fillEmailField(String email) {
        getElement(emailField).sendKeys(email);
        return this;
    }

    public ContactPage fillMessageField(String message) {
        getElement(messageField).sendKeys(message);
        return this;
    }

    public ContactPage checkAlertDangerText() {
        assertTrue("Alert text is incorrect", getElement(alertDanger).getText().contains("Invalid email address"));
        return this;
    }

    public ContactPage checkAlertSuccessText() {
        assertTrue("Alert text is incorrect", getElement(alertSuccess).getText().contains("Your message has been successfully sent to our team."));
        return this;
    }
}

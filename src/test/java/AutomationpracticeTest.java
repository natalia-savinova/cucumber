import config.Config;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import pages.*;

@Epic("Automationpractice Tests")
@Feature("Main page")
public class AutomationpracticeTest extends BaseTest{

    @Test
    public void checkThirdBannerLink() {
        Pages.mainPage.clickBanner();
        Pages.mainPage.getCurrentUrl();
    }

    @Test
    public void checkGetWomenTShortPage() {
        TShirtsPage checkHeaderText = Pages.mainPage
                .clickTShirtsCategory()
                .headerTextTrue();
    }

    @Test
    public void checkContactUsMessageEmptyFields() {
        Pages.mainPage.clickContactUsLink();
        Pages.contactPage
                .clickSubmitButton()
                .checkAlertDangerText();
    }

    @Test
    public void checkContactUsMessageSuccess() {
        Pages.mainPage.clickContactUsLink();
        Pages.contactPage
                .selectSubjectHeadingCustomerService()
                .fillEmailField(Config.correctEmail)
                .fillMessageField(Config.messageText)
                .clickSubmitButton()
                .checkAlertSuccessText();
    }

    @Test
    public void getCasualDressesCategory() {
        Pages.mainPage.clickDressesTitle();
        Pages.dressesPage
                .clickCheckboxCasualDressesCategory()
                .checkHeaderText();
    }
}

import extensions.Driver;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.Pages;

public class BaseTest {

    @Step("Open main page")
    @BeforeEach
    void setup() {
        Pages.mainPage.openPage();
    }

    @AfterEach
    void teardown() {
        Driver.quit();
    }
}

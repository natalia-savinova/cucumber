package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TShirtsPage extends BasePage{

    private By TShirtsHeader = By.xpath("//h1/span[@class = 'cat-name']");

    public TShirtsPage() {
    }

    @Step("Check Header text")
    public TShirtsPage headerTextTrue() {
        assertTrue(getElement(TShirtsHeader).getText().contains("T-SHIRTS"), "Page is incorrect");
        return this;
    }
}

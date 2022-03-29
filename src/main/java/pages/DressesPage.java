package pages;

import extensions.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DressesPage extends BasePage{

    private By checkboxCasualDressesCategory = By.xpath("//input[@name= 'layered_category_9']");
    private By filterHeader = By.xpath("//span[@class = 'cat-name']");

    public DressesPage() {
    }

    @Step("Select checkbox Casual Dresses")
    public DressesPage clickCheckboxCasualDressesCategory() {
        getElement(checkboxCasualDressesCategory).click();
        return this;
    }

    @Step("Check Header text")
    public DressesPage checkHeaderText() {
        WebElement element = (new WebDriverWait( Driver.get(), 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#enabled_filters")));
        assertTrue(getElement(filterHeader).getText().contains("CASUAL DRESSES"), "Page is incorrect");
        return this;
    }
}

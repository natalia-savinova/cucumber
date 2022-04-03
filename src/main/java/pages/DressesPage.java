package pages;

import extensions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class DressesPage extends BasePage{

    private By checkboxCasualDressesCategory = By.xpath("//input[@name= 'layered_category_9']");
    private By filterHeader = By.xpath("//span[@class = 'cat-name']");

    public DressesPage() {
    }

    public DressesPage clickCheckboxCasualDressesCategory() {
        getElement(checkboxCasualDressesCategory).click();
        return this;
    }

    public DressesPage checkHeaderText() {
        WebElement element = (new WebDriverWait( Driver.get(), 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#enabled_filters")));
        assertTrue("Page is incorrect", getElement(filterHeader).getText().contains("CASUAL DRESSES"));
        return this;
    }
}

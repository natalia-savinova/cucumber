package pages;

import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class TShirtsPage extends BasePage{

    private By TShirtsHeader = By.xpath("//h1/span[@class = 'cat-name']");

    public TShirtsPage() {
    }

    public TShirtsPage headerTextTrue() {
        assertTrue("Page is incorrect", getElement(TShirtsHeader).getText().contains("T-SHIRTS"));
        return this;
    }
}

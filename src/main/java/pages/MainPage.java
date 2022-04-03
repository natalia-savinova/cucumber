package pages;

import extensions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class MainPage extends BasePage{

    private By banner = By.xpath("//div[contains(@id, 'htmlcontent_top')]/ul/li[contains(@class, 'item-1')]");
    private By contactUsLink = By.cssSelector("#contact-link");
    private By womenTitle = By.xpath("//a[@title = 'Women']");
    private By dressesTitle = By.xpath("//div/ul/li/a[@title = 'Dresses']");
    private By tShirtsCategory = By.xpath("//ul[contains(@class, 'submenu-container')]/li/ul/li/a[@title = 'T-shirts']");

    public MainPage() {
    }

    public void openPage() {
        Driver.get().navigate().to(URL);
    }

    public void clickBanner() {
        Driver.get().findElement(banner).click();
    }

    public ContactPage clickContactUsLink() {
        getElement(contactUsLink).click();
        return Pages.contactPage;
    }

    public DressesPage clickDressesTitle() {
        getElement(dressesTitle).click();
        return Pages.dressesPage;
    }

    public TShirtsPage clickTShirtsCategory() {
        Actions action = new Actions( Driver.get());
        action.moveToElement(getElement(womenTitle))
                .moveToElement(getElement(tShirtsCategory)).click().build().perform();
        return Pages.tShirtsPage;
    }

    public void getCurrentUrl() {
        assertEquals("https://www.prestashop.com/en",  Driver.get().getCurrentUrl(), "Link is incorrect");
    }
}

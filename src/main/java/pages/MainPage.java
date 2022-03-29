package pages;

import extensions.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Step("Click banner")
    public void clickBanner() {
        Driver.get().findElement(banner).click();
    }

    @Step("Click the link Contact us")
    public ContactPage clickContactUsLink() {
        getElement(contactUsLink).click();
        return Pages.contactPage;
    }

    @Step("Click the title Dresses")
    public DressesPage clickDressesTitle() {
        getElement(dressesTitle).click();
        return Pages.dressesPage;
    }

    @Step("Click category T-Shirts")
    public TShirtsPage clickTShirtsCategory() {
        Actions action = new Actions( Driver.get());
        action.moveToElement(getElement(womenTitle))
                .moveToElement(getElement(tShirtsCategory)).click().build().perform();
        return Pages.tShirtsPage;
    }

    @Step("Get current URL")
    public void getCurrentUrl() {
        assertEquals("https://www.prestashop.com/en",  Driver.get().getCurrentUrl(), "Link is incorrect");
    }
}

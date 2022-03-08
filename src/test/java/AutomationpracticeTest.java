import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationpracticeTest extends BaseTest{

    public void getMainPage() {
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @Test
    public void checkThirdBannerLink() {
        getMainPage();
        driver.findElement(By.xpath("//div[contains(@id, 'home')]/ul/li[contains(@class, 'item-3')]")).click();

        String link = driver.getCurrentUrl();

        Assertions.assertEquals("https://www.prestashop.com/en", link, "Link is incorrect");
    }

    @Test
    public void checkGetWomenTShortPage() {
        getMainPage();
        Actions action = new Actions(driver);
        WebElement women = driver.findElement(By.xpath("//a[@title = 'Women']"));
        action.moveToElement(women).moveToElement(driver
                .findElement(By.xpath("//ul[contains(@class, 'submenu-container')]/li/ul/li/a[@title = 'T-shirts']")))
                .click().build().perform();

        String pageName = driver.findElement(By.xpath("//h1/span[@class = 'cat-name']")).getText();

        Assertions.assertTrue(pageName.contains("T-SHIRTS"), "Page is incorrect");
    }

    @Test
    public void checkContactUsMessageEmptyFields() {
        getMainPage();
        driver.findElement(By.cssSelector("#contact-link")).click();
        driver.findElement(By.xpath("//button[@name = 'submitMessage']")).click();

        String assertText = driver.findElement(By.xpath("//div[@class = 'alert alert-danger']")).getText();

        Assertions.assertTrue(assertText.contains("Invalid email address"), "Alert text is incorrect");
    }

    @Test
    public void checkContactUsMessageSuccess() {
        getMainPage();
        driver.findElement(By.cssSelector("#contact-link")).click();
        driver.findElement(By.cssSelector("#id_contact")).findElement(By.xpath("//select/option[@value = '2']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("test@test.te");
        driver.findElement(By.cssSelector("#message")).sendKeys("Test");
        driver.findElement(By.xpath("//button[@name = 'submitMessage']")).click();

        String assertText = driver.findElement(By.xpath("//p[@class = 'alert alert-success']")).getText();

        Assertions.assertTrue(assertText.contains("Your message has been successfully sent to our team."),
                "Alert text is incorrect");
    }

    @Test
    public void getCasualDressesCategory() {
        getMainPage();
        driver.findElement(By.xpath("//div/ul/li/a[@title = 'Dresses']")).click();
        driver.findElement(By.xpath("//input[@name= 'layered_category_9']")).click();
        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#enabled_filters")));

        String pageName = driver.findElement(By.xpath("//span[@class = 'cat-name']")).getText();
        Assertions.assertTrue(pageName.contains("CASUAL DRESSES"), "Page is incorrect");
    }
}

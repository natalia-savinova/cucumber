package pages;

import extensions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
   protected final String URL = "http://automationpractice.com/index.php";

   BasePage() {
       Driver.get();
       PageFactory.initElements( Driver.get(), this);
   }

   public WebElement getElement(By element) {
       return Driver.get().findElement(element);
   }
}

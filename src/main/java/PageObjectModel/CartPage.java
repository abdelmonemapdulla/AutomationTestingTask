package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver){this.driver=driver;}

    private By TermsOfServiceCheckBox(){return By.id("termsofservice");}
    public void markTermsOfServiceCheckBox(){driver.findElement(TermsOfServiceCheckBox()).click();}

    private By CheckoutButton(){return By.id("checkout");}
    public void selectCheckout(){driver.findElement(CheckoutButton()).click();}
}

package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){this.driver=driver;}

    //Locators
    private By RegisterTab(){return By.cssSelector(".ico-register");}
    private By LoginTab(){return By.cssSelector(".ico-login");}
    private By MyAccountTab(){return By.cssSelector(".ico-account");}
    private By BooksCategoryTab(){return By.xpath("//div/ul[@class='top-menu notmobile']/li[5]");}



    public void clickOnRegisterTab(){driver.findElement(RegisterTab()).click();}
    public void clickOnLoginTab(){driver.findElement(LoginTab()).click();}
    public void clickOnBooksCategoryTab(){driver.findElement(BooksCategoryTab()).click();}

    public boolean DisplayMyAccount(){return (driver.findElement(MyAccountTab()).isDisplayed());}
}

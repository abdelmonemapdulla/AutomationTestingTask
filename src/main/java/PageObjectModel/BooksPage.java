package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BooksPage {
    private WebDriver driver;
    public BooksPage(WebDriver driver){this.driver=driver;}
    private By SortByDropDown(){return By.id("products-orderby");}
    private By CartLabel(){return By.cssSelector(".cart-label");}
    private By AddToCartSecondItem(){return By.xpath("//div[@class='item-box'][2]//div/button[1]");}

    public void sortPriceLowToHigh(){
        Select PriceLowToHigh = new Select(driver.findElement(SortByDropDown()));
        PriceLowToHigh.selectByVisibleText("Price: Low to High");}

    public void clickOnAddToCartSecondItem(){driver.findElement(AddToCartSecondItem()).click();}
    public void clickOnCartLabel(){driver.findElement(CartLabel()).click();}
}

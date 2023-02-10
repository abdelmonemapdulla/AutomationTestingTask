package stepdefs;

import PageObjectModel.BooksPage;
import PageObjectModel.CartPage;
import PageObjectModel.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class AddToCartBookSteps {
    public static WebDriver driver = Hooks.driver;
    HomePage homePage;
    BooksPage booksPage;
    CartPage cartPage;

    @Given("User clicks on Books section")
    public void User_clicks_on_Books_section() {
        homePage = new HomePage(driver);
        homePage.clickOnBooksCategoryTab();
    }
    @When("User sorts by price low to high")
    public void User_sorts_by_price_low_to_high(){
        booksPage = new BooksPage(driver);
        booksPage.sortPriceLowToHigh();
    }
    @And("User add to cart the second item in the results")
    public void User_add_to_cart_the_second_item_in_the_results(){
        booksPage = new BooksPage(driver);
        booksPage.clickOnAddToCartSecondItem();
    }
    @And("User agrees to terms and conditions")
    public void User_agrees_to_terms_and_conditions(){
        cartPage = new CartPage(driver);
        cartPage.markTermsOfServiceCheckBox();
    }
    @Then("User clicks on checkout button to complete purchase")
    public void User_clicks_on_checkout_button_to_complete_purchase(){
        cartPage = new CartPage(driver);
        cartPage.selectCheckout();
    }
}

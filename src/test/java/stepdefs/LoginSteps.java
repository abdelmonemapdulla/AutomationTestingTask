package stepdefs;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginSteps{
    public static WebDriver driver = Hooks.driver;
    HomePage homePage;
    LoginPage loginPage;

    @Given("User clicks on login link")
    public void user_clicks_on_login_link() {
        homePage = new HomePage(driver);
        homePage.clickOnLoginTab();
    }
    @When("user enters email for login")
    public void user_enters_email_for_login() throws IOException {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail();
    }
    @And("user enters password for login")
    public void user_enters_password_for_login() throws IOException {
        loginPage = new LoginPage(driver);
        loginPage.enterPassword();
    }
    @And("user clicks on login button")
    public void user_clicks_on_login_button(){
        loginPage = new LoginPage(driver);
        loginPage.clickOnLoginButton();
    }
    @Then("user registration should be logged in")
    public void user_registration_should_be_logged_in() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.DisplayMyAccount());
    }
}

package stepdefs;

import PageObjectModel.HomePage;
import PageObjectModel.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;

public class RegisterSteps{
    public static WebDriver driver = Hooks.driver;
    HomePage homePage;
    RegisterPage registerPage;

    @Given("User clicks on register link from home page")
    public void user_clicks_on_register_link_from_home_page() {
        homePage = new HomePage(driver);
        homePage.clickOnRegisterTab();
    }
    @When("User selects gender")
    public void user_selects_gender() {
        registerPage = new RegisterPage(driver);
        registerPage.SelectingMaleGender();
    }
    @And("user enters first name")
    public void user_enters_first_name() {
        registerPage = new RegisterPage(driver);
        registerPage.enterFirstName("Abdelmonem");
    }
    @And("user enters last name")
    public void user_enters_last_name() {
        registerPage = new RegisterPage(driver);
        registerPage.enterLastName("Abdullah");
    }
    @And("user selects DateOfBirthDay")
    public void user_selects_date_of_birth_day() {
        registerPage = new RegisterPage(driver);
        registerPage.selectingDaysDropDown("29");
    }
    @And("user selects DateOfBirthMonth")
    public void user_selects_date_of_birth_month() {
        registerPage = new RegisterPage(driver);
        registerPage.selectingMonthDropDown("March");
    }
    @And("user selects DateOfBirthYear")
    public void user_selects_date_of_birth_year() {
        registerPage = new RegisterPage(driver);
        registerPage.selectingYearDropDown("1996");
    }
    @And("user enters email")
    public void user_enters_email() throws IOException {
        registerPage = new RegisterPage(driver);
        registerPage.enterEmail();
    }
    @And("user enters company name")
    public void user_enters_company_name() {
        registerPage = new RegisterPage(driver);
        registerPage.enterCompany("Trufla");
    }
    @And("user enters password")
    public void user_enters_password() {
        registerPage = new RegisterPage(driver);
        registerPage.enterPassword("abc123");
    }
    @And("user confirms password")
    public void user_confirms_password() {
        registerPage = new RegisterPage(driver);
        registerPage.enterConfirmPassword("abc123");
    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button() {
        registerPage = new RegisterPage(driver);
        registerPage.clickOnRegisterButton();
    }
    @Then("user registration should be completed successfully")
    public void user_registration_should_be_completed_successfully() {
        registerPage = new RegisterPage(driver);
        Assert.assertTrue(registerPage.RegisterResultDisplayed());
    }
}

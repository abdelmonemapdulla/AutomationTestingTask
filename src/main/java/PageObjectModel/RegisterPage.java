package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class RegisterPage{
    private WebDriver driver;
    public RegisterPage(WebDriver driver){this.driver=driver;}

    //Locators
    private By GenderMaleRadioButton(){return By.id("gender-male");}
    private By GenderFemaleRadioButton(){return By.id("gender-female");}
    private By FirstNameField(){return By.id("FirstName");}
    private By LastNameField(){return By.id("LastName");}
    private By EmailField(){return By.id("Email");}
    private By CompanyField(){return By.id("Company");}
    private By PasswordField(){return By.id("Password");}
    private By ConfirmPasswordField(){return By.id("ConfirmPassword");}
    private By DaysDropDown(){return By.name("DateOfBirthDay");}
    private By MonthDropDown(){return By.name("DateOfBirthMonth");}
    private By YearDropDown(){return By.name("DateOfBirthYear");}
    private By RegisterButton(){return By.id("register-button");}
    private By RegisterResult(){return By.xpath("//div[@class='result']");}


    public void SelectingMaleGender(){driver.findElement(GenderMaleRadioButton()).click();}
    public void SelectingFemaleGender(){driver.findElement(GenderFemaleRadioButton()).click();}
    public void enterFirstName(String FirstName){driver.findElement(FirstNameField()).sendKeys(FirstName);}
    public void enterLastName(String LastName){driver.findElement(LastNameField()).sendKeys(LastName);}
    public void enterEmail() throws IOException {
        Properties Credentials = new Properties();
        FileReader reader=new FileReader("config/Credentials.properties");
        Credentials.load(reader);
        driver.findElement(EmailField()).sendKeys(Credentials.getProperty("Email"));}
    public void enterCompany(String Company){driver.findElement(CompanyField()).sendKeys(Company);}
    public void enterPassword(String Password){driver.findElement(PasswordField()).sendKeys(Password);}
    public void enterConfirmPassword(String ConfirmPassword){driver.findElement(ConfirmPasswordField()).sendKeys(ConfirmPassword);}

    public void selectingDaysDropDown(String day){
        Select DaysDropDownMenu = new Select(driver.findElement(DaysDropDown()));
        DaysDropDownMenu.selectByVisibleText(day);
    }

    public void selectingMonthDropDown(String month){
        Select MonthDropDownMenu = new Select(driver.findElement(MonthDropDown()));
        MonthDropDownMenu.selectByVisibleText(month);
    }

    public void selectingYearDropDown(String year){
        Select YearDropDownMenu = new Select(driver.findElement(YearDropDown()));
        YearDropDownMenu.selectByVisibleText(year);
    }

    public void clickOnRegisterButton(){driver.findElement(RegisterButton()).click();}
    public boolean RegisterResultDisplayed(){return (driver.findElement(RegisterResult()).isDisplayed());}
}

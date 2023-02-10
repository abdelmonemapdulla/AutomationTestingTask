package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){this.driver=driver;}

    //Locators
    private By EmailInputField(){return By.id("Email");}
    private By PasswordInputField(){return By.id("Password");}
    private By LoginButton(){return By.xpath("//button[@class='button-1 login-button']");}


    public void enterEmail() throws IOException {
        Properties Credentials = new Properties();
        FileReader reader=new FileReader("config/Credentials.properties");
        Credentials.load(reader);
        driver.findElement(EmailInputField()).sendKeys(Credentials.getProperty("Email"));}
    public void enterPassword() throws IOException {
        Properties Credentials = new Properties();
        FileReader reader=new FileReader("config/Credentials.properties");
        Credentials.load(reader);
        driver.findElement(PasswordInputField()).sendKeys(Credentials.getProperty("Password"));}

    public void clickOnLoginButton(){driver.findElement(LoginButton()).click();}
}

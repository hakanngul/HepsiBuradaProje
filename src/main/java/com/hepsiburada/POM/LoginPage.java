package com.hepsiburada.POM;

import com.hepsiburada.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {


    @FindBy(id = "txtUserName")
    private WebElement emailLocator;

    @FindBy(id = "txtPassword")
    private WebElement passwordLocator;

    @FindBy(id = "btnLogin")
    private WebElement signInLocator;

    @FindBy(id = "btnEmailSelect")
    private WebElement signInSecondLocator;
    WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void typeEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(emailLocator));
//        emailLocator.clear();
        emailLocator.sendKeys(email);
    }

    public void typePassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordLocator));
//        passwordLocator.clear();
        passwordLocator.sendKeys(password);
    }

    public void clickFirstSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(signInLocator));
        signInLocator.click();
    }

    public void clickSecondSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(signInSecondLocator));
        signInSecondLocator.click();
    }

}

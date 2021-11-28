package com.hepsiburada.stepDefinitions;

import com.hepsiburada.POM.LoginPage;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @When("I enter the {string} email address")
    public void enterTheEmailAddress(String email) {
        loginPage.typeEmail(email);
    }

    @When("I click on the sign in button")
    public void clickOnTheFirstLogin() {
        loginPage.clickFirstSignIn();
    }

    @When("I enter the {string} password")
    public void enterThePassword(String password) {
        loginPage.typePassword(password);
    }

    @When("I click on the login")
    public void clickOnTheSecondLogin() {
        loginPage.clickSecondSignIn();

    }
}

package com.hepsiburada.stepDefinitions;

import com.hepsiburada.POM.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage;

    @Given("I am on the home page")
    public void onHomePage() {
        homePage = new HomePage();
        homePage.openHomePage();
    }

    @When("I click on the login page button")
    public void clickLoginPageButton() throws InterruptedException {
        homePage.clickLoginPageButton();
    }

    @Then("Wait for the home page to load and checkout login")
    public void waitForTheHomePageToLoad() throws InterruptedException {
        homePage.waitForHomePageToLoad();
        homePage.checkoutLogin();
    }

    @And("I search for the {string} product")
    public void searchForTheProduct(String product) throws InterruptedException {
        homePage.searchProduct(product);
    }
}

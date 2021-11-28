package com.hepsiburada.stepDefinitions;

import com.hepsiburada.POM.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductsSteps {
    private WebDriver driver;

    ProductsPage productsPage = new ProductsPage();



    @When("I click on the product")
    public void clickOnTheProduct() {
        productsPage.clickOnTheProduct();
    }

    @Then("I changed the window tab")
    public void changedTheWindowTab() {
        productsPage.changeWindowTab();
    }

    @Then("I should see the products")
    public void shouldSeeTheProducts() {
        productsPage.checkOutTheProducts();
    }
}

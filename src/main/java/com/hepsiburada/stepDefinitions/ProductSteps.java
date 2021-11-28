package com.hepsiburada.stepDefinitions;

import com.hepsiburada.POM.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductSteps {
    private WebDriver driver;

    ProductPage productPage = new ProductPage();
    ;


    @And("I check to product page")
    public void checkToProductPage() throws InterruptedException {
        productPage.checkProductPage();
    }

    @When("I click on the other seller")
    public void clickOnTheOtherSeller() throws InterruptedException {
        productPage.clickOptionsLength();
    }

    @And("I click on the add product to basket first seller")
    public void clickOnTheAddProductToBasketFirstSeller() throws InterruptedException {
        productPage.clickAddFirstProductToBasket();
    }

    @And("I click to do not want a repair pack")
    public void clickToDoNotWantARepairPack() throws InterruptedException {
        productPage.clickClosePopUpRepairPack();
    }

    @And("I click to close popup")
    public void clickToClosePopup() throws InterruptedException {
        productPage.clickCloseSecondPopUp();
    }

    @And("I click on the add product to basket different second seller")
    public void clickOnTheAddProductToBasketDifferentSecondSeller() throws InterruptedException {
        productPage.clickAddSecondProductToBasket();
    }

    @And("I click to my basket")
    public void clickToMyBasket() throws InterruptedException {
        productPage.clickCartButton();
    }
}

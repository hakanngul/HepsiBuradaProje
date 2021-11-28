package com.hepsiburada.stepDefinitions;

import com.hepsiburada.POM.BasketPage;
import io.cucumber.java.en.Then;

public class BasketSteps {

    BasketPage basketPage = new BasketPage();


    @Then("I should see the product added to the basket from different sellers")
    public void WatchTheProductsOnBasket() throws InterruptedException {
        Thread.sleep(500);
        basketPage.checkBasketItems();
    }


}

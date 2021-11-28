package com.hepsiburada.POM;

import com.hepsiburada.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class BasketPage {
    @FindBy(xpath = "//li[contains(@class,'basket_item_1rDra')]")
    private List<WebElement> basketItems;
    WebDriver driver;

    public BasketPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void checkBasketItems() {
        Assert.assertTrue(basketItems.size() > 0, "Sepetinizde ürün bulunmamaktadır.");
    }


}

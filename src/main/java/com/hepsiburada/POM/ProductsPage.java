package com.hepsiburada.POM;

import com.hepsiburada.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//li[contains(@id,'i') and contains(@class, 'item')]")
    private List<WebElement> productList;

    WebDriver driver;

    public ProductsPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void checkOutTheProducts() {
        var size = productList.size();
        Assert.assertTrue(productList.size() > 0);
    }

    public void clickOnTheProduct() {
        WebElement selectedProduct = productList.get(randomNumberGenerator(productList.size()));
        var productName = selectedProduct.getText();
        wait.until(ExpectedConditions.elementToBeClickable(selectedProduct)).click();
    }

    // change window tab
    public void changeWindowTab() {
        String currentWindow = driver.getWindowHandle();
        var x = driver.getWindowHandles();
        for (String window : driver.getWindowHandles()) {
            System.out.println(currentWindow);
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
    }



}

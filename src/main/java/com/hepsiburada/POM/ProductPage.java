package com.hepsiburada.POM;

import com.hepsiburada.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Alışveriş Kredisi')]")
    private WebElement creditButton;

    @FindBy(xpath = "//a[contains(@class,'optionsLength') and contains(text(),'Tümü')]")
    private WebElement optionsLength;

    @FindBy(id = "addToCart")
    private WebElement addToCartButton1;

    @FindBy(className = "add-Cart")
    private List<WebElement> addToCartButton;

    @FindBy(className = "deny-text")
    private WebElement popUpRepairPack;

    @FindBy(xpath = "//h1//a[contains(@class,'checkoutui-Modal-')]")
    private WebElement secondPopUpButton;

    @FindBy(xpath = "//span[contains(text(), 'Sepetim')]")
    private WebElement cartButton;


    WebDriver driver;

    public ProductPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void checkProductPage() {
        wait.until(ExpectedConditions.visibilityOf(creditButton));
        var x = creditButton.getText();
    }

    public void clickAddToCartButton() {
        addToCartButton1.click();
    }

    public void clickOptionsLength() throws InterruptedException {
//        Thread.sleep(2000);
        scrollToElement(optionsLength);
        click(optionsLength);
    }

    public void clickAddFirstProductToBasket() throws InterruptedException {
        WebElement productFirst = addToCartButton.get(0);
        scrollToElement(productFirst);
        click(productFirst);
    }

    public void clickAddSecondProductToBasket() throws InterruptedException {
        WebElement productSecond = addToCartButton.get(1);
        scrollToElement(productSecond);
        click(productSecond);
    }

    public void clickClosePopUpRepairPack() throws InterruptedException {
        Thread.sleep(1000);
        if (popUpRepairPack.isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOf(popUpRepairPack)).click();
        }
    }

    public void clickCloseSecondPopUp() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(secondPopUpButton)).click();
    }

    public void clickCartButton() throws InterruptedException {
        scrollToElement(cartButton);
        click(cartButton);
    }

}

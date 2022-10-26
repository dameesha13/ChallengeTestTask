package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BaseClass {

    private final By headerShoppingCart = By.xpath("(//h1[normalize-space()='Shopping Cart'])[1]");
    private final By deSelectAllItems = By.xpath("//a[@id='deselect-all']");
    private final By btnDelete = By.xpath("//*[@class=\"a-declarative\"]/input[@value=\"Delete\"]");

    private final By btnSaveForLater = By.xpath("//*[@name=\"submit.save-for-later.Cae73ac94-5404-439c-932d-d329d0a22388\"]");
    private final By btnCompareWithSimilarItems = By.xpath("//*[@name=\"submit.compare.Cae73ac94-5404-439c-932d-d329d0a22388\"]");
    private final By priceDisplayed = By.xpath("//span[normalize-space()='$15.06']");
    private final By itemList = By.xpath("//*[@class=\"a-row a-spacing-base a-spacing-top-base\"]");
    private final By lblSubTotal = By.xpath("(//span[@id='sc-subtotal-label-activecart'])[1]");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean showItemList() throws Exception {
        try {
            return driver.findElement(itemList).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isSubTotalDisplayed() throws Exception {
        try {
            return driver.findElement(lblSubTotal).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isShoppingCartHeaderDisplayed() throws Exception {
        try {
            return driver.findElement(headerShoppingCart).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickDeliveryLocation() throws Exception {
        try {
            driver.findElement(deSelectAllItems).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickDelete() throws Exception {
        try {
            driver.findElement(btnDelete).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSaveForLater() throws Exception {
        try {
            driver.findElement(btnSaveForLater).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickCompareWithSimilarItems() throws Exception {
        try {
            driver.findElement(btnCompareWithSimilarItems).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isPriceDisplayed() throws Exception {
        try {
            return driver.findElement(priceDisplayed).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }
}

package com.test.project.pageobjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseClass {

    private final By btnAddToCart = By.xpath("(//input[@class='a-button-input'])[2]");
    private final By btnShare = By.xpath("(//input[@data-share='{\"background\": false, \"icon\": false}'])[1]");
    private final By btnBuyNow = By.xpath("(//input[@id='buy-now-button'])[1]");
    private final By selectValueFromQty = By.xpath("(//a[normalize-space()='2'])[1]");
    private final By btnAddToList = By.id("add-to-wishlist-button-submit");
    private final By title = By.id("productTitle");
    private final By selectDifferentColorFromProductPage = By.xpath("(//img[@alt='Black'])[1]");

    public ProductPage(WebDriver driver) {

        super(driver);
    }

    public void clickAddToCart() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='add-to-cart-button']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickDifferentColorFromProductPage() throws Exception {
        try {
            driver.findElement(selectDifferentColorFromProductPage).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickBuyNow() throws Exception {
        try {
            driver.findElement(btnBuyNow).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAddToList() throws Exception {
        try {
            driver.findElement(btnAddToList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickQuantityDropDown() throws Exception {
        try {
            Select se = new Select(driver.findElement(By.xpath("//*[@id=\"quantity\"]")));
            se.selectByIndex(2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickValueFromQuantityDropDown() throws Exception {
        try {
            driver.findElement(selectValueFromQty).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isProductTitleDisplayed() throws Exception {
        try {
            return driver.findElement(title).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickShare() throws Exception {
        try {
            driver.findElement(btnShare).click();
        } catch (Exception ex) {
            throw ex;
        }
    }
}

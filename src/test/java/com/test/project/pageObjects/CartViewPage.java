package com.test.project.pageObjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class CartViewPage extends BaseClass {

    private final By itemList = By.xpath("//*[@class=\"a-row a-spacing-base a-spacing-top-base\"]");
    private final By lblSubTotal = By.id("sw-subtotal");
    private final By btnProceedToCheckout = By.name("proceedToRetailCheckout");
    private final By btnGoToCart = By.xpath("(//a[@href='/gp/cart/view.html?ref_=sw_gtc'])[1]");
    private final By addedToCartText = By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");
    private final By addToCartInPagination = By.xpath("(//input[@name='submit.addToCart'])[1]");
    private final By btnDeleteFromSideBar = By.xpath("(//span[@class='a-button a-button-base a-button-small'])[1]");
    private final By changeQty = By.xpath("(//span[@class='a-button-text a-declarative'])[1]");
    private final By selectQtyOption = By.xpath("(//input[@aria-label='2 THE GYM PEOPLE Thick High Waist Yoga Pants with Pockets, Tummy Control Workout Running Yoga Leggings for Women (Small, Marble)'])[1]");
    private final By goToCartOptionInSideBar = By.xpath("(//a[@href='/gp/cart/view.html?ref_=ewc_gtc'])[1]");

    public CartViewPage(WebDriver driver) {
        super(driver);
    }

    public boolean showItemListDisplayed() throws Exception {
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

    public void clickCheckout() throws Exception {
        try {
            driver.findElement(btnProceedToCheckout).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickGoToCartFromSideBar() throws Exception {
        try {
            driver.findElement(goToCartOptionInSideBar).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectQtyOptionFromDropdown() throws Exception {
        try {
            driver.findElement(selectQtyOption).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void changeQtyFromDropdown() throws Exception {
        try {
            Select se = new Select(driver.findElement(By.xpath("//*[@name=\"quantity.a7a96b91-e8a7-4f46-97d3-f2ed4531d10b\"]")));
            se.selectByValue("2");
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickDelete() throws Exception {
        try {
            driver.findElement(btnDeleteFromSideBar).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void addingNewItemToCart() throws Exception {
        try {
            driver.findElement(addToCartInPagination).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickGoToCart() throws Exception {
        try {
            driver.findElement(btnGoToCart).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isAddedToCartDisplayed() throws Exception {
        try {
            return driver.findElement(addedToCartText).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }


}

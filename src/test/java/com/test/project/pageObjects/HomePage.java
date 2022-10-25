package com.test.project.pageObjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass {

    private final By btnDelivery = By.xpath("//*[@id=\"glow-ingress-block\"]");
    private final By ddAll = By.xpath("//*[@class=\"nav-search-scope nav-sprite nav-focus\"]");
    private final By searchTxt = By.xpath("//*[@id=\"twotabsearchtextbox\"]");
    private final By searchIcon = By.xpath("//*[@id=\"nav-search-submit-button\"]");
    private final By language = By.xpath("//*[@class=\"icp-nav-link-inner\"]");
    private final By accountAndList = By.xpath("//*[@id=\"nav-link-accountList\"]");
    private final By returnsAndOrders = By.xpath("//*[@class=\"nav-a nav-a-2   nav-progressive-attribute\"]");
    private final By btnCart = By.xpath("//*[@class=\"nav-cart-count nav-cart-1 nav-progressive-attribute nav-progressive-content\"]");
    private final By signOut = By.xpath("//*{@id=\"nav-item-signout\"]");
    private final By lblUserName = By.xpath("(//span[@id='nav-link-accountList-nav-line-1'])[1]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchText(String searchText) throws Exception {
        try {
            driver.findElement(searchTxt).sendKeys(searchText);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickDeliveryLocation() throws Exception {
        try {
            driver.findElement(btnDelivery).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public String lblUserName() throws Exception {
        try {
            return driver.findElement(lblUserName).getText();
        } catch (Exception ex) {
            throw ex;
        }
    }


    public void clickSearchIcon() throws Exception {
        try {
            driver.findElement(searchIcon).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickLanguage() throws Exception {
        try {
            driver.findElement(language).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAccountAndLists() throws Exception {
        try {
            driver.findElement(accountAndList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickReturnsOrder() throws Exception {
        try {
            driver.findElement(returnsAndOrders).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickCart() throws Exception {
        try {
            driver.findElement(btnCart).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSignOut() throws Exception {
        try {
            driver.findElement(signOut).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

}

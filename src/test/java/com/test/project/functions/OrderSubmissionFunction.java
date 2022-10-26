package com.test.project.functions;

import com.test.project.pageobjects.*;
import org.openqa.selenium.WebDriver;

public class OrderSubmissionFunction {
    private final HomePage homePage;
    private final ProductPage productPage;
    private final SearchResultsPage searchResults;
    private final CheckoutPage checkoutPage;
    private final CartViewPage cartViewPage;
    private final ShoppingCartPage shoppingCartPage;

    public OrderSubmissionFunction(WebDriver driver) {
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        searchResults = new SearchResultsPage(driver);
        checkoutPage = new CheckoutPage(driver);
        cartViewPage = new CartViewPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
    }

    public HomePage getHomePage() throws Exception {
        try {
            return homePage;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void typeSearchWord(String text) throws Exception {
        try {
            homePage.enterSearchText(text);
            homePage.clickSearchIcon();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void addItemsToCart() throws Exception {
        try {
            searchResults.isResultsDisplayed();
            searchResults.selectAnItem();
            productPage.isProductTitleDisplayed();
            productPage.clickDifferentColorFromProductPage();
            productPage.clickQuantityDropDown();
            Thread.sleep(1000);
            productPage.clickAddToCart();
            cartViewPage.isSubTotalDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void deleteItemsFromCart() throws Exception {
        try {
            homePage.clickCart();
            shoppingCartPage.isShoppingCartHeaderDisplayed();
            shoppingCartPage.clickDelete();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void deleteItemFromSideBarCart() throws Exception {
        try {
            cartViewPage.isAddedToCartDisplayed();
            cartViewPage.addingNewItemToCart();
            cartViewPage.clickDelete();
            cartViewPage.clickGoToCartFromSideBar();
            shoppingCartPage.isSubTotalDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void settingFilters() throws Exception {
        try {
            searchResults.isResultsDisplayed();
            Thread.sleep(1000);
            searchResults.selectPriceLowToHighInSortBy();
            Thread.sleep(20000);
            searchResults.selectOurBrandOption();
            searchResults.selectWomenSize();
            Thread.sleep(10000);
            searchResults.selectColor();
            Thread.sleep(10000);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectPagination(String min, String max) throws Exception {
        try {
            searchResults.clickNextButton();
            Thread.sleep(10000);
            searchResults.clickPreviousButton();
            Thread.sleep(10000);
            searchResults.selectThirdPageInPagination();
            searchResults.enterMinimumPrice(min);
            searchResults.enterMaximumPrice(max);
            searchResults.clickGoButton();
            searchResults.selectFirstItemInList();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void AddAddress(String fullName, String phoneNo, String address, String city, String zip) throws Exception {
        try {
            checkoutPage.clickAddNewAddress();
            checkoutPage.selectCountry();
            checkoutPage.enterFullName(fullName);
            checkoutPage.enterPhoneNo(phoneNo);
            checkoutPage.enterAddress(address);
            checkoutPage.enterCity(city);
            checkoutPage.enterZipCode(zip);
            checkoutPage.clickUseThisAddress();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void addPaymentDetails(String cardNo, String nameOnCard) throws Exception {
        try {
            checkoutPage.titleDisplayed();
            checkoutPage.clickAddCreditOrDebitCard();
            checkoutPage.enterCardNo(cardNo);
            checkoutPage.enterNameOnCard(nameOnCard);
            checkoutPage.selectExpireDateMonth();
            checkoutPage.selectExpireDateYear();
            checkoutPage.clickApplyOnCode();
        } catch (Exception ex) {
            throw ex;
        }
    }
}

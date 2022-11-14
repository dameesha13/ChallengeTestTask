package com.test.project.tests;

import com.test.project.functions.AccountAndListsPageFunction;
import com.test.project.functions.LoginFunction;
import com.test.project.functions.OrderSubmissionFunction;
import com.test.project.pageobjects.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.test.project.utils.DriverSetup.setUp;

public class OrderSubmitTest {

    static Logger log = Logger.getLogger(OrderSubmitTest.class);
    WebDriver driver;
    private LoginFunction loginFunction;
    private ProductPage productPage;
    private ShoppingCartPage shoppingCartPage;
    private LoginPage loginPage;
    private OrderSubmissionFunction orderSubmissionFunction;
    private AccountAndListsPageFunction accountAndListsPageFunction;

    /* Before Method*/
    @BeforeMethod
    public void beforeMethod() throws Exception {
        driver = setUp();
        loginFunction = new LoginFunction(driver);
        orderSubmissionFunction = new OrderSubmissionFunction(driver);
        productPage = new ProductPage(driver);
        loginPage = new LoginPage(driver);
        accountAndListsPageFunction = new AccountAndListsPageFunction(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
    }

    /* Req1: To Verify the login and logout  */
    @Test
    public void verifyAboutSignInSignOutFunctionality() throws Exception {
        try {
            loginFunction.loginToAmazonFunction("testskyemail8992@gmail.com", "1qaz@WSX");
            Assert.assertEquals("Hello, sky123", orderSubmissionFunction.getHomePage().lblUserName());
            loginFunction.signOutFunction();
            Assert.assertTrue(loginPage.isRedirectToSignInPageDisplayed());//Assert the signIn page header text
            Assert.assertTrue(loginPage.isLinkConditionsOfUseDisplayed()); //Assert the conditions of use
            loginFunction.loginToAmazonWithInvalidEmail("testskyemail89", "1qaz@WSX");
            Assert.assertTrue(loginPage.isWarningMessageDisplayed()); //Assert warning message when providing invalid email
        } catch (Exception e) {
            log.info("verifyAboutSignInSignOutFunctionality : FAIL");
            throw e;
        }
    }

    /* Req2 : Add and remove items from to cart */
    @Test(priority = 1)
    public void searchItemAndAddAndRemoveFromCart() throws Exception {
        try {
            loginFunction.loginToAmazonFunction("testskyemail8992@gmail.com", "1qaz@WSX");
            orderSubmissionFunction.typeSearchWord("tshirt for women");
            orderSubmissionFunction.addItemsToCart();
            orderSubmissionFunction.deleteItemFromSideBarCart();
            Assert.assertTrue(shoppingCartPage.isSubTotalDisplayed());//Assert the subtotal

        } catch (Exception ex) {
            log.info("searchItemAndAddAndRemoveFromCart : FAIL");
            throw ex;
        }

    }

    /*Req 3: To Verify the filtering/sorting and page navigation */
    @Test(priority = 2)
    public void verifyAboutPagination() throws Exception {
        try {
            loginFunction.loginToAmazonFunction("testskyemail8992@gmail.com", "1qaz@WSX");
            orderSubmissionFunction.typeSearchWord("tshirt for women");
            orderSubmissionFunction.settingFilters();
            orderSubmissionFunction.selectPagination("10", "30");
            Assert.assertTrue(productPage.isProductTitleDisplayed());//Assert the product title

        } catch (Exception e) {
            log.info("verifyAboutPagination : FAIL");
            throw e;
        }
    }

    /* After Method*/
    @AfterMethod
    public void afterTest() {
        driver.close();
    }
}

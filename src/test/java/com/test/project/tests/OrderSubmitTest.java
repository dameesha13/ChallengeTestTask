package com.test.project.tests;

import com.test.project.functions.AccountAndListsPageFunction;
import com.test.project.functions.LoginFunction;
import com.test.project.functions.OrderSubmissionFunction;
import com.test.project.pageObjects.*;
import com.test.project.utils.TestDataHelper;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
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

    private TestDataHelper testDataHelper;
    private JSONObject testData;
    private String email;
    private String password;

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

        /*testDataHelper = new TestDataHelper();
        testData = testDataHelper.readTestDataFile("LoginTest");
        this.email = testData.get("email").toString();
        this.password = testData.get("password").toString();*/
        //email = "dameeshanemini@gmail.com";
    }

    /* Req1: To Verify the login and logout  */
    @Test
    public void verifyAboutSignInSignOutFunctionality() throws Exception {
        try {
            System.out.println("hello");
            loginFunction.loginToAmazonFunction("dameeshanemini@gmail.com", "1qaz@WSX");
            loginFunction.signOutFunction();
            Assert.assertTrue(loginPage.isRedirectToSignInPageDisplayed());//Assert the signIn page header text
            Assert.assertTrue(loginPage.isLinkConditionsOfUseDisplayed()); //Assert the conditions of use
        } catch (Exception e) {
            log.info("verifyAboutSignInSignOutFunctionality : FAIL");
            throw e;
        }
    }

    //Req2 : Add and remove items from cart
    @Test
    public void searchItemAndAddAndRemoveFromCart() throws Exception {
        try {
            loginFunction.loginToAmazonFunction("dameeshanemini@gmail.com", "1qaz@WSX");
            //loginFunction.loginToAmazonFunction("testemail1sky8992@gmail.com","1qaz@WSX13");
            Assert.assertEquals("Hello, Dameesha", orderSubmissionFunction.getHomePage().lblUserName());
            orderSubmissionFunction.typeSearchWord("tshirt for women");
            orderSubmissionFunction.addItemsToCart();
            orderSubmissionFunction.deleteItemFromSideBarCart();
            Assert.assertTrue(shoppingCartPage.isSubTotalDisplayed());

            //orderSubmissionFunction.AddAddress("Sam", "+94710549743","12/A, Old Road", "Kaduwela", "12456");
            //orderSubmissionFunction.addPaymentDetails("1234", "Sam");
        } catch (Exception ex) {
            log.info("searchItemAndAddAndRemoveFromCart : FAIL");
            throw ex;
        }

    }


    //Req 3: To Verify the filtering/sorting and page navigation - working fine
    @Test
    public void verifyAboutPagination() throws Exception {
        try {
            loginFunction.loginToAmazonFunction("dameeshanemini@gmail.com", "1qaz@WSX");
            orderSubmissionFunction.typeSearchWord("tshirt for women");
            orderSubmissionFunction.settingFilters();
            orderSubmissionFunction.selectPagination("10", "30");
            Assert.assertTrue(productPage.isProductTitleDisplayed());

        } catch (Exception e) {
            log.info("verifyAboutPagination : FAIL");
            throw e;
        }
    }

    /* After Method*/
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}

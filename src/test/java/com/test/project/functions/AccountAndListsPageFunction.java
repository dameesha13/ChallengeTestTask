package com.test.project.functions;

import com.test.project.pageObjects.AccountListPage;
import com.test.project.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static com.test.project.utils.BaseClass.driver;

public class AccountAndListsPageFunction {
    private final AccountListPage accountListPage;

    public AccountAndListsPageFunction(WebDriver driver) {

        accountListPage = new AccountListPage(driver);

    }

    public AccountListPage getAccountLstPage() throws Exception {
        try {
            return accountListPage;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void loginToAmazonFunction(String email, String password) throws Exception {
        try {
            //accountListPage.clickSignOutLink();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean signOutFunction() throws Exception {
        try {
        /*Actions action = new Actions(driver);
        action.moveToElement( accountListPage.clickAccountAndList()).perform();*/
            //loginPage.hoverSignInButtonBefore();
            accountListPage.clickSignOutLink();
            return accountListPage.isRedirectToSignInPageDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }


}

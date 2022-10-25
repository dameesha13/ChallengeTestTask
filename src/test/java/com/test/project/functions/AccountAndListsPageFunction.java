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

    public boolean signOutFunction() throws Exception {
        try {
            accountListPage.clickSignOutLink();
            return accountListPage.isRedirectToSignInPageDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }


}

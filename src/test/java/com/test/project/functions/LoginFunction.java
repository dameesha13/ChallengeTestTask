package com.test.project.functions;

import com.test.project.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFunction {
    private final LoginPage loginPage;

    public LoginFunction(WebDriver driver) {

        loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() throws Exception {

        return loginPage;
    }

    public void loginToAmazonFunction(String email, String password) throws Exception {
        try {
            loginPage.hoverSignInButtonBefore();
            loginPage.clickInitialSignButton();
            loginPage.enterEmail(email);
            Thread.sleep(1000);
            loginPage.clickContinueButton();
            loginPage.enterPassword(password);
            loginPage.clickSignInButton();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void signOutFunction() throws Exception {
        try {
            loginPage.hoverSignInButtonBefore();
            loginPage.clickSignOutButton();
            Thread.sleep(1000);
        } catch (Exception ex) {
            throw ex;
        }
    }

}

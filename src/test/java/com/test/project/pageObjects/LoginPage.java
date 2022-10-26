package com.test.project.pageObjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseClass {

    private final By signInHeaderText = By.xpath("//h1[normalize-space()='Sign in']");
    private final By signInButton = By.id("nav-link-accountList");
    private final By emailTxt = By.xpath("//input[@id='ap_email']");
    private final By continueBtn = By.xpath("//*[@id=\"continue\" and @type=\"submit\"]");
    private final By passwordTxt = By.id("ap_password");
    private final By signInBtn = By.id("signInSubmit");
    private final By btnSignOut = By.xpath("//span[normalize-space()='Sign Out']");

    private final By linkConditionsOfUse = By.xpath("(//a[contains(text(),'Conditions of Use')])[1]");

    private final By linkNeedHelp = By.xpath("(//span[@class='a-expander-prompt'])[1]");
    private final By btnCreateYourAmazonAccount = By.id("auth-create-account-link");
    private final By linkChangeEmail = By.xpath("(//a[normalize-space()='Change'])[1]");
    private final By linkForgotYourPassword = By.xpath("(//a[normalize-space()='Forgot your password?'])[1]");
    private final By keepMeSingInChk = By.xpath("//*[@name=\"rememberMe\"]");

    private final By linkDetails = By.xpath("(//a[normalize-space()='Details'])[1]");

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public void clickInitialSignButton() throws Exception {
        try {
            driver.findElement(signInButton).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSignOutButton() throws Exception {
        try {
            driver.findElement(btnSignOut).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void hoverSignInButtonBefore() throws Exception {
        try {
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            WebElement signIn = driver.findElement(signInButton);
            Actions ac = new Actions(driver);
            ac.moveToElement(signIn).perform();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterEmail(String userName) throws Exception {
        try {
            driver.findElement(emailTxt).sendKeys(userName);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterPassword(String password) throws Exception {
        try {
            driver.findElement(passwordTxt).sendKeys(password);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickContinueButton() throws Exception {
        try {
            driver.findElement(continueBtn).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSignInButton() throws Exception {
        try {
            driver.findElement(signInBtn).click();
        } catch (Exception ex) {
            throw ex;
        }

    }

    public Boolean isElementVisible() throws Exception {
        try {
            return driver.findElement(passwordTxt).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void clickS1ignOutButton() {

        driver.findElement(btnSignOut).click();
    }

    public Boolean isRedirectToSignInPageDisplayed() {

        return driver.findElement(signInHeaderText).isDisplayed();
    }

    public boolean isLinkConditionsOfUseDisplayed() throws Exception {
        try {
            return driver.findElement(linkConditionsOfUse).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isLinkNeedHelpDisplayed() throws Exception {
        try {
            return driver.findElement(linkNeedHelp).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickCreateNewAmazonAccount() throws Exception {
        try {
            driver.findElement(btnCreateYourAmazonAccount).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isLinkForgotYourPasswordDisplayed() throws Exception {
        try {
            return driver.findElement(linkForgotYourPassword).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isLinkChangeEmailDisplayed() throws Exception {
        try {
            return driver.findElement(linkChangeEmail).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean clickKeepMeSignIn() throws Exception {
        try {
            return driver.findElement(keepMeSingInChk).isSelected();
        } catch (Exception ex) {
            throw ex;
        }

    }

    public boolean isLinkDetailsDisplayed() throws Exception {
        try {
            return driver.findElement(linkDetails).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }
}

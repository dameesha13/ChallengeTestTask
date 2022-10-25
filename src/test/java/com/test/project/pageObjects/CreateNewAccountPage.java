package com.test.project.pageObjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewAccountPage extends BaseClass {

    private final By nameTxt = By.xpath("//*[@id=\"ap_customer_name\"]");
    private final By emailTxt = By.xpath("//*[@id=\"ap_email\"]");
    private final By passwordTxt = By.xpath("//*[@id=\"ap_password\"]");
    private final By reTypePasswordTxt = By.xpath("//*[@id=\"ap_password_check\"]");
    private final By continueBtn = By.xpath("//*[@id=\"continue\"]");
    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String userName) throws Exception {
        try {
            driver.findElement(nameTxt).sendKeys(userName);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterEmail(String email) throws Exception {
        try {
            driver.findElement(emailTxt).sendKeys(email);
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

    public void enterReTypePassword(String reTypePassword) throws Exception {
        try {
            driver.findElement(reTypePasswordTxt).sendKeys(reTypePassword);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSubmitBtn() throws Exception {
        try {
            driver.findElement(continueBtn).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

}

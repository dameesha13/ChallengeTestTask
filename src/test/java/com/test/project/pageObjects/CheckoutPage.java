package com.test.project.pageObjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BaseClass {

    //after clicking buy now

    private final By titleOfPage = By.xpath("//*[@class=\"a-column a-span8\"]");
    private final By titleLink = By.xpath("//*[@class=\"a-color-link clickable-heading\"]");
    private final By enterShippingAddress = By.xpath("//*[@class=\"a-column a-span10\"]");
    private final By btnAutoFill = By.xpath("//*[@id=\"address-ui-widgets-DetectLocationButton-announce\"]");
    private final By ddCountry = By.xpath("//span[@id='address-ui-widgets-countryCode']");
    private final By txtFullName = By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]");
    private final By txtPhoneNo = By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]");
    private final By txtAddress = By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]");
    private final By txtCity = By.xpath("//*[@id=\"address-ui-widgets-enterAddressCity\"]");
    private final By ddState = By.xpath("//span[@id='address-ui-widgets-enterAddressStateOrRegion']");
    private final By txtZipCode = By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]");
    private final By chkDefaultAddress = By.xpath("//*[@id=\"address-ui-widgets-use-as-my-default\"]");
    private final By btnUseThisAddress = By.xpath("//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']); //xpath://*[@id=\"address-ui-widgets-form-submit-button-announce\"]");
    private final By btnUseThisAddressPrimary = By.xpath("//*[@id=\"orderSummaryPrimaryActionBtn-announce\"]");
    private final By btnEdit = By.xpath("(//a[normalize-space()='Edit'])[1]");
    private final By addNewAddress = By.xpath("//*[@id=\"add-new-address-popover-link\"]");
    private final By returnToCartPopUp = By.xpath("(//a[@id='a-autoid-3-announce'])[1]");
    private final By StayInCheckoutPopUp = By.xpath("(//input[@type='submit'])[7]");
    //add payment method
    private final By addCreditOrDebitCard = By.xpath("//*[@class=\"a-link-emphasis pmts-add-cc-default-trigger-link\"]");
    private final By selectAmazonGiftCard = By.xpath("(//img[@class='apx-add-pm-trigger-common-image'])[2]");
    private final By addPersonalCheckingAccount = By.xpath("(//a[normalize-space()='Add a personal checking account'])[1]");
    private final By addGiftVoucherCode = By.xpath("//*[@name=\"ppw-claimCode\"]");
    private final By btnApply = By.xpath("//*[@name=\"ppw-claimCodeApplyPressed\"]");
    private final By txtCardNo = By.xpath("//*[@name=\"addCreditCardNumber\"]");
    private final By txtNameOnCard = By.xpath("//*[@name=\"ppw-accountHolderName\"]");
    private final By ddExpireDateMonth = By.xpath("//*[@id=\"pp-yuKA3J-19\"]");//Select class
    private final By ddExpireDateYear = By.xpath("//*[@name=\"ppw-expirationDate_year\"]");
    private final By btnAddYourCard = By.xpath("//*[@name=\"ppw-widgetEvent:AddCreditCardEvent\"]");
    private final By btnCancel = By.xpath("//*[@id=\"pp-yuKA3J-26-announce\"]");
    private final By btnLearnMore = By.xpath("//*[@class=\"a-button a-button-base\"]");
    private final By btnClose = By.xpath("");
    private final By btnUseThisPaymentMethod = By.xpath("//*[@id=\"orderSummaryPrimaryActionBtn-announce\"]");
    private final By lblOrderTotal = By.xpath("(//td[contains(text(),'Order total:')])[2]");
    private final By linkHowShippingCostCalculated = By.xpath("(//a[normalize-space()='How are shipping costs calculated?'])[1]");
    private final By headerOffers = By.xpath("//h3[contains(text(),'Offers')]");
    private final By headerItemsAndShipping = By.xpath("(//a[normalize-space()='How are shipping costs calculated?'])[1]");
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isTitleDisplayed() {
        return driver.findElement(titleOfPage).isDisplayed();
    }

    public Boolean isTitleLinkDisplayed() {
        return driver.findElement(titleLink).isDisplayed();
    }

    public void clickItemLinkInCheckout() throws Exception {
        try {
            driver.findElement(titleLink).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAutoFill() throws Exception {
        try {
            driver.findElement(btnAutoFill).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickEditAddress() throws Exception {
        try {
            driver.findElement(btnEdit).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAddNewAddress() throws Exception {
        try {
            driver.findElement(addNewAddress).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickReturnToCart() throws Exception {
        try {
            driver.findElement(returnToCartPopUp).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickStayInCheckout() throws Exception {
        try {
            driver.findElement(StayInCheckoutPopUp).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectCountry() throws Exception {
        try {
            //driver.findElement(ddCountry).click();
        /*Select dropdown = new Select(driver.findElement(By.id("address-ui-widgets-countryCode")));
        dropdown.selectByVisibleText("Sri Lanka");*/
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectState() throws Exception {
        try {
            driver.findElement(ddState).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterFullName(String fullName) throws Exception {
        try {
            driver.findElement(txtFullName).sendKeys(fullName);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterPhoneNo(String phoneNo) throws Exception {
        try {
            driver.findElement(txtPhoneNo).sendKeys(phoneNo);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterAddress(String address) throws Exception {
        try {
            driver.findElement(txtAddress).sendKeys(address);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterCity(String city) throws Exception {
        try {
            driver.findElement(txtCity).sendKeys(city);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterZipCode(String zip) throws Exception {
        try {
            driver.findElement(txtZipCode).sendKeys(zip);
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void clickUseThisAddress() throws Exception {
        try {
            driver.findElement(btnUseThisAddress).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void btnChangeAddress() throws Exception {
        try {
            driver.findElement(By.id("addressChangeLinkId")).click();
        } catch (Exception ex) {
            throw ex;
        }

    }

    //add payment method
    public void clickLearnMore() throws Exception {
        try {
            driver.findElement(btnLearnMore).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean titleDisplayed() throws Exception {
        try {
            return driver.findElement(By.id("a-popover-header-1")).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void clickAddCreditOrDebitCard() throws Exception {
        try {
            driver.findElement(addCreditOrDebitCard).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAddAmazonCard() throws Exception {
        try {
            driver.findElement(selectAmazonGiftCard).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickGiftVoucherCode(String code) throws Exception {
        try {
            driver.findElement(addGiftVoucherCode).sendKeys(code);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickApplyOnCode() throws Exception {
        try {
            driver.findElement(btnApply).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterCardNo(String cardNo) throws Exception {
        try {
            driver.findElement(txtCardNo).sendKeys(cardNo);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterNameOnCard(String name) throws Exception {
        try {
            driver.findElement(txtNameOnCard).sendKeys(name);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectExpireDateMonth() throws Exception {
        try {
            Select months = new Select(driver.findElement(By.id("id=\"pp-yuKA3J-19\"")));
            months.selectByVisibleText("03");
            months.selectByIndex(2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectExpireDateYear() throws Exception {
        try {
            Select months = new Select(driver.findElement(By.id("id=\"pp-yuKA3J-21\"")));
            months.selectByVisibleText("2024");
            months.selectByIndex(2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAddToYourCard() throws Exception {
        try {
            driver.findElement(btnAddYourCard).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickCancel() throws Exception {
        try {
            driver.findElement(btnCancel).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickUseThisPaymentMethod() throws Exception {
        try {
            driver.findElement(btnUseThisPaymentMethod).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void orderTotalDisplayed() throws Exception {
        try {
            driver.findElement(lblOrderTotal).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void clickHowShippingCostCalculated() throws Exception {
        try {
            driver.findElement(linkHowShippingCostCalculated).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean headerOfferDisplayed() throws Exception {
        try {
            return driver.findElement(headerOffers).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean headerItemsAndShippingDisplayed() throws Exception {
        try {
            return driver.findElement(headerItemsAndShipping).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

}

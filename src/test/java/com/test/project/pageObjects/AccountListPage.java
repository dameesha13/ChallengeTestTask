package com.test.project.pageObjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccountListPage extends BaseClass {

    private final By clickAccountAndList = By.xpath("(//a[@id='nav-link-accountList'])[1]");
    private final By headerAccountText = By.xpath("//div[normalize-space()='Your Account']");
    private final By linkAccountFromList = By.xpath("//span[normalize-space()='Account']");
    private final By linkOrdersFromList = By.xpath("//span[normalize-space()='Orders']");
    private final By linkRecommendationsFromList = By.xpath("//span[normalize-space()='Recommendations']");
    private final By linkBrowsingHistoryFromList = By.xpath("//span[normalize-space()='Browsing History']");
    private final By linkWatchlistFromList = By.xpath("//span[normalize-space()='Watchlist']");
    private final By linkVideoPurchasesAndRentalsFromList = By.xpath("//span[normalize-space()='Video Purchases & Rentals']");
    private final By linkKindleUnlimitedFromList = By.xpath("//span[contains(text(),'Kindle Unlimited')]");
    private final By linkContentAndDevicesFromList = By.xpath("//span[normalize-space()='Content & Devices']");
    private final By linkSubscribeAndSaveItemsFromList = By.xpath("//span[normalize-space()='Subscribe & Save Items']");
    private final By linkMembershipsAndSubscriptionsFromList = By.xpath("//span[normalize-space()='Memberships & Subscriptions']");
    private final By linkMusicLibraryFromList = By.xpath("//span[normalize-space()='Music Library']");
    private final By linkSwitchAccountsFromList = By.xpath("//span[normalize-space()='Switch Accounts']");
    private final By linkSignOutFromList = By.xpath("//span[normalize-space()='Sign Out']");
    private final By headerYourListsText = By.xpath("//div[@id='nav-al-title']");
    private final By linkCreateList = By.xpath("//span[normalize-space()='Create a List']");
    private final By linkFindListOrRegistryList = By.xpath("//span[normalize-space()='Find a List or Registry']");
    private final By linkAmazonSmileCharityLists = By.xpath("//span[normalize-space()='AmazonSmile Charity Lists']");
    private final By signInHeaderText = By.xpath("//h1[normalize-space()='Sign in']");

    public AccountListPage(WebDriver driver) {

        super(driver);
    }

    public void mouseHoverAccountList() throws Exception {
        try {
            Actions actions = new Actions(driver);
            WebElement accountList = driver.findElement(By.xpath("(//a[@id='nav-link-accountList'])[1]"));
            actions.moveToElement(accountList).perform();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAccountAndList() throws Exception {
        try {
            driver.findElement(clickAccountAndList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean showHeaderAccountTextDisplayed() throws Exception {
        try {
            return driver.findElement(headerAccountText).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickAccountLink() throws Exception {
        try {
            driver.findElement(linkAccountFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickOrdersLink() throws Exception {
        try {
            driver.findElement(linkOrdersFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickRecommendationsLink() throws Exception {
        try {
            driver.findElement(linkRecommendationsFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickBrowsingHistoryLink() throws Exception {
        try {
            driver.findElement(linkBrowsingHistoryFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickWatchListLink() throws Exception {
        try {
            driver.findElement(linkWatchlistFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickVideoPurchasesAndRentalsLink() throws Exception {
        try {
            driver.findElement(linkVideoPurchasesAndRentalsFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickKindleUnlimitedLink() throws Exception {
        try {
            driver.findElement(linkKindleUnlimitedFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickContentAndDevicesLink() throws Exception {
        try {
            driver.findElement(linkContentAndDevicesFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSubscribeAndSaveItemsLink() throws Exception {
        try {
            driver.findElement(linkSubscribeAndSaveItemsFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickMembershipsAndSubscriptionsLink() throws Exception {
        try {
            driver.findElement(linkMembershipsAndSubscriptionsFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickMusicLibraryLink() throws Exception {
        try {
            driver.findElement(linkMusicLibraryFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSwitchAccountsLink() throws Exception {
        try {
            driver.findElement(linkSwitchAccountsFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickSignOutLink() throws Exception {
        try {
            driver.findElement(linkSignOutFromList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public Boolean isRedirectToSignInPageDisplayed() throws Exception {
        try {
            return driver.findElement(signInHeaderText).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean showHeaderYourListsTextDisplayed() throws Exception {
        try {
            return driver.findElement(headerYourListsText).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickLinkCreateList() throws Exception {
        try {
            driver.findElement(linkCreateList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickLinkFindListOrRegistryList() throws Exception {
        try {
            driver.findElement(linkFindListOrRegistryList).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickLinkAmazonSmileCharityLists() throws Exception {
        try {
            driver.findElement(linkAmazonSmileCharityLists).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

}

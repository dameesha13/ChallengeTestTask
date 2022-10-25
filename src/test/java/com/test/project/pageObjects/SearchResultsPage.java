package com.test.project.pageObjects;

import com.test.project.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchResultsPage extends BaseClass {
//search word and click enter then load the results of search

    private final By selectFirstItemInResults = By.xpath("(//div[@class='a-section a-spacing-base'])[1]");
    private final By resultsTitle = By.xpath("//span[normalize-space()='RESULTS']");
    private final By amazonFunctionSelectOurBrand = By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[2]");
    private final By amazonFunctionPremiumBrands = By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]");
    private final By amazonFunctionPopularBrands = By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]");
    private final By brandsAmazonEssentials = By.xpath("//*[@id=\"p_89/Amazon Essentials\"]/span/a/div/label");
    private final By brandsGildan = By.xpath("(//i[@class='a-icon a-icon-checkbox'])[6]");
    private final By brandsHanes = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Hanes']");
    private final By brandsGeneric = By.xpath("//span[contains(text(),'Generic')]");
    private final By brandsChampion = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Champion']");
    private final By brandsUnderArmour = By.xpath("//span[contains(text(),'Under Armour')]");
    private final By brandsNautica = By.xpath("//span[contains(text(),'Nautica')]");
    private final By clickSeeMoreBrands = By.xpath("//a[@aria-label='See more, Brands']//span[@class='a-expander-prompt'][normalize-space()='See more']");
    private final By priceUpTo$25 = By.xpath("//span[contains(text(),'Up to $25')]");
    private final By priceUpTo$25And50 = By.xpath("//span[contains(text(),'$25 to $50')]");
    private final By priceUpTo$50And100 = By.xpath("//span[contains(text(),'$50 to $100')]");
    private final By priceUpTo$100And150 = By.xpath("//div[@id='priceRefinements']//span[@class='a-size-base a-color-base'][normalize-space()='$100 to $200']");
    private final By priceUpTo$200AndAbove = By.xpath("//span[contains(text(),'$200 & above')]");
    private final By txtMinPrice = By.xpath("//input[@id='low-price']");
    private final By txtMaxPrice = By.xpath("(//input[@id='high-price'])[1]");
    private final By btnGo = By.xpath("//*[@class=\"a-button-input\"]");
    private final By neckStyleBoatNeck = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Boat Neck']");
    private final By neckStyleCollaredNeck = By.xpath("(//span[contains(text(),'Collared Neck')])[1]");
    private final By sleeveTypeAsBell = By.xpath("//span[contains(text(),'Bell Sleeve')]");
    private final By sleeveTypeAsCap = By.xpath("(//span[@class='a-size-base a-color-base'][normalize-space()='Cap Sleeve'])[1]");
    private final By apparelPatternChevron = By.xpath("//span[contains(text(),'Chevron')]");
    private final By womenSize = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='XS']");
    private final By colorBlack = By.xpath("//a[@title='Black']//div[@class='softlines-colorsprite aok-float-left']");
    private final By sortByOption = By.xpath("(//span[@class='a-button-inner'])[1]");
    private final By selectPriceLowToHigh = By.xpath("(//span[@id='a-autoid-0-announce'])[1]");

    //pagination
    private final By btnPreviousInPagination = By.xpath("//*[@class=\"s-pagination-item s-pagination-previous s-pagination-button s-pagination-separator\"]");
    private final By btnNextInPagination = By.xpath("//*[@class=\"s-pagination-item s-pagination-next s-pagination-button s-pagination-separator\"]");
    private final By btnCurrentPageInPagination = By.xpath("//*[@class=\"s-pagination-item s-pagination-selected\"]");
    private final By btnThirdPageInPagination = By.xpath("(//a[normalize-space()='2'])[1]");
    private final By ellipsisIcon = By.xpath("(//span[@class='s-pagination-item s-pagination-ellipsis'])[1]");
    private final By selectItemAfterPagination = By.xpath("(//div[@class='a-section a-spacing-base'])[1]");
    private final By selectFourthItemInResults = By.xpath("(//div[@class='a-section a-spacing-base'])[4]");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isResultsDisplayed() throws Exception {
        try {
            return driver.findElement(resultsTitle).isDisplayed();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectWomenSize() throws Exception {
        try {
            driver.findElement(womenSize).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectColor() throws Exception {
        try {
            driver.findElement(colorBlack).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectSortByOption() throws Exception {
        try {
            driver.findElement(sortByOption).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectPriceLowToHighInSortBy() throws Exception {
        try {
            Select se = new Select(driver.findElement(By.xpath("//*[@id=\"s-result-sort-select\"]")));
            se.selectByIndex(1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectOurBrandOption() throws Exception {
        try {
            driver.findElement(amazonFunctionSelectOurBrand).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectAnItem() throws Exception {
        try {
            driver.findElement(selectFirstItemInResults).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectFourthAnItem() throws Exception {
        try {
            driver.findElement(selectFourthItemInResults).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    //pagination
    public void clickPreviousButton() throws Exception {
        try {
            driver.findElement(btnPreviousInPagination).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickNextButton() throws Exception {
        try {
            driver.findElement(btnNextInPagination).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectCurrentPageInPagination() throws Exception {
        try {
            driver.findElement(btnCurrentPageInPagination).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectThirdPageInPagination() throws Exception {
        try {
            driver.findElement(btnThirdPageInPagination).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectEllipsis() throws Exception {
        try {
            driver.findElement(ellipsisIcon).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterMinimumPrice(String minPrice) throws Exception {
        try {
            driver.findElement(txtMinPrice).sendKeys(minPrice);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enterMaximumPrice(String maxPrice) throws Exception {
        try {
            driver.findElement(txtMaxPrice).sendKeys(maxPrice);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickGoButton() throws Exception {
        try {
            driver.findElement(btnGo).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void selectFirstItemInList() throws Exception {
        try {
            driver.findElement(selectItemAfterPagination).click();
        } catch (Exception ex) {
            throw ex;
        }
    }

}

package com.shoecompany.pages;

import com.shoecompany.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(SearchProductPage.class.getName());

    public SearchProductPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//nav[@id='megaNavList']/a[2]")
    WebElement WomenSection;

    @FindBy(xpath = "//div[@id='header-link-group-container']/h4/a")
    WebElement NewArrival;

    @FindBy(xpath = "//div[@class='product-filters__size ng-star-inserted']//app-product-filter-select-box[11]/button")
    WebElement Size10;

    @FindBy(xpath = "//div[@id='product-listing__active-filters']/div[2]/button")
    WebElement Removefilter;
    public void ClickonWomenSection(){
        clickOnElement(WomenSection);
    }

    public void ClickonNewArrival(){
        clickOnElement(NewArrival);
    }

    public void ClickonSize(){
        clickOnElement(Size10);
    }

    public void ClickonRemovefilter(){
        clickOnElement(Removefilter);
    }


}

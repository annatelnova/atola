package com.telnova.pages;

import com.telnova.util.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AtolaPage {
    private WebDriver webDriver;
    private WebElement searchBox;
    protected WebDriverUtil webDriverUtil;

    By searchLocator = By.id("searchBox");


    public AtolaPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverUtil = new WebDriverUtil(webDriver);
    }

    public void open(String url) {
        webDriver.get(url);
    }

    public void findAndClickBox() {
        searchBox = webDriver.findElement(searchLocator);
        searchBox.click();
    }

    public void fillAndSubmitSearchData(String word) {
        // searchBox =  webDriverUtil.waitforExpectedCondition(ExpectedConditions.visibilityOfElementLocated(searchLocator));
        searchBox = webDriver.findElement(searchLocator);
        searchBox.sendKeys(word);
        //  webDriverUtil.jsClick("btnK", "name");
        searchBox.click();
    }

}




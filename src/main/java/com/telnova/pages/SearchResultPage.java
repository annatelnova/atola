package com.telnova.pages;

import com.telnova.util.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;
import java.util.Set;

public class SearchResultPage {
    private static WebDriver webDriver;
    private static WebElement text;
    protected static WebDriverUtil webDriverUtil;


    static By linkLocator = By.xpath(".//*[@id='ss360-layer']/div/h2/h4/div/div/a");
    static By newWindow = By.id("ss360-layer");

    public SearchResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverUtil = new WebDriverUtil(webDriver);
    }


    public static String getLinkText() {
        text = webDriverUtil.waitforExpectedCondition(
                ExpectedConditions.visibilityOfElementLocated(linkLocator));
        text = webDriver.findElement(linkLocator);
        return text.getText();
    }
}


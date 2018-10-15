package com.telnova.util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    long explicitWait = Long.parseLong((PropertiesCache.getProperty("wait.explicitWait")));
    private JavascriptExecutor executor;

    public WebDriverUtil(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, explicitWait);

    }

    public WebElement waitforExpectedCondition (ExpectedCondition expectedCondition){
         return (WebElement) webDriverWait.until(expectedCondition);
    }

    public void jsClick(String locator, String type) {
        executor = (JavascriptExecutor) webDriver;
        switch (type) {
            case "id":
                executor.executeScript("document.getElementByName(\"" + locator + "\").click()");
                break;
            case "name":
                executor.executeScript("document.getElementsByName(\"" + locator + "\")[].click()");
                break;


        }    }


    }


package com.telnova.core.tests;

import com.telnova.core.WebDriverTestBase;
import com.telnova.pages.AtolaPage;
import com.telnova.pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class AtolaTest extends WebDriverTestBase {

    // private final String atolapage  = "https://www.atola.com";
    private final String atolapage = "https://www.atola.com/?ss360Query=Seagate";
    private final String word = "Seagate";
    private String searchText = "Connecting Seagate Drives to Serial Port";

    //static By newWindow = By.id("ss360-layer");

       @Test (enabled = false)
    public void websiteTest() {
        AtolaPage openAtolaPage = new AtolaPage(webDriver);
        openAtolaPage.open(atolapage);
        //openAtolaPage.findAndClickBox();
        //openAtolaPage.fillAndSubmitSearchData(word);
        //assertTrue(SearchResultPage.getLinkText().contains(searchText));

        if( webDriver.findElement(By.id("ss360-layer")).isEnabled()){
            System.out.println("Element is Enable");
        }else{
            System.out.println("Element is Disabled");
        }
    }


}
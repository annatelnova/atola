package com.telnova.core.tests;

import com.telnova.core.WebDriverTestBase;
import com.telnova.pages.AtolaPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class AtolaTest1 extends WebDriverTestBase {

  private final String atolapage  = "https://www.atola.com";
  private final String word = "Seagate";

    @Test
    public void websiteTest() {
        AtolaPage openAtolaPage = new AtolaPage(webDriver);
        openAtolaPage.open(atolapage);
        if( webDriver.findElement(By.id("searchBox")).isEnabled()){
            System.out.println("Element is Enable");
        }else{
            System.out.println("Element is Disabled");
        }
        openAtolaPage.findAndClickBox();
        openAtolaPage.fillAndSubmitSearchData(word);

    }
}
package com.nopcommerce;

import org.junit.After;
import org.junit.Before;

public class BaseTest extends Utils{
    BrowserSelector browserSelector=new BrowserSelector();

    @Before
    public void openBrowser(){
        browserSelector.SetUpBrowser();
        driver.get("https://demo.nopcommerce.com");
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }

}

package com.nopcommerce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserSelector extends Utils {
    LoadProp loadprop = new LoadProp();
    public void SetUpBrowser(){
        String browser;
        browser=LoadProp.getProperty("browser");
        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "src\\test\\java\\com\\nopcommerce\\BrowserDrive\\geckodriver.exe");
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            driver = new FirefoxDriver();
            driver.manage().window().fullscreen();
        }
        else if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\com\\nopcommerce\\BrowserDrive\\chromedriver.exe");
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-extension");
            options.addArguments("--disable-setUpBrowser-side-navigation");
            options.addArguments("--incognito");
            options.addArguments("--disable-blink-features-BlockCredentialeSubresources");
            driver=new ChromeDriver(options);
            driver.manage().window().fullscreen();
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver", "src\\test\\java\\com\\nopcommerce\\BrowserDrive\\IEDriverServer.exe");
            InternetExplorerOptions options=new InternetExplorerOptions();
            options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-privet");
            options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
            driver.manage().window().maximize();
        }else {
            System.out.println("Browser name is empty or typed wrong"+ browser);
        }


    }

}

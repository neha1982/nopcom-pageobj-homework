package com.nopcommerce;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends Basepage {
    //1
    public static void clickElementBy(By by) {
        driver.findElement(by).click();
    }

    //2
    //for firstname,lastname,email, password nd conform password
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys("text");
    }

    //3 for Dob Date Month Year Select by value (it is attribute inside the inspact)
    // like value=2 is a fabruary month, date value = 2 so date 2nd.
    public static void selectTextByValue(By by, String text
    ) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //4 for assert close page
    public static void waitForElementDisplay(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
    }

    //5 for Dob in drop dwon visible text like january, 12, 2nd month
    public static void select_By_Visible_Text(By by, String txt) {
        Select doy = new Select(driver.findElement(by));
        doy.selectByVisibleText(txt);
    }

    //6 for computing (on the page of a website) an item, esp a graphic,
    // that changes or pops up when the pointer of a mouse moves over it
    public static void mouseOver(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    //7 for right side scroll up or down the page(vertical)
    //int i 200 goes up and -200 goes down
    public static void scrollUpDown(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + i + ")");
    }

    //8 for horizontal in website scroll left to right is int i ia 200 then goes to right
    //int i -200 then going left
    public static void scrollLeftRight(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + i + ",0)");
    }

    //9
    public static int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    //10 for mouse over element (This handler will be executed every time the cursor
    // is moved over a different list item)
    public static void mouseOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    //11 for performs the click method without releasing the mouse button over a web element.
    public static void clickAndHold(WebElement element) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
    }

    //12 The clickAndHold() method is used to perform the click method without releasing the mouse button
    public static void clickAndHold(By by) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(by)).build().perform();
    }

    //13 To perform the dragAndDrop operation directly wherein,
    // we can pass the source element and the target element as parameter.
    public static void dragAndDropElement(WebElement fromElement, WebElement toElement) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(fromElement, toElement).release().perform();
    }

    //14
    public static void dragAndDropElement(WebElement element) {
        Actions actions = new Actions(driver);
        driver.switchTo().frame(1);
        actions.dragAndDropBy(element, 135, 40).build().perform();
    }

    //15
    public static boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    //16
    public static boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    //17
    public static void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //18
    public static void waitUntilPresenceOfElementClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //19
    public static void waitUntilVisibilityOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //20 wait for alert to Display
    public boolean isAlertPresent() {
        boolean present = false;
        try {
            //check the presence of alert
            Alert alert = Basepage.driver.switchTo().alert();
            //Alert persent; set the flag
            present = true;
            //if present consume the alert
            alert.accept();
        }catch (NoAlertPresentException ex){
            //alert not present
            ex.printStackTrace();
        }
        return present;
    }
    //21 get attribute of element
    public static String getAttributeOfElement(WebElement element, String attr)
    {
        String value = element.getAttribute(attr);
        return value;
    }
    //22 ger css property of element
    public String getCssPropOfElement(WebElement element, String css){
        String value = element.getCssValue(css);
        return  value;
    }
    //23 Get current system time
    public static String GetCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");// dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }
    public static void assertEquals(String expected, String actual){
        String actual =

    }
    //24 To assert user is on right url
    public static void assertCurruntURL(String text){
        String url = driver.getCurrentUrl();
        Assert.(url, text);
    }
    public static void assertTextMessage(String expected, By by){
        String actual= selectTextByValue(by);
        Assert.assertEquals(expected, actual);

    }
    //25
    public static void dropDown(By by,String data){

        Select dob = new Select(driver.findElement(by));
     dob.selectByValue(data);

    }

    private static class Assert {
    }
}

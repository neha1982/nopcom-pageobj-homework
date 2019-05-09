package com.nopcommerce;

import org.openqa.selenium.By;

public class Homepage extends Utils {

    private By _registerLink = By.linkText("Register");
    private By _computerLink = By.linkText("Computers");
    private By _apparelLink = By.linkText("Apparel");
    private  By _digitalDownloadLink = By.linkText("Digital downloads");

    public void clickOnRegisterButton(){

        clickElementBy(_registerLink);
        clickElementBy(_computerLink);
        clickElementBy(_apparelLink);
        clickElementBy(_digitalDownloadLink);
    }
    public void clickOnCategoryLinks(String link){
        clickElementBy(By.linkText(link));
    }
    public void searchForAnyProduct(){

    }
}

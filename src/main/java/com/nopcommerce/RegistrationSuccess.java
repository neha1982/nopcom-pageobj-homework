package com.nopcommerce;

import org.openqa.selenium.By;

public class RegistrationSuccess extends Utils {
    private By _registerSuccess =By.cssSelector("div.result");

    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL();

    }




}

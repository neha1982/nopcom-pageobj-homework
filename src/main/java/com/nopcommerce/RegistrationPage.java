package com.nopcommerce;

import org.openqa.selenium.By;

import java.net.URL;

public class RegistrationPage extends Utils {
    LoadProp loadProp=new LoadProp();
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registration = By.id("register-button");

    private static String timetemp = GetCurrentTimeStamp();
    public void verifyUserIsOnRegisterPage(){
        assertURL("register");
    }




}

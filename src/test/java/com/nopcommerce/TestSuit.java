package com.nopcommerce;

import org.junit.Test;

public class TestSuit extends BaseTest{
    Homepage homepage= new Homepage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationSuccess registrationSuccess=new RegistrationSuccess();

    @Test
    public void userShouldAbleToRegisterSuccessfully(){
        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();

    }

}

package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Pradip
 */
public class LoginTest1 extends TestBase {
    LoadProperty loadProperty = new LoadProperty();

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage1(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Pleease Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);


    }

}

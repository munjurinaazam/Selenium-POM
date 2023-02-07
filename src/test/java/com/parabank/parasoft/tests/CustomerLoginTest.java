package com.parabank.parasoft.tests;

import com.parabank.parasoft.base.ParaBankBaseTest;
import com.parabank.parasoft.pages.CustomerLoginPage;
import com.parabank.parasoft.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerLoginTest extends ParaBankBaseTest {
    protected static  HomePage homepage;
   protected static CustomerLoginPage loginPage;
    public CustomerLoginTest(){
        super();
    }
    @BeforeMethod
    public void SetUP(){
        browserSetUP();
        loginPage=new CustomerLoginPage();

    }
    @Test
    public void loginShouldSucceed(){
        loginPage.fillUserName(getUserName());
        loginPage.fillPassword(gePassword());
        loginPage.clickLoginBtn();
        Assert.assertTrue(homepage.isLogoutLink());




    }
    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
}

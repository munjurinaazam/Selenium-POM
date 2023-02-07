package com.parabank.parasoft.pages;

import com.parabank.parasoft.base.ParaBankBaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends ParaBankBaseTest {
   @FindBy(name = "username")
        WebElement userEL;
   @FindBy(name= "password")
    WebElement passwordEL;
    @FindBy(css ="[type='submit']")
    WebElement loginbtn;
    public CustomerLoginPage(){
        PageFactory.initElements(driver,this);
    }
    public CustomerLoginPage fillUserName(String username){
        userEL.isDisplayed();
        userEL.sendKeys(username);

        return this;
    }
    public CustomerLoginPage fillPassword(String password){
        passwordEL.isDisplayed();
        passwordEL.sendKeys(password);
        return this;
    }
    public HomePage clickLoginBtn(){
        loginbtn.isDisplayed();
        loginbtn.click();

        return new HomePage();

    }



}

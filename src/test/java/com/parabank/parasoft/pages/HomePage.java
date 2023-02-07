package com.parabank.parasoft.pages;

import com.parabank.parasoft.base.ParaBankBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends ParaBankBaseTest {
    public int clickLoginBtn;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/ul/li[8]/a")
    List<WebElement> logoutlink;
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public boolean isLogoutLink() {
        return logoutlink.size()>0;

    }
}
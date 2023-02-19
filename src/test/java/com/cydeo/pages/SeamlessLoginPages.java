package com.cydeo.pages;

import com.cydeo.utulities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeamlessLoginPages {

    public SeamlessLoginPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement txt_username;

    @FindBy(id = "password")
    public WebElement txt_password;

    @FindBy(id = "submit-form")
    public WebElement btn_log_in;

}

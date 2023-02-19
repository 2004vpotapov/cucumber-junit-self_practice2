package com.cydeo.step_definitions;

import com.cydeo.pages.SeamlessLoginPages;
import com.cydeo.utulities.utilities.ConfigurationReader;
import com.cydeo.utulities.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_step_defs {

    SeamlessLoginPages loginPage = new SeamlessLoginPages();

    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamless.url"));

    }

    @When("user enter valid username")
    public void user_enter_valid_username() {
        loginPage.txt_username.sendKeys(ConfigurationReader.getProperty("seamless.username"));


    }

    @When("user enter valid password")
    public void user_enter_valid_password() {
        loginPage.txt_password.sendKeys(ConfigurationReader.getProperty("seamless.password"));

    }

    @And("user click log in button")
    public void userClickLogInButton() {
        loginPage.btn_log_in.click();
    }

    @Then("user should be able to log in")
    public void user_should_be_able_to_log_in() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Files"));

    }

    @When("user enter valid username {string}")
    public void userEnterValidUsername(String username) {
        if(username.equals("Empty")){
            loginPage.txt_username.sendKeys("");
        }else{
            loginPage.txt_username.sendKeys(username);
        }

    }

    @And("user enter valid password {string}")
    public void userEnterValidPassword(String password) {
        if(password.equals("Empty")){
            loginPage.txt_password.sendKeys("");
        }else{
            loginPage.txt_password.sendKeys(password);
        }

    }

    @Then("user should not be able to log in")
    public void userShouldNotBeAbleToLogIn() {

    }
}




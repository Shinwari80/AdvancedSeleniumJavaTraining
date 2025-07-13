package com.qascript.StepDefs;

import com.qascript.BaseClass;
import com.qascript.PageObjects.HomePage;
import com.qascript.PageObjects.LoginPage;
import com.qascript.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginStepsDefs extends BaseClass {

    Properties properties = PropertiesUtil.loadUserProperties();

    @Given("user enters valid username in the email field")
    public void userEntersValidUsernameInTheEmailField() {

        String username = properties.getProperty("username");
        LoginPage.enterUserName(username);

    }

    @And("user enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        String password = properties.getProperty("password");
        LoginPage.enterPassword(password);
    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {

        LoginPage.clickLogin();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {

        HomePage.validateLogin("My Account");
    }

    @Given("^user enters invalid (.*) in the email field$")
    public void userEntersInvalidUsernameInTheEmailField(String email) {

        LoginPage.enterUserName(email);
    }

    @And("^user enters invalid (.*) in the password field$")
    public void userEntersInvalidPasswordInThePasswordField(String password) {
        LoginPage.enterPassword(password);
    }

    @Then("^error (.*) is displayed$")
    public void errorMessageIsDisplayed(String message) {

        LoginPage.validateInvalidLogin(message);

    }

    @Given("User is logged into the application")
    public void userIsLoggedIntoTheApplication() {

        userEntersValidUsernameInTheEmailField();
        userEntersValidPasswordInThePasswordField();
        userClicksOnTheLoginButton();
        userIsLoggedInSuccessfully();
    }



}

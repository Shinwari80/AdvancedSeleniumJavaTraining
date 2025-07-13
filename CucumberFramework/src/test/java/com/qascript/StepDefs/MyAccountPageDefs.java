package com.qascript.StepDefs;

import com.qascript.BaseClass;
import com.qascript.PageObjects.LoginPage;
import com.qascript.PageObjects.MyAccountPage;
import com.qascript.Utils.BrowserUtils;
import com.qascript.Utils.PropertiesUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class MyAccountPageDefs{

    WebDriver driver;
    @Given("user enters valid username in the email field of the websites")
    public void userEntersValidUsernameInTheEmailFieldOfTheWebsites() {

        driver.findElement(By.id("input-password")).sendKeys("test@123");
    }

    @When("user enters valid password in the password fields")
    public void userEntersValidPasswordInThePasswordFields() {
    }

    @Then("user clicks on the login buttons")
    public void userClicksOnTheLoginButtons() {
    }
}

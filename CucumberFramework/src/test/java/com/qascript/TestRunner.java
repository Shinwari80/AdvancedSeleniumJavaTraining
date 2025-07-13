package com.qascript;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.Messages;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login.feature"},

        plugin = {
                 "pretty",
                 "html:target/cucumber.html",
                 "json:target/cucumber.json"
        },

        publish = true
)
public class TestRunner {


}
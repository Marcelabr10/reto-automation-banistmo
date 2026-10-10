package com.qa.automation.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.qa.automation.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class CucumberTestSuite {
}
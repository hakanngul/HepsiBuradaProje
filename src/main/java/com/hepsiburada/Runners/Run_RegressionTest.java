package com.hepsiburada.Runners;

import com.hepsiburada.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@RegressionTest"
        ,
        features = {"src/test/java/com/hepsiburada/TestHepsiBurada.feature"},

        glue = {"com/hepsiburada/stepDefinitions"},

        plugin = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json", "html:target/cucumber-html-report", "usage:target/cucumber-usage.json", "" +
                "junit:target/cucumber-results.xml"},
        dryRun = false
)
public class Run_RegressionTest extends AbstractTestNGCucumberTests {

    @After
    public void closeBrowser() {
        Driver.quitDriver();
    }
}

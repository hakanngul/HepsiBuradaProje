package com.hepsiburada.Runners;

import com.hepsiburada.Utilities.Driver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        tags = "@RegressionTest",
        features = {"src/test/java/com/hepsiburada/"},
        glue = {"com/hepsiburada/stepDefinitions"},
        plugin = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json", "html:target/cucumber-html-report.html", "usage:target/cucumber-usage.json", "" +
                "junit:target/cucumber-results.xml"}
)
public class Run_ParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    public static void beforeClass() {
        Driver.browserName.set("chrome");
    }
    @AfterClass
    public void tearDown() {
        if (Driver.getDriver() != null) {
            Driver.quitDriver();
        }

    }

}

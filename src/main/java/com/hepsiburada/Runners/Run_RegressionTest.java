package com.hepsiburada.Runners;

import com.hepsiburada.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class Run_RegressionTest extends AbstractTestNGCucumberTests {

    @After
    public void closeBrowser() {
        Driver.quitDriver();
    }
}

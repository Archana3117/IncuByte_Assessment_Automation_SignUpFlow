package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//resources//features//CreateAccountAndSignIn.feature",
            
                 glue={"stepdefination","hooks"},
                 plugin = {"pretty","html:reports/cucumber-reports.html"},
                 dryRun=true,
                 publish = true)
public class TestRunner {

}

package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\bhara\\eclipse-workspace\\Cucumber\\src\\"
		+ "test\\java\\com\\cucum\\feature\\LoginPage.feature",
		glue ="\\step\\definepack",
		dryRun=false,
		publish =true,
		monochrome=true)
		


public class TestRunnerClass {

}

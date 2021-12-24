 package com.test.runner;

import com.test.runner.BaseRunner;

import cucumber.api.CucumberOptions;


@CucumberOptions(
		strict = true,
		monochrome = true, 
		features = {"src/test/resources/features/"},
		tags={"@Vtiger1"},
		glue = {"com.test.stepdefinition","com.test.runner"}, 	
		plugin = {
	                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
	                "pretty",
	                "json:target/cucumber-reports/cucumber.json",
	                "html:target/cucumber-reports"
	        }
	
		 
	
		)

public class TestSuiteRunner extends BaseRunner{
	
	
}


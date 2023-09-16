package com.dbankdemo.testscripts;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features/login.feature",
		glue = "com.dbankdemo.testscripts"
		//dryRun = true
		)


public class TestRunner extends AbstractTestNGCucumberTests {
	

}

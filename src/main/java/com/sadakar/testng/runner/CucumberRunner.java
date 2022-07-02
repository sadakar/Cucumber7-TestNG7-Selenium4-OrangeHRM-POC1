package com.sadakar.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		//tags="@LoginValidCredentials",
		//tags="@DashboardTabCountOfQuickLaunhElements",
		//tags="@DirectoryTabNavigationFromDashboardTab",
		//tags="@DirectoryTabIsSearchButtonDisplayed",
		tags="@LoginValidCredentials or @DashboardTabCountOfQuickLaunhElements or @DirectoryTabNavigationFromDashboardTab or @DirectoryTabIsSearchButtonDisplayed",
		
		//tags="@LoginValidCredentials and not @DashboardTabCountOfQuickLaunhElements and not @DirectoryTabNavigationFromDashboardTab or @DirectoryTabIsSearchButtonDisplayed",
		
		features = "classpath:cucumberfeatures", glue = { "com.sadakar.common", "com.sadakar.stepdefinitions",
				"com.sadakar.testng.runner", "com.inovalon.cucumber.common" },

		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",	"html:target/cucumber-reports/cucumberreport.html" }, 
		
		monochrome = true)
public class CucumberRunner extends AbstractTestNGCucumberTests {


}

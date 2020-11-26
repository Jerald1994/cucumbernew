package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = {
		"AnotherStep" }, monochrome = true, snippets = SnippetType.CAMELCASE, strict = false, plugin = {
				"json:src\\test\\resources\\Report\\cucumber.json" }, dryRun = false, tags = { "@jerry" })

public class TestRunnerMethod {
	@AfterClass
	public static void after() {
		JvmReport.jvmRepot(
				"C:\\Users\\Mukesh\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\Report\\cucumber.json");
	}

}

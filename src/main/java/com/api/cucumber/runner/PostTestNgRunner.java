package com.api.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/main/java/com/api/cucumber/featurefile/Login.feature",
				"src/main/java/com/api/cucumber/featurefile/PostFeature.feature"},
		glue = {"com.api.cucumber.stepdfn"},
		monochrome = true
		)

public class PostTestNgRunner extends AbstractTestNGCucumberTests {

}

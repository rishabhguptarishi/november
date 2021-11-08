package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utils.SeleniumDriver;

@CucumberOptions(features = { "src/test/resources/features" }, glue = { "step_definations" }, tags = {
		"@chrome" }, plugin = { "html:target/test-report", "json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml" })

public class RunCucm extends AbstractTestNGCucumberTests {
	/*
	 * @Parameters("browserName")
	 * 
	 * @BeforeTest public void SendBrowser(String browserName) {
	 * System.out.println(browserName); SeleniumDriver.setUp(browserName); }
	 */
}

package step_definations;

import cucumber.api.java.After;
import utils.SeleniumDriver;

public class AfterActions {

	@After

	public static void tearDownn() {

		SeleniumDriver.tearDown();
	}
}

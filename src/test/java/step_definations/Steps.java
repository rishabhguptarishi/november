package step_definations;

import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class Steps {
	@Given("^user opens the android app in \"(.*?)\"$")
	public void user_opens_the_android_app_in(String arg1) throws Throwable {

		System.out.println("Opened browswer is" + arg1);
		SeleniumDriver.setUpDriver(arg1);
		SeleniumDriver.openPage("https://www.google.com");
		Thread.sleep(5000);
		System.out.println("Step1 is completed");

	}

	@Given("^user opens the snackmagic website in \"(.*?)\"$")
	public void user_opens_the_snackmagic_website_in(String arg1) throws Throwable {
		System.out.println("Opened browswer is" + arg1);
		SeleniumDriver.setUpDriver(arg1);
		// SeleniumDriver.setUp(arg1);
		SeleniumDriver.openPage("https://www.snackmagic.com/");
		Thread.sleep(5000);
		System.out.println("Step1 is completed");

	}

	@When("^user clicks on the Media option$")
	public void user_clicks_on_the_Media_option() throws Throwable {
		System.out.println("Step2 is completed");
		Assert.assertEquals("Yes", "NO");

	}

	@Then("^validate custom view$")
	public void validate_custom_view() throws Throwable {
		System.out.println("Step3 is completed");
	}

}

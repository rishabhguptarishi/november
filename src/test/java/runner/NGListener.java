package runner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NGListener implements ITestListener {

	public void onTestStart(ITestResult iTestResult) {
		System.out.println("On test start");
	}

	public void onTestSuccess(ITestResult iTestResult) {

		System.out.println("On test Sucess");
	}

	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("On test failure");

	}

	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("On test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("On test percentage");
	}

	public void onStart(ITestContext iTestContext) {
		System.out.println("On start");

	}

	public void onFinish(ITestContext iTestContext) {
		System.out.println("On finish");

	}

}

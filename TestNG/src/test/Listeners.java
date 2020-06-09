package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart() {
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Hey Listener success " + result.getName());
	}
	public void onTestFailure(ITestResult result) {

	}
	public void onTestSkipped(ITestResult result) {

	}
	public void onTestFailedButWithinSuccessPercentage() {

	}
	public void onStart(ITestResult result) {

	}
	public void onFinish(ITestResult result) {

	}

}

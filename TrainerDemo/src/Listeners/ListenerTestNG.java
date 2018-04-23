package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("got finished");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("It got started");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method got failed"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test method got skipped"+result.getName());		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test method got started");		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method got success"+ result.getName());
		
	}

}

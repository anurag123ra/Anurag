package com.app.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.app.testBase.TestBase;

public class SetupListener extends TestBase implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		System.out.println("Execution Started");
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Is Done");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Util.screenShot(result.getName()+System.currentTimeMillis());
		System.out.println("Taken the ss");
	}

	
	public void onTestSkipped(ITestResult result) {
		
	}

	
}

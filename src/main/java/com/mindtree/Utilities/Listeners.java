package com.mindtree.Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mindtree.ReusableComponents.Base;
import com.relevantcodes.extentreports.LogStatus;

public  class Listeners  extends Base implements ITestListener{
	

	public void onTestFailure(ITestResult result) {

		try 
		{ 
         
		 ScreenShots.getScreenshotonFail(result.getName());
		 logger.debug("The test case "+" "+result.getName()+" "+"is failed");
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		logger.debug("The test case "+" "+result.getName()+" "+"is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS,result.getName());
		try {
			ScreenShots.getScreenshotonPass(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug("The test case "+" "+result.getName()+" "+"is passed");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		logger.debug("The test case "+" "+result.getName()+" "+"is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	

}

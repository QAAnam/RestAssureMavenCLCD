package extentReports;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners implements ITestListener, ISuiteListener
{

	@Override
	public void onStart(ISuite suite) {
		ExtentReportsClass.initReport();
	}

	@Override
	public void onFinish(ISuite suite) {
		ExtentReportsClass.teardown();
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReportsClass.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentReportsClass.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentReportsClass.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentReportsClass.createTest(result.getMethod().getMethodName());
	}

	

	
}

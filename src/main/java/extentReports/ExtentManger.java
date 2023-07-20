package extentReports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManger 
{
	private ExtentManger() {}
	
	private static ThreadLocal<ExtentTest> xtest=new ThreadLocal<>();
	
	static ExtentTest getTest()
	{
		return xtest.get();
	}
	static void setTest(ExtentTest test)
	{
		xtest.set(test);
	}

}

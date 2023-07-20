package extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentReportsClass 
{
	private ExtentReportsClass() {}
	private static ExtentReports extent;
	private static ExtentTest test;
	
	public static void initReport()
	{
		//before suit
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		extent.attachReporter(spark);
		

	}
	public static void teardown()
	{
		
		extent.flush();

	}
	public static void createTest(String m)
	{
		test = extent.createTest(m);
		ExtentManger.setTest(test);
		//test.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
	}

}

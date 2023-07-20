package extentReports;

import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public final class ExtentLogger
{
	private ExtentLogger() {}
	
	public static void pass(String massage)
	{ 
		ExtentManger.getTest().pass(massage);
	}
	public static void fail(String massage)
	{ 
		ExtentManger.getTest().fail(MarkupHelper.createLabel(massage, ExtentColor.RED));
	}
	
	public static void info(String massage)
	{ 
		ExtentManger.getTest().info(MarkupHelper.createLabel(massage, ExtentColor.YELLOW));
	}
	
	public static void logresponse(String massage)
	{ 
		ExtentManger.getTest().pass(MarkupHelper.createCodeBlock(massage, CodeLanguage.JSON));
	}
	
	
}

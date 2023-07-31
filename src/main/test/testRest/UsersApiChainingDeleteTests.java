package testRest;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import baseLibrary.ApiUtils;
import baseLibrary.UtilityClassbase;
import extentReports.ExtentLogger;
import io.restassured.response.Response;

public class UsersApiChainingDeleteTests 
{
	@Test
	public void deleteUser(ITestContext itestcontext)
	{
		int ID = Integer.parseInt(String.valueOf(itestcontext.getSuite().getAttribute("userid")));
		Response respo = ApiUtils.deleteRequestUserBase().pathParam("id", ID).delete("{id}");
		respo.prettyPrint();
		UtilityClassbase.PrintText(respo.getStatusLine());
		ExtentLogger.logresponse(respo.asString());
		ExtentLogger.info(respo.getStatusLine());
	}

}

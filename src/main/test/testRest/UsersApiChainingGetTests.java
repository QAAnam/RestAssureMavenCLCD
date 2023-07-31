package testRest;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import baseLibrary.ApiUtils;
import baseLibrary.UtilityClassbase;
import builderClass.SerializedBodyUsers;
import extentReports.ExtentLogger;
import io.restassured.response.Response;

public class UsersApiChainingGetTests
{
	@Test
	public void createUser(ITestContext ittestcontext)
	{
		int Id = Integer.parseInt(ittestcontext.getSuite().getAttribute("userid").toString());
		
		Response respo = ApiUtils.getRequestUserBase().pathParams("id", Id).get("{id}");
		respo.prettyPrint();
		int id = respo.jsonPath().getInt("id");
		ExtentLogger.logresponse(respo.asString());
		UtilityClassbase.PrintText(String.valueOf(id));
	}
}

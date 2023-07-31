package testRest;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import baseLibrary.ApiUtils;
import baseLibrary.UtilityClassbase;
import builderClass.SerializedBodyUsers;
import builderClass.UsersBody;
import extentReports.ExtentLogger;
import io.restassured.response.Response;

public class UsersApiChainingCreateTests
{
	@Test
	public void createUser(ITestContext ittestcontext)
	{
		
		Response respo = ApiUtils.createRequestUserBase().body(SerializedBodyUsers.getBodytoPost()).post();
		respo.prettyPrint();
		int id = respo.jsonPath().getInt("id");
		
		UtilityClassbase.PrintText(String.valueOf(id));
		ittestcontext.getSuite().setAttribute("userid", id);
		ExtentLogger.logresponse(respo.asString());
	}
}

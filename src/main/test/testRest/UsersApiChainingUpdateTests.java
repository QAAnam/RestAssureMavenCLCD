package testRest;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import baseLibrary.ApiUtils;
import baseLibrary.UtilityClassbase;
import builderClass.SerializedBodyUsers;
import builderClass.UsersBody;
import extentReports.ExtentLogger;
import io.restassured.response.Response;

public class UsersApiChainingUpdateTests
{
	@Test
	public void updateUser(ITestContext itestcontext)
	{
		int ID= Integer.parseInt(itestcontext.getSuite().getAttribute("userid").toString());
		UsersBody body = SerializedBodyUsers.getBodytoUpdate().id(ID).build();
		Response respo = ApiUtils.putRequestUserBase().body(body).pathParam("id", ID).put("{id}");
		respo.prettyPrint();
		UtilityClassbase.PrintText(String.valueOf(respo.jsonPath().getInt("id")));
		ExtentLogger.logresponse(respo.asString());
	}

}

package testRest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.Arrays;
import static org.assertj.core.api.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import baseLibrary.ApiUtils;
import baseLibrary.UtilityClassbase;
import extentReports.ExtentLogger;
import io.restassured.response.Response;
import pojo.DesirializedResponse;
public class GetRequests
{
	@Test
	public void getSimple()
	{
		UtilityClassbase.PrintText("getSimple");
		Response response = ApiUtils.getRequestWithBase().pathParam("users", "users").pathParam("id", 239).get("{users}/{id}");
		ExtentLogger.logresponse(response.asPrettyString());
		response.prettyPrint();
		DesirializedResponse respo = response.as(DesirializedResponse.class);
		UtilityClassbase.PrintText(respo.getCity());
		assertThat(respo.getAge())
		.as("ager verification").isBetween(18, 60);
		
		
	}
	@Test
	public void getSimplewithPath()
	{
		Response response = given().baseUri("http://localhost:3000/").pathParam("dict", "subjects").pathParam("id", 2).log().all().get("/{dict}/{id}/");
		response.prettyPrint();ExtentLogger.logresponse(response.asPrettyString());
	}
	@Test
	public void getSimplewithQuery()
	{
		Response response = given().baseUri("http://localhost:3000/").pathParam("dict", "subjects").queryParam("name", "Maths").log().all().get("/{dict}");
		response.prettyPrint();ExtentLogger.logresponse(response.asPrettyString());
	}

}

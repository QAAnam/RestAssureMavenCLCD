package testRest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import baseLibrary.UtilityClassbase;
import extentReports.ExtentLogger;
import io.restassured.response.Response;
import pojo.ReqBody;
import pojo.subject_marks;

public class PostUsingPojoASReqBody
{
	@Test
	public void postUsingPojoAsBody()
	{
		List<Integer> othermark = new ArrayList<Integer>();
		othermark.add(100);
		othermark.add(100);
		subject_marks subjmark = new subject_marks(500, 100, 100, 100, othermark);
		List<String> name = new ArrayList<String>();
		name.add("abcdefg");
		name.add("fghijk");
		ReqBody body1=new ReqBody(1212, "Anam Kumar", 23, "Begusarai", "anam.kumar@gmail.com", 121212122, 67, subjmark, name);
		UtilityClassbase.PrintText("postUsingPojoAsBody");
		Response reponse = given().body(body1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
		ExtentLogger.logresponse(reponse.asPrettyString());
	}
	@Test
	public void postUsingPojoAsBodyUsingDefaultPojoValues()
	{
		List<Integer> othermark = new ArrayList<Integer>();
		othermark.add(200);
		othermark.add(200);
		subject_marks subjmark = new subject_marks(500, 100, 100, 100, othermark);
		List<String> name = new ArrayList<String>();
		name.add("only name required");
		name.add("only name required");
		ReqBody body1=new ReqBody(subjmark, name);
		UtilityClassbase.PrintText("postUsingPojoAsBodyUsingDefaultPojoValues");
		Response reponse = given().body(body1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
		ExtentLogger.logresponse(reponse.asPrettyString());
	}

}

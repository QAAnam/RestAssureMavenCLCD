package testRest;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import baseLibrary.Utility;
import io.restassured.response.Response;
import pojo.ReqBody;
import pojo.ReqBodyUsingLombok;
import pojo.subject_marks;

public class PostUsingLomBok 
{
	@Test
	public void postUsingLombokAsBodyUsingPojo()
	{
		List<Integer> othermark = new ArrayList<Integer>();
		othermark.add(100);
		othermark.add(100);
		subject_marks subjmark = new subject_marks(500, 100, 100, 100, othermark);
		List<String> name = new ArrayList<String>();
		name.add("abcdefg");
		name.add("fghijk");
		ReqBodyUsingLombok body1=new ReqBodyUsingLombok();
		Utility.PrintText("postUsingLombokAsBodyUsingPojo");
		Response reponse = given().body(body1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
		
	}

}

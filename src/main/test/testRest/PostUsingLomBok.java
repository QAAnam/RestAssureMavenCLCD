package testRest;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import baseLibrary.UtilityClassbase;
import io.restassured.response.Response;
import pojo.ReqBody;
import pojo.ReqBodyUsingLombok;
import pojo.SimpleLambokLoad;
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
		ReqBodyUsingLombok body1=new ReqBodyUsingLombok(576523, "f tyyd trd", 789, "kjgtrxezcez", "xbcttcn", 7687, 6675, subjmark, name);
		UtilityClassbase.PrintText("postUsingLombokAsBodyUsingPojo");
		Response reponse = given().body(body1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
		
	}
	@Test
	public void postUsingLombokAsBodyUsingPojosimple()
	{
		
		SimpleLambokLoad body1=new SimpleLambokLoad(535, "f tyyd trd", 789, "kjgtrxezcez", "xbcttcn", 7687);
		UtilityClassbase.PrintText("postUsingLombokAsBodyUsingPojosimple");
		Response reponse = given().body(body1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
		
	}
	@Test
	public void postUsingLombokAsBodyUsingPojosimple1()
	{
		
		SimpleLambokLoad body1=new SimpleLambokLoad(455, "f tyyd trd", 789, null, "xbcttcn", 7687);
		UtilityClassbase.PrintText("postUsingLombokAsBodyUsingPojosimple");
		Response reponse = given().body(body1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
		
	}

}

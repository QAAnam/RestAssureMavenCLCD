package practice;

import org.testng.annotations.Test;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import baseLibrary.UtilityClassbase;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Practice 
{
	@Test
	public void getRequst()
	{
		given().get("http://localhost:3000/users").then().statusCode(200);
	}
	@Test
	public void getResponsewithReq()
	{
		Response response = given().get("http://localhost:3000/users");
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.contentType());
	}
	@Test
	public void getHeaders()
	{
		UtilityClassbase.PrintText("getHeaders");
		Response response = given().get("http://localhost:3000/users");
		Headers headers = response.getHeaders();
		
		for (Header headr : headers)
		{
			System.out.println(headr.getName() +"---->>>"+ headr.getValue());
		}
	}
	@Test
	public void postBodyAsString()
	{
		UtilityClassbase.PrintText("postBodyAsString");
		String requestbody="{\"id\":1000,\"name\":\"Mr. Melvin Abshire\",\"age\":16,\"city\":\"North Marielaborough\","
				+ "\"email\":\"jay.harris@hotmail.com\",\"phone\":10381845,\"subjectID\":64,\"subject_marks\":{\"Total_marks\":329,"
				+ "\"hindi_marks\":85,\"Science_marks\":75,\"Math_marks\":35,\"other_marks\":[35,50,50]},\"Names\":[\"Mitalee\",\"Ruby\"]}";
		Response reponse = given().body(requestbody).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
	}
	@Test
	public void postBodyAsJsonFile() // not able to loag reqbody as it is a file
	{
		UtilityClassbase.PrintText("postBodyAsJsonFile");
		File file = new File(System.getProperty("user.dir")+"/reqbody.json");
		Response reponse = given().body(file).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
	}
	@Test
	public void postAsFileAndAlsoRead() throws IOException
	{
		UtilityClassbase.PrintText("postAsFileAndAlsoRead");
		byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/reqbody.json"));
		String file = new String(bytes);
		Response reponse = given().body(file).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
	}
	@Test
	public void postAsFileAndAlsoReadAndReplace() throws IOException
	{
		UtilityClassbase.PrintText("postAsFileAndAlsoReadAndReplace");
		byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/reqbody.json"));
		String file = new String(bytes);
		String file1= file.replace("1111", String.valueOf(new Faker().number().numberBetween(10, 1000)));
		Response reponse = given().body(file1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
	}
	@Test
	public void postBodyAsMapHashMap()
	{
//	    "id": 999,
//	    "name": "Mr. Melvin Abshire",
//	    "age": 16,
//	    "city": "North Marielaborough",
//	    "email": "jay.harris@hotmail.com",
//	    "phone": 10381845,
//	    "subjectID": 64,
		Map<String, Object> body = new HashMap<String, Object>(); //use linked hashmap for mainting order
		body.put("id",new Faker().number().numberBetween(10, 1000));
		body.put("name", new Faker().name().fullName());
		body.put("age", new Faker().number().numberBetween(10, 1000));
		body.put("city", new Faker().address().secondaryAddress());
		body.put("email", new Faker().internet().emailAddress());
		
		UtilityClassbase.PrintText("postBodyAsMapHashMap");
		Response reponse = given().body(body).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
		reponse.prettyPrint();
	}
	@Test
	public void postBodyAsMapHashMapOnLittleMoreComplex()
	{
//		{
//		    "id": 999,
//		    "name": "Mr. Melvin Abshire",
//		    "age": 16,
//		    "city": "North Marielaborough",
//		    "email": "jay.harris@hotmail.com",
//		    "phone": 10381845,
//		    "subjectID": 64,
//		    "subject_marks": {
//		        "Total_marks":329,
//		        "hindi_marks" : 85,
//		        "Science_marks": 75,
//		        "Math_marks": 35,
//		        "other_marks": [35,50,50]
//		    },
//		    "Names" : ["Mitalee","Ruby"]
//		}
		Map<String, Object> body = new LinkedHashMap<String, Object>(); //use linked hashmap for mainting order
		body.put("id",new Faker().number().numberBetween(10, 1000));
		body.put("name", new Faker().name().fullName());
		body.put("age", new Faker().number().numberBetween(10, 1000));
		body.put("city", new Faker().address().secondaryAddress());
		body.put("email", new Faker().internet().emailAddress());
		body.put("phone", new Faker().number().randomNumber(10, true));
		body.put("subjectID",new Faker().number().numberBetween(10, 1000));
		Map<String, Object> subject_marks = new LinkedHashMap<String, Object>();
		subject_marks.put("Total_marks", new Faker().number().numberBetween(500, 1000));
		subject_marks.put("hindi_marks", new Faker().number().numberBetween(60, 100));
		subject_marks.put("Science_marks", new Faker().number().numberBetween(60, 100));
		subject_marks.put("Math_marks", new Faker().number().numberBetween(60, 100));
		ArrayList<Integer> other_marks = new ArrayList<Integer>();
		other_marks.add(new Faker().number().numberBetween(60, 100));
		other_marks.add(new Faker().number().numberBetween(60, 100));
		subject_marks.put("other_marks", other_marks);
		body.put("subject_marks", subject_marks);
		ArrayList<String> Names = new ArrayList<String>();
		Names.add(new Faker().harryPotter().character());
		Names.add(new Faker().harryPotter().character());
		body.put("Names", Names);
		UtilityClassbase.PrintText("postBodyAsMapHashMapOnLittleMoreComplex");
		Response reponse = given().body(body).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
	}
	@Test
	public void postBodyAsMapHashMapOnLittleMoreComplexUsingJsonLibrarayFromOrgdotJson()
	{
//		{
//	    "id": 999,
//	    "name": "Mr. Melvin Abshire",
//	    "age": 16,
//	    "city": "North Marielaborough",
//	    "email": "jay.harris@hotmail.com",
//	    "phone": 10381845,
//	    "subjectID": 64,
//	    "subject_marks": {
//	        "Total_marks":329,
//	        "hindi_marks" : 85,
//	        "Science_marks": 75,
//	        "Math_marks": 35,
//	        "other_marks": [35,50,50]
//	    },
//	    "Names" : ["Mitalee","Ruby"]
//	}
	JSONObject body = new JSONObject(); //use linked hashmap for mainting order
	body.put("id",new Faker().number().numberBetween(10, 1000));
	body.put("name", new Faker().name().fullName());
	body.put("age", new Faker().number().numberBetween(10, 1000));
	body.put("city", new Faker().address().secondaryAddress());
	body.put("email", new Faker().internet().emailAddress());
	body.put("phone", new Faker().number().randomNumber(10, true));
	body.put("subjectID",new Faker().number().numberBetween(10, 1000));
	JSONObject subject_marks = new JSONObject();
	subject_marks.put("Total_marks", new Faker().number().numberBetween(500, 1000));
	subject_marks.put("hindi_marks", new Faker().number().numberBetween(60, 100));//trying accumulate
	subject_marks.accumulate("hindi_marks", new Faker().number().numberBetween(60, 100));//trying accumulate 
	subject_marks.put("Science_marks", new Faker().number().numberBetween(60, 100));//trying append
//	subject_marks.append("Science_marks", new Faker().number().numberBetween(60, 100));//trying append is for array 
	subject_marks.put("Math_marks", new Faker().number().numberBetween(60, 100));
	JSONArray other_marks = new JSONArray();
	other_marks.put(new Faker().number().numberBetween(60, 100));
	other_marks.put(new Faker().number().numberBetween(60, 100));
	subject_marks.put("other_marks", other_marks);
	body.put("subject_marks", subject_marks);
	JSONArray Names = new JSONArray();
	Names.put(new Faker().harryPotter().character());
	Names.put(new Faker().harryPotter().character());
	body.put("Names", Names);
	String body1 = body.toString();
	UtilityClassbase.PrintText("postBodyAsMapHashMapOnLittleMoreComplexUsingJsonLibrarayFromOrgdotJson");
	Response reponse = given().body(body1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/users");
	reponse.prettyPrint();
}
	

}

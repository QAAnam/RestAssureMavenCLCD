package testRest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class GetRequests
{
	@Test
	public void getSimple()
	{
		Response response = given().baseUri("http://localhost:3000/users").log().all().get();
		
	}
	@Test
	public void getSimplewithPath()
	{
		Response response = given().baseUri("http://localhost:3000/").pathParam("dict", "subjects").pathParam("id", 2).log().all().get("/{dict}/{id}/");
		response.prettyPrint();
	}
	@Test
	public void getSimplewithQuery()
	{
		Response response = given().baseUri("http://localhost:3000/").pathParam("dict", "subjects").queryParam("name", "Maths").log().all().get("/{dict}");
		response.prettyPrint();
	}

}

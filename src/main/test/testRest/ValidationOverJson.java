package testRest;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.github.fge.jsonschema.messages.JsonSchemaValidationBundle;
import baseLibrary.UtilityClassbase;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;
import pojo.SimpleLambokLoad;
public class ValidationOverJson 
{
	@Test
	public void prnitPaths()
	{
		Response response = given().baseUri("http://localhost:3000/").pathParam("dict", "subjects").pathParam("id", 2).log().all().get("/{dict}/{id}");
		UtilityClassbase.PrintText(response.jsonPath().getString("name"));
		UtilityClassbase.PrintText("prnitPaths");
		response.prettyPrint();
	}
	@Test
	public void prnitPaths1()
	{
		UtilityClassbase.PrintText("prnitPaths1");
		Response response = given().baseUri("http://localhost:3000/").pathParam("dict", "subjects").log().all().get("/{dict}");
		UtilityClassbase.PrintText(response.jsonPath().getString("[1].name"));
	}
	@Test
	public void prnitPathsDeserialized()
	{
		Response response =  given().baseUri("http://localhost:3000/").pathParam("dict", "subjects").pathParam("id", 2).log().all().get("/{dict}/{id}/");
		SimpleLambokLoad deserialized = response.as(SimpleLambokLoad.class);
		
		UtilityClassbase.PrintText(deserialized.getName());
	}
	@Test
	public void validateJsonSchema()
	{
		UtilityClassbase.PrintText("validateJsonSchema");
		Response response =  given().baseUri("http://localhost:3000/").pathParam("dict", "subjects").pathParam("id", 2).log().all().get("/{dict}/{id}");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(new File(System.getProperty("user.dir")+"/Schema.json")));
	}
	@Test
	public void storeResponse() throws IOException
	{
		Response response = given().log().all().get("http://localhost:3000/users");
		Files.write(Paths.get(System.getProperty("user.dir")+"/Response.json"), response.asByteArray());
	}
	


}

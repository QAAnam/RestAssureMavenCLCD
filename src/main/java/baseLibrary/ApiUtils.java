package baseLibrary;
import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;

public final class ApiUtils
{
	private ApiUtils() {}
	public static RequestSpecification getRequestWithBase()
	{
		return given().baseUri("http://localhost:3000/").log().all();
	}

}

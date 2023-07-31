package baseLibrary;
import static io.restassured.RestAssured.*;

import constants.FrameConstants;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public final class ApiUtils
{
	private ApiUtils() {}
	public static RequestSpecification getRequestWithBase()
	{
		return given().baseUri("http://localhost:3000/").log().all();
	}
	public static RequestSpecification getRequestUserBase()
	{
		return given().baseUri(FrameConstants.getINSTANCE().getBaseUserURI()).auth().oauth2(FrameConstants
				.getINSTANCE().getBearerToken()).contentType(ContentType.JSON).log().all();
	}
	public static RequestSpecification createRequestUserBase()
	{
		return given().baseUri(FrameConstants.getINSTANCE().getBaseUserURI()).auth().oauth2(FrameConstants
				.getINSTANCE().getBearerToken()).contentType(ContentType.JSON).log().all();
	}
	public static RequestSpecification putRequestUserBase()
	{
		return given().baseUri(FrameConstants.getINSTANCE().getBaseUserURI()).auth().oauth2(FrameConstants
				.getINSTANCE().getBearerToken()).contentType(ContentType.JSON).log().all();
	}
	public static RequestSpecification deleteRequestUserBase()
	{
		return given().baseUri(FrameConstants.getINSTANCE().getBaseUserURI()).auth().oauth2(FrameConstants
				.getINSTANCE().getBearerToken()).contentType(ContentType.JSON).log().all();
	}

}

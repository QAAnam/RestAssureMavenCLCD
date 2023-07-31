package constants;

import lombok.Getter;

@Getter
public class FrameConstants 
{
	private FrameConstants() {}
	private static FrameConstants INSTANCE =null;
	public static synchronized FrameConstants getINSTANCE()
	{
		if(INSTANCE == null)
		{
			INSTANCE= new FrameConstants();
		}
		return INSTANCE;
	}
	
	private final String baseUserURI= "https://gorest.co.in/public/v2/users/";
	private final String BearerToken="4b7cad022863f046dd0cea7f760974887c4b164ed946555412886cc992763e9e";
	private final String wrieExcelPath="C:\\Users\\anam.kumar\\eclipse-workspace\\RestAssureMavenCLCD\\src\\main\\resources\\userData";

}

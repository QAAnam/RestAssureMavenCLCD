package builderClass;

import builderClass.UsersBody.UsersBodyBuilder;
import lombok.Getter;
import randData.RandData;

public class SerializedBodyUsers 
{
	private int id= RandData.getId();
	@Getter
	private String name=RandData.getFullName();
	@Getter
	private String email=RandData.getEmail();
	private String gender= RandData.getGender();
	private String status=RandData.getStatus();
	
	private static UsersBody BodytoPost;

	public static UsersBody getBodytoPost() {
		return UsersBody.builder()
				.id(RandData.getId())
				.name(RandData.getFullName())
				.email(RandData.getEmail())
				.gender(RandData.getGender())
				.status(RandData.getStatus()).build();
	}
	public static UsersBodyBuilder getBodytoUpdate() {
		return UsersBody.builder()
				.name(RandData.getFullName())
				.email(RandData.getEmail())
				.gender(RandData.getGender())
				.status(RandData.getStatus());
	}

}

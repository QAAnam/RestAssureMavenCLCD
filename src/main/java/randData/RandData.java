package randData;

import com.github.javafaker.Faker;

public class RandData
{
	public static int getId()
	{
		return Integer.parseInt(Faker.instance().number().digits(6));
	}
	public static String getFullName()
	{
		return Faker.instance().name().fullName();
	}
	public static String getEmail()
	{
		return Faker.instance().internet().emailAddress();
	}

	public static String getGender()
	{
		int a=Integer.parseInt(Faker.instance().number().digits(6));;
		int b=Integer.parseInt(Faker.instance().number().digits(6));;
		return a>b?"male":"female";
	}

	public static String getStatus()
	{
		int a=Integer.parseInt(Faker.instance().number().digits(6));;
		int b=Integer.parseInt(Faker.instance().number().digits(6));;
	
		return a>b?"active":"inactive";
	}


}

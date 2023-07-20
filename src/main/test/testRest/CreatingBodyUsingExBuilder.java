package testRest;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import baseLibrary.UtilityClassbase;

import static io.restassured.RestAssured.*;
import builderClass.Student;
import builderClass.Subject_marks;
import extentReports.ExtentLogger;
import io.restassured.response.Response;

public class CreatingBodyUsingExBuilder 
{
	@Test
	public void Print_builder()
	{
		Student s1 = Student.builder().id(new Faker().number().randomDigit()).age(123).name("123").build();
		System.out.println(s1);
		UtilityClassbase.PrintText("Print_builder");
		Response reponse = given().body(s1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/subjects");
		reponse.prettyPrint();
		ExtentLogger.logresponse(reponse.asPrettyString());
	}
	@Test
	public void Print_builder1()
	{
		List<String> names = new ArrayList<String>();
		names.add("123");
		names.add("123");
		List<Integer> other_marks = new ArrayList<Integer>();
		other_marks.add(123);
		other_marks.add(123);
		Subject_marks sub = Subject_marks.builder().Total_marks(123).hindi_marks(123).Math_marks(123).Science_marks(123).other_marks(other_marks).build();
		Student s1 = Student.builder().id(new Faker().number().randomDigit()).age(123).name("123").Names(names).subject_marks(sub).build();
		System.out.println(s1);
		UtilityClassbase.PrintText("Print_builder1");
		Response reponse = given().body(s1).header("Content-Type", "application/json; charset=utf-8").log().all().post("http://localhost:3000/subjects");
		reponse.prettyPrint();
		ExtentLogger.logresponse(reponse.asPrettyString());
	}


}
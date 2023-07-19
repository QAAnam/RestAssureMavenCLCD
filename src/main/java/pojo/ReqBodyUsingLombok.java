package pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ReqBodyUsingLombok
{
	

//	private int id=3333;
//	private String name="privateMr. Melvin Abshire";
//	private int age= 16;
//	private String city= "North Marielaboroughp";
//	private String email= "jay.harris @hotmail.comp";
//	private int phone=10381845;
//	private int subjectID=64;
//	private subject_marks subject_marks;
//	private List<String> Names;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	public subject_marks getSubject_marks() {
		return subject_marks;
	}
	public void setSubject_marks(subject_marks subject_marks) {
		this.subject_marks = subject_marks;
	}
	public List<String> getNames() {
		return Names;
	}
	public void setNames(List<String> names) {
		Names = names;
	}
	private String name;
	private int age= 16;
	private String city;
	private String email;
	private int phone;
	private int subjectID;
	private subject_marks subject_marks;
	private List<String> Names;
	public ReqBodyUsingLombok(int id, String name, int age, String city, String email, int phone, int subjectID,
			pojo.subject_marks subject_marks, List<String> names) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.email = email;
		this.phone = phone;
		this.subjectID = subjectID;
		this.subject_marks = subject_marks;
		Names = names;
	}


	
}


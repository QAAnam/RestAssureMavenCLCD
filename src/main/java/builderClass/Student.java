package builderClass;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pojo.subject_marks;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Student 
{
	private int id=2222;
	private String name="privateMr. Melvin Abshire";
	private int age= 16;
	private String city= "North Marielaboroughp";
	private String email= "jay.harris @hotmail.comp";
	private int phone=10381845;
	private int subjectID=64;
	private Subject_marks subject_marks;
	private List<String> Names;
}

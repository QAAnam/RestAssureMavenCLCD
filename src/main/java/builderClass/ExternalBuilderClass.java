package builderClass;

import java.util.List;

import lombok.Builder;
import lombok.Setter;
import pojo.subject_marks;

@Setter
@Builder
public class ExternalBuilderClass 
{
	private int id=2222;
	private String name="privateMr. Melvin Abshire";
	private int age= 16;
	private String city= "North Marielaboroughp";
	private String email= "jay.harris @hotmail.comp";
	private int phone=10381845;
	private int subjectID=64;
	private subject_marks subject_marks;
	private List<String> Names;
	
	

}

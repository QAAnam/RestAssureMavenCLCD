package pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DesirializedResponse 
{
	private int id=2222;
	private String name="privateMr. Melvin Abshire";
	private int age= 16;
	private String city= "North Marielaboroughp";
	private String email= "jay.harris @hotmail.comp";
	private long phone=10381845;
	private int subjectID=64;
	private Serializedubject_marks subject_marks;
	private List<String> Names;

}

package builderClass;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class Subject_marks 
{
	private int Total_marks=329;
	private int hindi_marks= 85;
	private int Science_marks= 75;
	private int Math_marks= 35;
	private List<Integer> other_marks;

}

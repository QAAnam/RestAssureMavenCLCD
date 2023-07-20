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
@Builder(setterPrefix = "set")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Serializedubject_marks
{
	private int Total_marks=329;
	private int hindi_marksprivate= 85;
	private int Science_marks= 75;
	private int Math_marks= 35;
	private List<Integer> other_marks;

}

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
public class DeserializeArrayresponse 
{
	private List<Object> DesirializedResponse ;
}

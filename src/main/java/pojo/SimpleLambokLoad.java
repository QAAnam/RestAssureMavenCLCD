package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonEncoding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@JsonInclude(value = Include.NON_NULL)
@JsonPropertyOrder(value ={"name","email"})
public class SimpleLambokLoad
{
	private int id=3333;
	private String name="privateMr. Melvin Abshire";
	private int age= 16;
	private String city= "North Marielaboroughp";
	private String email= "jay.harris @hotmail.comp";
	private int phone=10381845;
	
	public SimpleLambokLoad() {}


}

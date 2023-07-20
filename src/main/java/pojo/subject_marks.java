package pojo;

import java.util.List;

import javax.annotation.PropertyKey;

public class subject_marks 
{
	private int Total_marks=329;
	private int hindi_marksprivate= 85;
	private int Science_marks= 75;
	
	private int Math_marks= 35;
	private List<Integer> other_marks;
	
	public subject_marks(List<Integer> other_marks) {
		super();
		this.other_marks = other_marks;
	}
	public subject_marks(int total_marks, int hindi_marksprivate, int science_marks, int math_marks,
			List<Integer> other_marks) {
		super();
		Total_marks = total_marks;
		this.hindi_marksprivate = hindi_marksprivate;
		Science_marks = science_marks;
		Math_marks = math_marks;
		this.other_marks = other_marks;
	}
	public List<Integer> getOther_marks() {
		return other_marks;
	}
	public void setOther_marks(List<Integer> other_marks) {
		this.other_marks = other_marks;
	}
	
	public int getTotal_marks() {
		return Total_marks;
	}
	public void setTotal_marks(int total_marks) {
		Total_marks = total_marks;
	}
	public int getHindi_marksprivate() {
		return hindi_marksprivate;
	}
	public void setHindi_marksprivate(int hindi_marksprivate) {
		this.hindi_marksprivate = hindi_marksprivate;
	}
	public int getScience_marks() {
		return Science_marks;
	}
	public void setScience_marks(int science_marks) {
		Science_marks = science_marks;
	}
	public int getMath_marks() {
		return Math_marks;
	}
	public void setMath_marks(int math_marks) {
		Math_marks = math_marks;
	}
	


}

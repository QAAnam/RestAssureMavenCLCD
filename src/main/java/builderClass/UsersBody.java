package builderClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersBody {
	private int id=4040732;
	private String name="Pres. Lakshmi Chaturvedi";
	private String email="lakshmi_chaturvedi_pres@howell-leannon.test";
	private String gender="male";
	private String status="active";

}

package kodlamaio.hrms.entities.concretes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmplooyerDto {
	    private int id;
	    private String firstName;
	    private String lastName;
	    private String nationalityId;
	    private String email;
	    private String password;
	    private String verifyPassword;

}

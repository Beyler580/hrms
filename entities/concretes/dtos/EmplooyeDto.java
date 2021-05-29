package kodlamaio.hrms.entities.concretes.dtos;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmplooyeDto {
	    private int id ;
	    private String firstName;
	    private String lastName;
	    private int nationalityId;
	    private Date dateOfBirth;
	    private String email;
	    private String password;
	    private String verifyPassword;

}

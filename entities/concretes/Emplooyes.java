package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Emplooyes")
public class Emplooyes {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int user_Id;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "birth_of_year")
	private Date birth_of_year;
	@Column(name = "nationality_id")
	private int nationality_id;
	
	public Emplooyes() {};
	public Emplooyes(int user_Id, String first_name, String last_name, Date birth_of_year,
			int nationality_id) {
		super();
		this.user_Id = user_Id;
		this.first_name = first_name;
		this.last_name = last_name;
		
		this.birth_of_year = birth_of_year;
		this.nationality_id = nationality_id;
	}

}

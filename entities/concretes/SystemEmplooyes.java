package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "SystemEmplooyes")
public class SystemEmplooyes  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int user_id;
	@GeneratedValue
	@Column(name = "position_id")
	private int position_id;
	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;
	public SystemEmplooyes() {};
	public SystemEmplooyes(int user_id, int position_id, String first_name, String last_name) {
		super();
		this.user_id = user_id;
		this.position_id = position_id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	

}

package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name ="Emplooyers")
public class Emplooyers {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int user_id;
	@Column(name = "company_name")
	private String company_name;
	@Column(name = "phone_number")
	private String phone_number;

	@Column(name = "webpage_name")
	private String webpage_name;
	
	public Emplooyers() {};
	public Emplooyers(int user_id, String company_name, String phone_number, String webpage_name) {
		super();
		this.user_id = user_id;
		this.company_name = company_name;
		this.phone_number = phone_number;
		
		this.webpage_name = webpage_name;
	}


}

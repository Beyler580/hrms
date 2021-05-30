package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper=false) 
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name ="Emplooyers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdviserment"})
public class Emplooyers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int user_id;
	@Column(name = "company_name")
	private String company_name;
	@Column(name = "phone_number")
	private String phone_number;
	@Column(name = "webpage_name")
	private String webpage_name;
	@OneToMany(mappedBy = "emplooyers")
	private List<JobAdviserment> jobAdviserment;
	
	public Emplooyers() {};
	public Emplooyers(int user_id, String company_name, String phone_number, String webpage_name) {
		super();
		this.user_id = user_id;
		this.company_name = company_name;
		this.phone_number = phone_number;
		
		this.webpage_name = webpage_name;
	}


}

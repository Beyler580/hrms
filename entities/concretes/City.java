package kodlamaio.hrms.entities.concretes;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "city")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdviserment"})
@AllArgsConstructor
public class City {
	@Id
	@GeneratedValue
	@Column(name = "city_id")
	private int city_id;
	@Column(name = "city_name")
	private String city_name;
	@OneToMany(mappedBy = "city")
	private List<JobAdviserment> jobAdviserment;
	
	

}

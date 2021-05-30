package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EnableJpaRepositories
@Table(name = "job_adviserments")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdviserment"})
@EqualsAndHashCode(callSuper=false) 
public class JobAdviserment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adv_id")
	private int adv_id;
	@Column(name = "description")
	private String description;
	@Column(name = "openposition_count")
	private int openposition_count;
	@Column(name = "min_salary")
	private int min_salary;
	@Column(name = "max_salary")
	private int max_salary;
	@Column(name = "created_date")
	private LocalDate created_Date;
	@Column(name = "expression_date")
	private LocalDate expression_date;
	@Column(name = "is_active")
	private boolean is_active;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Emplooyers emplooyers;
	@ManyToOne
	@JoinColumn(name = "id")
	private Positions positions;
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

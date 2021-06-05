package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cv")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitaes"})
public class CurriculumVitae {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id")
	private int cvId;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;
	@ManyToOne
	@JoinColumn(name = "experience_id")
	private JobExperience jobExperience;
	@ManyToOne
	@JoinColumn(name = "coverletter_id")
	private CoverLetter coverLetter;
	@ManyToOne
	@JoinColumn(name = "tecnology_id")
	private Technologies technologies;
	@ManyToOne
	@JoinColumn(name = "socialmedia_id")
	private SocialMedia socialMedia;


	@OneToOne
	@JoinColumn(name = "emplooye_id")
	private Emplooyes emplooyes;
	

}

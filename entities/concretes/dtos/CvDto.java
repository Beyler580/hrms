package kodlamaio.hrms.entities.concretes.dtos;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@EnableJpaRepositories
public class CvDto {
	private String schoolName;
	//private String departmentName;
	private LocalDate schoolStartDate;
	private LocalDate schoolFinisDate;
	private String workplaceName;
	//private String positionName;
	private LocalDate jobexperiencestartDate;
	private LocalDate jobexperiencefinishDate;
	private String languageName;
	private int languageLevel;
	private String github;
	private String linkedIn;
	private String knowntechnologyName;
	private String coverletter;
	
	

}

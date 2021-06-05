package kodlamaio.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer> {
	@Query("From CurriculumVitae where emplooye_id =:id")
	CurriculumVitae findByEmplooyeId(int id );
	
	

}

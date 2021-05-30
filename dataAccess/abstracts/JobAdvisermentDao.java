package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import kodlamaio.hrms.entities.concretes.JobAdviserment;

public interface JobAdvisermentDao extends JpaRepository<JobAdviserment, Integer> {
	@Query("From JobAdviserment where is_active = true")
	List<JobAdviserment> getActivitated();
	@Query("From JobAdviserment where is_active = true and user_id =:id")
	List<JobAdviserment> getIsActiveByEmplooyers(int id );

}

package kodlamaio.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Emplooyes;

public interface EmplooyeDao extends JpaRepository<Emplooyes,Integer> {
	//DataResult<List<Emplooyes>> findBynationality_id(String i);
	
	

}

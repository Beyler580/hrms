package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Emplooyers;

public interface EmplooyersDao extends JpaRepository<Emplooyers,String> {

}

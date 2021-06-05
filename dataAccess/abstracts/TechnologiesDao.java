package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Technologies;

public interface TechnologiesDao extends JpaRepository<Technologies, Integer> {

}

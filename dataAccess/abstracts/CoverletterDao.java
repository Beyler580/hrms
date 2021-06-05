package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CoverLetter;

public interface CoverletterDao extends JpaRepository<CoverLetter, Integer> {

}

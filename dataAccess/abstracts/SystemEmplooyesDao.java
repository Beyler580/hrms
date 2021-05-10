package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemEmplooyes;

public interface SystemEmplooyesDao extends JpaRepository<SystemEmplooyes,Integer>  {

}

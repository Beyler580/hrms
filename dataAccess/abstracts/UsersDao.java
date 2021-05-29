package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.User;

public interface UsersDao extends JpaRepository<User,Integer> {
	User findByemail(String email);

}

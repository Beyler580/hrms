package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UsersDao;
import kodlamaio.hrms.entities.concretes.User;
import lombok.Data;
@Data
@Service
public class UserManager implements UserService {
	private UsersDao userDao;

	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}
    @Autowired
	public UserManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}

}

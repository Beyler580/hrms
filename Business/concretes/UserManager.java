package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.UsersDao;
import kodlamaio.hrms.entities.concretes.User;
import lombok.Data;
@Data
@Service
public class UserManager implements UserService {
	private UsersDao userDao;

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccesDataResult<List<User>>(this.userDao.findAll(),"Data listed succesfully");
	}
    @Autowired
	public UserManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccesResult("Data added.");
	}
	@Override
	public DataResult<User> getEmail(String email) {
		return new SuccesDataResult<User>(userDao.findByemail(email));
	}

}

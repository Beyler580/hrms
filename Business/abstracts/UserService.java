package kodlamaio.hrms.Business.abstracts;

import java.util.*;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
	DataResult<User> getEmail(String email);

}

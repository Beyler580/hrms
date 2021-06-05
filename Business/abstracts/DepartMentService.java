package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Department;


public interface DepartMentService {
	DataResult<List<Department>> getAll();
	Result add(Department department);

}

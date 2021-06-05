package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.DepartMentService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.DepartmentDao;
import kodlamaio.hrms.entities.concretes.Department;
import lombok.Data;
@Service
@Data
public class DepartmentManager implements DepartMentService {
	private DepartmentDao departmentDao;
    @Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	@Override
	public DataResult<List<Department>> getAll() {
		  return new SuccesDataResult<List<Department>>(departmentDao.findAll(), "Data listed succesfully");
	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccesResult("Data added succesfully");
		
	}

}

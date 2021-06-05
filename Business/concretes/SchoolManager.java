package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolDao;
import kodlamaio.hrms.entities.concretes.School;
import lombok.Data;


@Service
@Data
public class SchoolManager implements SchoolService {
	private SchoolDao schoolDao;
    @Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}
	@Override
	public DataResult<List<School>> getAll() {
		
		return new SuccesDataResult<List<School>>(this.schoolDao.findAll(),"Data listed succesfully");
	}
	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccesResult("Data added");
	}
	

}

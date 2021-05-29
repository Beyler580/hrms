package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.EmplooyeService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.EmplooyeDao;
import kodlamaio.hrms.entities.concretes.Emplooyes;
import lombok.Data;
@Data
@Service
public class EmplooyeManager implements EmplooyeService {
	 private EmplooyeDao emplooyeDao;
    @Autowired
	public EmplooyeManager(EmplooyeDao emplooyeDao) {
		super();
		this.emplooyeDao = emplooyeDao;
	}

	@Override
	public DataResult<List<Emplooyes>> getAll() {
		return new SuccesDataResult<List<Emplooyes>>(emplooyeDao.findAll(), "Data listed succesfully");
	}

	@Override
	public Result add(Emplooyes emplooyes) {
		this.emplooyeDao.save(emplooyes);
		return new SuccesResult("Data added.");
	}

}

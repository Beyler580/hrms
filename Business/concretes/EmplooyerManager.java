package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.EmplooyersSerive;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.EmplooyersDao;
import kodlamaio.hrms.entities.concretes.Emplooyers;
import lombok.Data;
@Service
@Data
public class EmplooyerManager implements EmplooyersSerive {
	private EmplooyersDao emplooyersDao;

	@Override
	public DataResult<List<Emplooyers>> getAll() {
		return new SuccesDataResult<List<Emplooyers>>(this.emplooyersDao.findAll(), "Data listed succesfully");
	}
    @Autowired
	public EmplooyerManager(EmplooyersDao emplooyersDao) {
		super();
		this.emplooyersDao = emplooyersDao;
	}
	@Override
	public Result add(Emplooyers emplooyers) {
		this.emplooyersDao.save(emplooyers);
		return new SuccesResult("Data added.");
	}

}

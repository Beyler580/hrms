package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.TechnologiesDao;
import kodlamaio.hrms.entities.concretes.Technologies;
import lombok.Data;

@Service
@Data
public class TechnologyManager implements TechnologyService {
	private TechnologiesDao technologiesDao;
	@Autowired
	public TechnologyManager(TechnologiesDao technologiesDao) {
		super();
		this.technologiesDao = technologiesDao;
	}
	@Override
	public DataResult<List<Technologies>> getAll() {
		return new SuccesDataResult<List<Technologies>>(this.technologiesDao.findAll(),"Data listed succesfully");
	}
	@Override
	public Result add(Technologies technologies) {
		this.technologiesDao.save(technologies);
		return new SuccesResult("Data added.");
	}

}

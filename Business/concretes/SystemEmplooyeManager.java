package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.SystemEmplooyeService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemEmplooyesDao;
import kodlamaio.hrms.entities.concretes.SystemEmplooyes;
import lombok.Data;
@Data
@Service
public class SystemEmplooyeManager implements SystemEmplooyeService {
	private SystemEmplooyesDao systemEmplooyesDao;

	@Override
	public DataResult<List<SystemEmplooyes>> getAll() {
		return new SuccesDataResult<List<SystemEmplooyes>>(this.systemEmplooyesDao.findAll(),"Data listed succesfully");
	}
    @Autowired
	public SystemEmplooyeManager(SystemEmplooyesDao systemEmplooyesDao) {
		super();
		this.systemEmplooyesDao = systemEmplooyesDao;
	}
	@Override
	public Result add(SystemEmplooyes systemEmplooyes) {
		this.systemEmplooyesDao.save(systemEmplooyes);
		return new SuccesResult("Data added.");
	}

}

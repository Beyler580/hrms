package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.SystemEmplooyes;

public interface SystemEmplooyeService {
	DataResult<List<SystemEmplooyes>> getAll();
	Result add(SystemEmplooyes systemEmplooyes);

}

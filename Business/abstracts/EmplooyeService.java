package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Emplooyes;

public interface EmplooyeService {
	DataResult<List<Emplooyes>> getAll();
	Result add(Emplooyes emplooyes);
	

}

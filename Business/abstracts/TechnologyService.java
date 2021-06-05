package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Technologies;

public interface TechnologyService {
	DataResult<List<Technologies>> getAll();
	Result add(Technologies technologies);

}

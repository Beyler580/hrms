package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Emplooyers;

public interface EmplooyersSerive {
	DataResult<List<Emplooyers>> getAll();
	Result add(Emplooyers emplooyers);

}

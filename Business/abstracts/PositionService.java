package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Positions;

public interface PositionService {
	DataResult<List<Positions>> getAll();
	Result addPositon(Positions positions);

}

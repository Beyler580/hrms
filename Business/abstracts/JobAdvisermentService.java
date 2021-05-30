package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.JobAdviserment;

public interface JobAdvisermentService {
	DataResult<List<JobAdviserment>> getAll();
	DataResult<List<JobAdviserment>> getActivitated();
	DataResult<List<JobAdviserment>> getIsActiveByEmplooyers(int id );
	public DataResult<JobAdviserment> getById(int id);

}

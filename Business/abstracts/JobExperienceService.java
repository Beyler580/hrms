package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;

import kodlamaio.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	DataResult<List<JobExperience>> getAll();
	Result add(JobExperience jobExperience);

}

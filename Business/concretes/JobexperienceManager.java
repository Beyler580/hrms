package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.JobExperience;
import lombok.Data;

@Service
@Data
public class JobexperienceManager implements JobExperienceService {
	private JobExperienceDao JobExperienceDao;
	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccesDataResult<List<JobExperience>>(this.JobExperienceDao.findAll(),"Data listed succesfully");
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.JobExperienceDao.save(jobExperience);
		return new SuccesResult("Data added.");
	}
    @Autowired
	public JobexperienceManager(kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao jobExperienceDao) {
		super();
		JobExperienceDao = jobExperienceDao;
	}

}

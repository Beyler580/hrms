package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.Business.abstracts.JobAdvisermentService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvisermentDao;
import kodlamaio.hrms.entities.concretes.JobAdviserment;
import lombok.Data;


@Data
@Service
public class JobAdvisermentManager implements JobAdvisermentService {
	private JobAdvisermentDao jobAdvisermentDao;
	
	@Autowired
	public JobAdvisermentManager(JobAdvisermentDao jobAdvisermentDao) {
		this.jobAdvisermentDao = jobAdvisermentDao;
	}
   
	public Result addJobAdviserment(JobAdviserment jobAdviserment) {
		if(checkAllField(jobAdviserment)) {
			this.jobAdvisermentDao.save(jobAdviserment);
			return new SuccesResult("Data added succesfully");
		}
		return  new ErrorResult("Data couldnt add succesfully");
	}

	public boolean checkAllField(JobAdviserment jobAdviserment) {
		if(jobAdviserment.getPositions() == null || jobAdviserment.getCity() == null || jobAdviserment.getDescription() == null || jobAdviserment.getOpenposition_count() == 0) {
			return false;
		}
		return true;
	
	}
	
	
	
	@Override
	public DataResult<List<JobAdviserment>> getAll() {
		return new SuccesDataResult<List<JobAdviserment>>(this.jobAdvisermentDao.findAll(),"Data listed succesfully");
	}

	@Override
	public DataResult<List<JobAdviserment>> getActivitated() {
		
		return new SuccesDataResult<List<JobAdviserment>>(this.jobAdvisermentDao.getActivitated(),"Data listed succesfully");
	}

	@Override
	public DataResult<List<JobAdviserment>> getIsActiveByEmplooyers(int id) {
		return new SuccesDataResult<List<JobAdviserment>>(this.jobAdvisermentDao.getIsActiveByEmplooyers(id),"Data listed");
	}
	public Result disableJobAdviserment(int id) {
		if(getById(id).getData().is_active() == false) {
			return new ErrorResult("This is already disabled");
		}
		JobAdviserment jobAdviserment = getById(id).getData();
		jobAdviserment.set_active(false);
		this.jobAdvisermentDao.save(jobAdviserment);
		return new SuccesResult("Job advert has been successfully disabled.");
	
	
		
	}
	public DataResult<JobAdviserment> getById(int id) {
		return new SuccesDataResult<JobAdviserment>(this.jobAdvisermentDao.getOne(id));
	}
	
	

}

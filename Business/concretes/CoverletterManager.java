package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.CoverletterService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.CoverletterDao;
import kodlamaio.hrms.entities.concretes.CoverLetter;
import lombok.Data;
@Service
@Data
public class CoverletterManager implements  CoverletterService{
	private CoverletterDao CoverletterDao;
    @Autowired
	public CoverletterManager(kodlamaio.hrms.dataAccess.abstracts.CoverletterDao coverletterDao) {
		super();
		CoverletterDao = coverletterDao;
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccesDataResult<List<CoverLetter>>(this.CoverletterDao.findAll(),"Data listed succesfully");
	
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.CoverletterDao.save(coverLetter);
		return new SuccesResult("Data added.");
	}

}

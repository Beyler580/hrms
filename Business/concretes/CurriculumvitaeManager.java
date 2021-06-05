package kodlamaio.hrms.Business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.CurriculumvitaeService;
import kodlamaio.hrms.core.services.abstracts.ImageUploadService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import lombok.Data;
@Data
@Service
public class CurriculumvitaeManager implements CurriculumvitaeService {
	private CurriculumVitaeDao curriculumVitaeDao;
	
	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		return new SuccesDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.findAll(),"Data listed succesfully.");
	}

	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccesResult("Data added.");
	}
    @Autowired
	public CurriculumvitaeManager(CurriculumVitaeDao curriculumVitaeDao,ImageUploadService ImageUploadService) {
		super();
		this.curriculumVitaeDao = curriculumVitaeDao;
	}

	@Override
	public DataResult<CurriculumVitae> findByEmplooyeId(int id) {
		return new SuccesDataResult<CurriculumVitae>(this.curriculumVitaeDao.findByEmplooyeId(id),"Data listed");
	}


	   


	

}

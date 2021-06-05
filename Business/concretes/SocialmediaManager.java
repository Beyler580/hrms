package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.SocialmediaService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialMediaDao;
import kodlamaio.hrms.entities.concretes.SocialMedia;
import lombok.Data;

@Service
@Data
public class SocialmediaManager implements SocialmediaService {
	private SocialMediaDao socialMediaDao;
	@Autowired
	public SocialmediaManager(SocialMediaDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}
	@Override
	public DataResult<List<SocialMedia>> getAll() {
		return new SuccesDataResult<List<SocialMedia>>(this.socialMediaDao.findAll(),"Data listed succesfully");
	}
	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccesResult("Data added.");
	}

}

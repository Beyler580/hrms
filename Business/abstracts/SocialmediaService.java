package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.SocialMedia;

public interface SocialmediaService {
	DataResult<List<SocialMedia>> getAll();
	Result add(SocialMedia socialMedia);

}

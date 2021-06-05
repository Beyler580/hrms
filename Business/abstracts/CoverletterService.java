package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CoverLetter;

public interface CoverletterService {
	DataResult<List<CoverLetter>> getAll();
	Result add(CoverLetter coverLetter);

}

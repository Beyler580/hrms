package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Language;

public interface LanguageService {
	DataResult<List<Language>> getAll();
	Result add(Language language);

}

package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDao;
import kodlamaio.hrms.entities.concretes.Language;
import lombok.Data;

@Service
@Data
public class LanguageManager implements LanguageService {
	private LanguageDao languageDao;
	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccesDataResult<List<Language>>(this.languageDao.findAll(),"Data listed succesfully");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccesResult("Data added.");
	}
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}
	

}

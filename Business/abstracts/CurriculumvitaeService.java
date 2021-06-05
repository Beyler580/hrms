package kodlamaio.hrms.Business.abstracts;

import java.io.IOException;
import java.util.List;

import javax.imageio.IIOException;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumvitaeService {
	DataResult<List<CurriculumVitae>> getAll();
	Result add(CurriculumVitae curriculumVitae);
	DataResult<CurriculumVitae> findByEmplooyeId(int id );
	

}

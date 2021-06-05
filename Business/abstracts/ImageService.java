package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Image;

public interface ImageService {
	Result add(Image image, MultipartFile file);
	Result add(Image image);
	DataResult<List<Image>> getAll();


}

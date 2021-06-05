package kodlamaio.hrms.core.services.abstracts;



import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.DataResult;
public interface ImageUploadService {

	DataResult<?> save(MultipartFile image);

}

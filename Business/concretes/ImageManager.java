package kodlamaio.hrms.Business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.Business.abstracts.ImageService;
import kodlamaio.hrms.core.services.abstracts.ImageUploadService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.ImageDao;
import kodlamaio.hrms.entities.concretes.Image;
import lombok.Data;

@Data
@Service
public class ImageManager implements ImageService {
	private ImageUploadService imageUploadService;
	private ImageDao imageDao;
	@Override
	public Result add(Image image, MultipartFile file) {
		 Map<String,String> result = (Map<String, String>) this.imageUploadService.save(file).getData();
		 String url = result.get("url");
		 image.setImageUrl(url);
		 
		return add(image);
		
	}
	@Autowired
	public ImageManager(ImageUploadService imageUploadService,ImageDao imageDao) {
		super();
		this.imageUploadService = imageUploadService;
		this.imageDao = imageDao;
	}
	@Override
	public Result add(Image image) {

			
			this.imageDao.save(image);
			
			return new SuccesResult("Data added succesfully");
		
	}
	@Override
	public DataResult<List<Image>> getAll() {
		
		return new SuccesDataResult<List<Image>>(this.imageDao.findAll(),"Data listed succesfully");
	}

}

package kodlamaio.hrms.core.services.concretes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.services.abstracts.ImageUploadService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.ErrorDataResult;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import lombok.Data;


@Service
@Data
public class CloudinaryImageUploadManager implements ImageUploadService {
	private Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
			"cloud_name", "dzqo6yb97",
			"api_key", "653111521421144",
			"api_secret", "QkGecOXBGukT3qcWIVsQmxfZz-A"));
	
//	@Autowired
//	public CloudinaryImageUploadManager(Cloudinary cloudinary) {
//		this.cloudinary = cloudinary;
//	}
	
	@Override
    public DataResult<Map> save(MultipartFile file) {
        try {
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(),ObjectUtils.emptyMap());
            ;
            return new SuccesDataResult<Map>(uploadResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ErrorDataResult<Map>("Something went wrong");
    }
	


	



	}




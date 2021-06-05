package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.Business.abstracts.ImageService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Emplooyes;
import kodlamaio.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImageController {
	private ImageService imageService;
	@Autowired	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	@GetMapping("/getAll")
	DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
	@PostMapping("/add")
	Result add(@RequestParam int emplooyeId,@RequestParam MultipartFile multipartFile) {
		Image image = new Image();
		Emplooyes emplooyes = new Emplooyes();
		emplooyes.setUser_Id(emplooyeId);
		image.setEmplooyes(emplooyes);
		return this.imageService.add(image, multipartFile);
	}

}

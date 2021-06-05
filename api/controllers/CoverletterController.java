package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.CoverletterService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CoverLetter;
import lombok.Data;
@Data
@RestController
@RequestMapping("/api/coverletter")
public class CoverletterController {
	private CoverletterService coverletterService;
	@Autowired
	public CoverletterController(CoverletterService coverletterService) {
		super();
		this.coverletterService = coverletterService;
	}
	@GetMapping("/getAll")
	DataResult<List<CoverLetter>> getAll(){
		return this.coverletterService.getAll();
	}
	@PostMapping("/add")
	Result add(@RequestBody CoverLetter coverLetter) {
		return this.coverletterService.add(coverLetter);
	}

}

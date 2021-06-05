package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.CurriculumvitaeService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import lombok.Data;

@Data
@RestController
@RequestMapping("/api/curriculumvitae")
public class CurriculumvitaeController {
	private CurriculumvitaeService curriculumvitaeService;
	@Autowired
	public CurriculumvitaeController(CurriculumvitaeService curriculumvitaeService) {
		super();
		this.curriculumvitaeService = curriculumvitaeService;
		
	}
	@GetMapping("/getAll")
	DataResult<List<CurriculumVitae>> getAll(){
		
		return this.curriculumvitaeService.getAll();
	}
	@PostMapping("/add")
	Result add(@RequestBody CurriculumVitae curriculumVitae) {
		return this.curriculumvitaeService.add(curriculumVitae);
	}
	@PostMapping("/findById")
	DataResult<CurriculumVitae> getById(@RequestParam int id ){
		
		return this.curriculumvitaeService.findByEmplooyeId(id);
	}


}

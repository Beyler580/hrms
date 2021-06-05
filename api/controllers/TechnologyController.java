package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.Business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Technologies;
import lombok.Data;

@Data
@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
	private TechnologyService technologyService;
    @Autowired
	public TechnologyController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
    @GetMapping("/getAll")
    DataResult<List<Technologies>> getAll(){
    	return this.technologyService.getAll();
    }
    @PostMapping("/add")
    Result add(@RequestBody Technologies technologies) {
    	return this.technologyService.add(technologies);
    }

}

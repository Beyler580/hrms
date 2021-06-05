package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.concretes.SchoolManager;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.School;
import lombok.Data;
@Data
@RestController
@RequestMapping("/api/school")
public class SchoolController {
	private SchoolManager schoolManager;
    @Autowired
	public SchoolController(SchoolManager schoolManager) {
		super();
		this.schoolManager = schoolManager;
	}
    @GetMapping("/getAll")
    DataResult<List<School>> getAll(){
    	return this.schoolManager.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody School school) {
    	return this.schoolManager.add(school);
    	
    }
	
	

}

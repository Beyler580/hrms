package kodlamaio.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.Business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;
import lombok.Data;

@Data
@RestController
@RequestMapping("/api/jobexperience")
public class JobexperienceController {
	private JobExperienceService jobExperienceService;
    @Autowired
	public JobexperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
    @GetMapping("/getAll")
    DataResult<List<JobExperience>> getAll(){
    	return this.jobExperienceService.getAll();
    }
    @PostMapping("/add")
    Result add(@RequestBody JobExperience jobExperience) {
    	return this.jobExperienceService.add(jobExperience);
    }

}

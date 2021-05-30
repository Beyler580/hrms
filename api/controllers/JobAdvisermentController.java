package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.concretes.JobAdvisermentManager;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobAdviserment;
import lombok.Data;
@Data
@RestController
@RequestMapping("/api/jobadviserments")
public class JobAdvisermentController {
	private JobAdvisermentManager jobAdvisermentManager;
	@Autowired
	public JobAdvisermentController(JobAdvisermentManager jobAdvisermentManager) {
		this.jobAdvisermentManager = jobAdvisermentManager;
	}
	@PostMapping("/disable")
	public Result disable(@RequestParam int id) {
		return this.jobAdvisermentManager.disableJobAdviserment(id);
		
	}
	@GetMapping("/getAll")
	public DataResult<List<JobAdviserment>> getAll(){
		return this.jobAdvisermentManager.getAll();
	}
	@PostMapping("/add")
	public Result addJobAdviserment(@RequestBody JobAdviserment jobAdviserment) {
		return this.jobAdvisermentManager.addJobAdviserment(jobAdviserment);

	}
	@GetMapping("/getActivitateds")
	public DataResult<List<JobAdviserment>> getActivitates(){
		return this.jobAdvisermentManager.getActivitated();
	}
	@GetMapping("/getByEmplooyerID")
	public DataResult<List<JobAdviserment>> getByEmplooyerID(@RequestParam int id){
		return this.jobAdvisermentManager.getIsActiveByEmplooyers(id);
	}
	

}

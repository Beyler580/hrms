package kodlamaio.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.EmplooyeService;
import kodlamaio.hrms.entities.concretes.Emplooyes;

@RestController
@RequestMapping("/api/emplooyes")
public class EmplooyeController {
	private EmplooyeService emplooyeService ;
	@Autowired
	public EmplooyeController(EmplooyeService emplooyeService) {
		super();
		this.emplooyeService = emplooyeService;
	} 
	@GetMapping("/getAll")
	public List<Emplooyes> getAll(){
		return this.emplooyeService.getAll();
	}

}

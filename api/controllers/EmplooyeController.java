package kodlamaio.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.AuthService;
import kodlamaio.hrms.Business.abstracts.EmplooyeService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Emplooyes;
import kodlamaio.hrms.entities.concretes.dtos.EmplooyeDto;

@RestController
@RequestMapping("/api/emplooyes")
public class EmplooyeController {
	private AuthService authService;
	private EmplooyeService emplooyeService ;
	@Autowired
	public EmplooyeController(EmplooyeService emplooyeService,AuthService authService) {
		super();
		this.emplooyeService = emplooyeService;
		this.authService = authService ;
	} 
	@GetMapping("/getAll")
	public DataResult<List<Emplooyes>> getAll(){
		return this.emplooyeService.getAll();
	}
	@PostMapping("/register")
	public Result add(@RequestBody EmplooyeDto emplooyeDto) {
		return authService.Registerasemplooye(emplooyeDto);
		
		
	}

}

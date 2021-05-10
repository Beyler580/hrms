package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.SystemEmplooyeService;
import kodlamaio.hrms.entities.concretes.SystemEmplooyes;

@RestController
@RequestMapping("/api/systememplooyes")
public class SystemEmplooyeController {
	private SystemEmplooyeService systemEmplooyeService ;
	
    @Autowired
	public SystemEmplooyeController(SystemEmplooyeService systemEmplooyeService) {
		super();
		this.systemEmplooyeService = systemEmplooyeService;
	} 
    @GetMapping("/getAll")
    public List<SystemEmplooyes> getAll(){
    	return this.systemEmplooyeService.getAll();
    }
    	
   
	
	

}

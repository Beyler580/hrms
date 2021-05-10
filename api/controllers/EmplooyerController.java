package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.EmplooyersSerive;
import kodlamaio.hrms.entities.concretes.Emplooyers;

@RestController
@RequestMapping("/api/emplooyers")
public class EmplooyerController {
	private EmplooyersSerive emplooyersSerive ;
	@Autowired
	public EmplooyerController(EmplooyersSerive emplooyersSerive) {
		super();
		this.emplooyersSerive = emplooyersSerive;
	} 
	@GetMapping("/getAll")
	public List<Emplooyers> getAll(){
		return emplooyersSerive.getAll();
		
	}
		
	
	
	

}

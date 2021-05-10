package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.PositionService;
import kodlamaio.hrms.entities.concretes.Positions;

@RestController
@RequestMapping("/api/positions")
public class PositionController {
	private PositionService positionService;
    @Autowired
	public PositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
    @GetMapping("/getAll")
    public List<Positions> getAll(){
    	return this.positionService.getAll();
    }

}

package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.concretes.CityManager;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.City;
import lombok.Data;
@RestController
@Data
@RequestMapping("/api/city")
public class CityController {
	private CityManager cityManager;
	
	@Autowired
	public CityController(CityManager cityManager) {
		this.cityManager = cityManager;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<City>> getAll(){
		return this.cityManager.getAll();
	}
//	@PostMapping("/add")
//	public Result add(@RequestBody City city) {
//		return this.cityManager.add(city);
//	}

}

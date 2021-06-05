package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.concretes.DepartmentManager;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Department;
import lombok.Data;
@Data
@RestController
@RequestMapping("/api/departmens")
public class DepartmentController {
	private DepartmentManager departmentManager;
    @Autowired
	public DepartmentController(DepartmentManager departmentManager) {
		super();
		this.departmentManager = departmentManager;
	}
    @GetMapping("/getAll")
    public DataResult<List<Department>> getAll() {
    	return departmentManager.getAll();
    }
    @PostMapping("/add")
	public Result add(@RequestBody Department department) {
    	return this.departmentManager.add(department);
    	
    	
    }
	

}

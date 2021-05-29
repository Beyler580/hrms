package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.Business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService ;
    @Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	} 
    @GetMapping("/getAll")
    public DataResult<List<User>> getAll(){
    	return this.userService.getAll();
    	
    }
    @PostMapping("/add")
    public Result add(@RequestBody User user) {
    	userService.add(user);
    	return new SuccesResult("Data added");
    	
    	
    	
    }
    	
   

	

}

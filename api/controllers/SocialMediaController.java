package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.SocialmediaService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.SocialMedia;
import lombok.Data;

@Data
@RestController
@RequestMapping("/api/socialmedia")
public class SocialMediaController {
	private SocialmediaService socialmediaService;
    @Autowired
	public SocialMediaController(SocialmediaService socialmediaService) {
		super();
		this.socialmediaService = socialmediaService;
	}
    @GetMapping("/getAll")
    DataResult<List<SocialMedia>> getAll(){
    	return this.socialmediaService.getAll();
    }
    @PostMapping("/add")
    Result add(@RequestBody SocialMedia socialMedia) {
    	return this.socialmediaService.add(socialMedia);
    }

}

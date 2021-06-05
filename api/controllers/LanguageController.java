package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.Business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Language;
import lombok.Data;

@Data
@RestController
@RequestMapping("/api/language")
public class LanguageController {
	private LanguageService languageService;
    @Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
    @GetMapping("/getAll")
    DataResult<List<Language>> getAll(){
    	return this.languageService.getAll();
    }
    @PostMapping("/add")
    Result add(@RequestBody Language language) {
    	return this.languageService.add(language);
    }
	

}

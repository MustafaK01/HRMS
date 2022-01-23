package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.IEmployerService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/users/employers")
public class EmployerController {
	
	IEmployerService employerService;
	@Autowired
	public EmployerController(IEmployerService employerService) {
		this.employerService=employerService;
	}
	
	@GetMapping("/getall")
	public ResultData<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);		
	}
	
}

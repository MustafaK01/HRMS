package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ICvService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.Cv;

@RestController
@RequestMapping("/api/cvs")
public class CvController {

	ICvService cvService;
	@Autowired
	private CvController(ICvService cvService) {
		this.cvService=cvService;
	}
	
	@GetMapping("/getall")
	public ResultData<List<Cv>> getAll(){
		return this.cvService.getAll();
	}
	@PostMapping("/add")
	public Result add(Cv cv){
		return this.cvService.add(cv);
	}
	@GetMapping("/SortedDescGraduationYear")
	public ResultData<List<Cv>> sortDescByGraduationYear(){
		return this.cvService.sortDescByGraduationYear();
	}
	@GetMapping("/SortedAscGraduationYear")
	public ResultData<List<Cv>> sortAscByGraduationYear(){
		return this.cvService.sortAscByGraduationYear();
	}
}

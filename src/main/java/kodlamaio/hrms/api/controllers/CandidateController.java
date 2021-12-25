package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ICandidateService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.Candidates;

@RestController
@RequestMapping("/api/users/candidates")
public class CandidateController {
	ICandidateService candidateService;
	
	@Autowired
	public CandidateController(ICandidateService candidateService) {
		this.candidateService = candidateService;
	}
	@GetMapping("/getall")
	public ResultData<List<Candidates>> getAll(){
		return candidateService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Candidates candidate) {
		return this.candidateService.add(candidate);		
	}
	
}

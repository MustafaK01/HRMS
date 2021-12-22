package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.IJobService;
import kodlamaio.hrms.entities.concretes.Jobs;


@RestController
@RequestMapping("/api/jobs")
public class JobPositionsController {
	
	
	private IJobService jobService;
	@Autowired
	public JobPositionsController(IJobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	List<Jobs> getAll(){
		return jobService.getAll();
	}
	
}

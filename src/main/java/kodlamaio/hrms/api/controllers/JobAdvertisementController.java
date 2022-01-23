package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.IJobAdvertisementsService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithCityDto;

@RestController
@RequestMapping("/api/jobs/jobAdvertisements")
public class JobAdvertisementController {
	
	IJobAdvertisementsService jobAdvertisementsService;
	@Autowired
	public JobAdvertisementController(IJobAdvertisementsService jobAdvertisementsService) {
		this.jobAdvertisementsService=jobAdvertisementsService;
	}
	@GetMapping("/getall")
	public ResultData<List<JobAdvertisement>> getall(){
		return this.jobAdvertisementsService.getAll();
	}
	@PostMapping("/addJobAdvertisement")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementsService.add(jobAdvertisement);
	}
	@GetMapping("/getByIsActiveTrue")
	public ResultData<List<JobAdvertisement>> getIsActiveTrue(){
		return this.jobAdvertisementsService.getByIsActiveTrue();
	}
	@GetMapping("/getJobAdvertisementById")
	public ResultData<List<JobAdvertisement>>getJobAdvertisementById(int id){
		return this.jobAdvertisementsService.getJobAdvertisementById(id);
	}
	@GetMapping("/getByCityId")
	public ResultData<List<JobAdvertisement>>getByCityId(int id){
		return this.jobAdvertisementsService.getByCityId(id);
	}
	@GetMapping("/getByCity_cityName")
	public ResultData<List<JobAdvertisement>>getByCityName(String cityName){
		return this.jobAdvertisementsService.getByCity_cityName(cityName);
	}
	@GetMapping("/getByJobPosition")
	public ResultData<List<JobAdvertisement>>getByJobPosition_jobTitle(String jobPosition){
		return this.jobAdvertisementsService.getByJobPosition_jobTitle(jobPosition);
	}
	@GetMapping("/getOpenPositions")
	public ResultData<List<JobAdvertisement>>getOpenPositionByJobPosition_jobTitle(String jobPosition){
		return this.jobAdvertisementsService.getOpenPositionByJobPosition_jobTitle(jobPosition);
	}
	@GetMapping("/getJobAdvertisementWithCity")
	public ResultData<List<JobAdvertisementWithCityDto>> getJobAdvertisementWithCity(String cityName) {
		return this.jobAdvertisementsService.getJobAdvertisementWithCity(cityName);
	}



	

	
	
}

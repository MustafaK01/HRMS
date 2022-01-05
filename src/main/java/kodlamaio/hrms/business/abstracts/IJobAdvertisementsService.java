package kodlamaio.hrms.business.abstracts;
import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface IJobAdvertisementsService {
	public ResultData<List<JobAdvertisement>> getAll();
	public Result add(JobAdvertisement jobAdvertisement);
	public ResultData<List<JobAdvertisement>> getByIsActiveTrue();
	public ResultData<List<JobAdvertisement>> getJobAdvertisementById(int id);
	public ResultData<List<JobAdvertisement>> getByCityId(int id);
	public ResultData<List<JobAdvertisement>> getByCity_cityName(String CityName);
	public ResultData<List<JobAdvertisement>> getByJobPosition_jobTitle(String jobPosition);
}

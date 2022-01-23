package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.IJobAdvertisementsService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.core.utils.results.ResultDataSuccess;
import kodlamaio.hrms.core.utils.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.IJobAdvertisementsDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithCityDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobAdvertisementsManager implements IJobAdvertisementsService{

	
	IJobAdvertisementsDao jobAdvertisementDao;
	@Autowired
	public JobAdvertisementsManager(IJobAdvertisementsDao jobAdvertisementDao) {
		this.jobAdvertisementDao=jobAdvertisementDao;
	}
	
	@Override
	public ResultData<List<JobAdvertisement>> getAll() {
		return new ResultDataSuccess<List<JobAdvertisement>>(jobAdvertisementDao.findAll(),"İş ilanları listelendi.");
	}
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Başarıyla Eklendi");
	}
	
	@Override
	public ResultData<List<JobAdvertisement>> getByIsActiveTrue(){
		return new ResultDataSuccess<List<JobAdvertisement>>(jobAdvertisementDao.getByIsActiveTrue(),"Aktif iş ilanları listelendi.");

	}

	@Override
	public ResultData<List<JobAdvertisement>> getJobAdvertisementById(int id) {
		return new ResultDataSuccess<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getJobAdvertisementById(id),"Veri Getirildi.");
	}

	@Override
	public ResultData<List<JobAdvertisement>> getByCityId(int id) {
		return new ResultDataSuccess<List<JobAdvertisement>>
		(jobAdvertisementDao.getByCityId(id),"Şehir idsine göre iş ilanları getirildi");
	}

	@Override
	public ResultData<List<JobAdvertisement>> getByCity_cityName(String CityName) {
		return new ResultDataSuccess<List<JobAdvertisement>>
		(jobAdvertisementDao.getByCity_cityName(CityName),"Şehir ismine göre iş ilanları Getirildi");
	}

	@Override
	public ResultData<List<JobAdvertisement>> getByJobPosition_jobTitle(String jobPosition) {
		return new ResultDataSuccess<List<JobAdvertisement>>(this.jobAdvertisementDao.getByJobPosition_jobTitle(jobPosition), "İş pozisyonlarına göre veri getirildi");
	}
	
	@Override
	public ResultData<List<JobAdvertisement>> getOpenPositionByJobPosition_jobTitle(String jobPosition) {
		return new ResultDataSuccess<List<JobAdvertisement>>(this.jobAdvertisementDao.getOpenPositionByJobPosition_jobTitle(jobPosition), "Açık Pozisyon Sayıları");
	}
	
	@Override
	public ResultData<List<JobAdvertisementWithCityDto>> getJobAdvertisementWithCity(String cityName) {
		return new ResultDataSuccess<List<JobAdvertisementWithCityDto>>(this.jobAdvertisementDao.getJobAdvertisementWithCity(cityName), "İş pozisyonlarına göre veri getirildi");
	}


}

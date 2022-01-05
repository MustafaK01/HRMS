package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface IJobAdvertisementsDao extends JpaRepository<JobAdvertisement, Integer> {
	
	List<JobAdvertisement> getByIsActiveTrue();
    List<JobAdvertisement>getJobAdvertisementById(int id);
    List<JobAdvertisement>getByCityId(int id);
    List<JobAdvertisement>getByCity_cityName(String CityName);
    List<JobAdvertisement>getByJobPosition_jobTitle(String jobPosition);

}

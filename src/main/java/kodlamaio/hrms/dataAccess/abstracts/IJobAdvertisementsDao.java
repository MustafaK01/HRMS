package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithCityDto;

public interface IJobAdvertisementsDao extends JpaRepository<JobAdvertisement, Integer> {
	
	List<JobAdvertisement>getByIsActiveTrue();
    List<JobAdvertisement>getJobAdvertisementById(int id);
    List<JobAdvertisement>getByCityId(int id);
    List<JobAdvertisement>getByCity_cityName(String CityName);
    List<JobAdvertisement>getByJobPosition_jobTitle(String jobPosition);
    List<JobAdvertisement>getOpenPositionByJobPosition_jobTitle(String jobPosition);
    
    @Query("SELECT new kodlamaio.hrms.entities.dtos.JobAdvertisementWithCityDto(ja.id, c.cityName,ja.jobDescription,ja.isActive)"
    		+ "FROM City c inner join c.JobAdvertisements ja "
    		+ "")
    List<JobAdvertisementWithCityDto>getJobAdvertisementWithCity(String cityName);

}

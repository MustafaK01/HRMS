package kodlamaio.hrms.entities.dtos;


public class JobAdvertisementWithCityDto{
	
	private int id;
    private String cityName;
    private String jobDescription;
    private boolean isActive;
    
	public JobAdvertisementWithCityDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobAdvertisementWithCityDto(int id, String cityName, String jobDescription,
			boolean isActive) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.jobDescription = jobDescription;
		this.isActive = isActive;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
    
}

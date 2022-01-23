package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="job_title_id")
	private Jobs jobPosition;

	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;

	@Column(name="open_positions")
	private int openPosition;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Temporal(TemporalType.DATE)
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	public JobAdvertisement() {	}

	public JobAdvertisement(int id, Employer employer, City city, Jobs jobPosition, String jobDescription,
			double minSalary, double maxSalary, int openPosition, boolean isActive, Date applicationDeadline,
			Date createDate) {
		super();
		this.id = id;
		this.employer = employer;
		this.city = city;
		this.jobPosition = jobPosition;
		this.jobDescription = jobDescription;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.openPosition = openPosition;
		this.isActive = isActive;
		this.applicationDeadline = applicationDeadline;
		this.createDate = createDate;
	}

	public int getAdvertisementId() {
		return id;
	}

	public Employer getEmployer() {
		return employer;
	}
	public City getCity() {
		return city;
	}

	public Jobs getJobPosition() {
		return jobPosition;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public int getOpenPosition() {
		return openPosition;
	}

	public boolean isActive() {
		return isActive;
	}

	public Date getApplicationDeadline() {
		return applicationDeadline;
	}

	public Date getCreateDate() {
		return createDate;
	}

	
}

package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="job_experience")
public class JobExperience {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name = "the_company_works_for")
	private String theCompanyWorksFor;
	
	@Column(name = "worked_position")
	private String workedPosition;
	
	@Column(name = "how_many_years_worked")
	private int howManyYearsWorked;
	
	@Column(name="job_start_date")
	private Date jobStartDate;
	
	@Column(name="is_working")
	private boolean isWorking;
	
	@Column(name="job_end_date")
	private Date jobEndDate;

	@ManyToOne
	@JoinColumn(name="cv_id")
	private Cv cv;
	
	public JobExperience() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobExperience(int id, String theCompanyWorksFor, String workedPosition,
			Date jobStartDate, boolean isWorking, Date jobEndDate) {
		super();
		this.id = id;
		this.theCompanyWorksFor = theCompanyWorksFor;
		this.workedPosition = workedPosition;
		this.jobStartDate = jobStartDate;
		this.isWorking = isWorking;
		this.jobEndDate = jobEndDate;
		this.howManyYearsWorked = this.getHowManyYearsWorked();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheCompanyWorksFor() {
		return theCompanyWorksFor;
	}

	public void setTheCompanyWorksFor(String theCompanyWorksFor) {
		this.theCompanyWorksFor = theCompanyWorksFor;
	}

	public String getWorkedPosition() {
		return workedPosition;
	}

	public void setWorkedPosition(String workedPosition) {
		this.workedPosition = workedPosition;
	}

	public int getHowManyYearsWorked() {
		return (jobEndDate.getYear() - jobStartDate.getYear());
	}

	public Date getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(Date jobStartDate) {
		this.jobStartDate = jobStartDate;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public Date getJobEndDate() {
		return jobEndDate;
	}

	public void setJobEndDate(Date jobEndDate) {
		this.jobEndDate = jobEndDate;
	}
}

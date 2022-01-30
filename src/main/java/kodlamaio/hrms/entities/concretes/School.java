package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="school")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="major_studied")
	private String majorStudied;
	
	@Column(name="start_date_to_education")
	private Date startDateToEducation;
	
	@Column(name="end_date_to_education")
	private Date endDateToEducation;
	
	@Column(name="is_graduate")
	private boolean isGraduate;

	@ManyToOne
	@JoinColumn(name="cv_id")
	private Cv cv;
	
	public School() {}
	
	public School(int id, String schoolName, String majorStudied, Date startDateToEducation, Date endDateToEducation,
			boolean isGraduate) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.majorStudied = majorStudied;
		this.startDateToEducation = startDateToEducation;
		this.endDateToEducation = endDateToEducation;
		this.isGraduate = isGraduate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getMajorStudied() {
		return majorStudied;
	}


	public void setMajorStudied(String majorStudied) {
		this.majorStudied = majorStudied;
	}


	public Date getStartDateToEducation() {
		return startDateToEducation;
	}


	public void setStartDateToEducation(Date startDateToEducation) {
		this.startDateToEducation = startDateToEducation;
	}


	public Date getEndDateToEducation() {
		return endDateToEducation;
	}


	public void setEndDateToEducation(Date endDateToEducation) {
		this.endDateToEducation = endDateToEducation;
	}


	public boolean isGraduate() {
		return isGraduate;
	}


	public void setGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}	
	
	
}

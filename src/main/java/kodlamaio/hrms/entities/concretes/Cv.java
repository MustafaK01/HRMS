package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="cvs")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","school","jobExperience","foreignLanguage","socialAddresses","technicalSkills"})
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int id;
	
	@Column(name="summary")
	private String summary;

	@OneToMany(mappedBy = "cv")
	private List<ForeignLanguage> foreignLanguage;
	
	@OneToMany(mappedBy="cv")
	private List<TechnicalSkills> technicalSkills;
	
	@OneToMany(mappedBy = "cv")
	private List<JobExperience> jobExperience;
	
	@OneToMany(mappedBy = "cv")
	private List<School> school;
	
	@OneToMany(mappedBy = "cv")
	private List<SocialAddresses> socialAddresses;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidates candidates;
	
	public Cv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cv(int id, String summary, List<ForeignLanguage> foreignLanguage, List<TechnicalSkills> technicalSkills,
			List<JobExperience> jobExperience, List<School> school, List<SocialAddresses> socialAddresses,
			Candidates candidates) {
		super();
		this.id = id;
		this.summary = summary;
		this.foreignLanguage = foreignLanguage;
		this.technicalSkills = technicalSkills;
		this.jobExperience = jobExperience;
		this.school = school;
		this.socialAddresses = socialAddresses;
		this.candidates = candidates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<ForeignLanguage> getForeignLanguage() {
		return foreignLanguage;
	}

	public void setForeignLanguage(List<ForeignLanguage> foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}

	public List<TechnicalSkills> getTechnicalSkills() {
		return technicalSkills;
	}

	public void setTechnicalSkills(List<TechnicalSkills> technicalSkills) {
		this.technicalSkills = technicalSkills;
	}

	public List<JobExperience> getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(List<JobExperience> jobExperience) {
		this.jobExperience = jobExperience;
	}

	public List<School> getSchool() {
		return school;
	}

	public void setSchool(List<School> school) {
		this.school = school;
	}

	public List<SocialAddresses> getSocialAddresses() {
		return socialAddresses;
	}

	public void setSocialAddresses(List<SocialAddresses> socialAddresses) {
		this.socialAddresses = socialAddresses;
	}

	public Candidates getCandidates() {
		return candidates;
	}

	public void setCandidates(Candidates candidates) {
		this.candidates = candidates;
	}
}

package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="cvs")
public class Cv {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="graduation_year")
	private int graduationYear;
	
	@ManyToOne
	@JoinColumn(name="job_experience_id")
	private JobExperience jobExperience;
	
	@ManyToOne
	@JoinColumn(name="foreign_language_id")
	private ForeignLanguage foreignLanguages;
	
	@ManyToOne
	@JoinColumn(name="programming_language_id")
	private ProgrammingLanguages programmingLanguages;
	
	@Column(name="github_account")
	private String githubAccount;
	
	@Column(name="linkedin_account")
	private String linkedinAccount;

	public Cv() { }

	public Cv(int id, int graduationYear, JobExperience jobExperience, ForeignLanguage foreignLanguages,
			ProgrammingLanguages programmingLanguages, String githubAccount, String linkedinAccount) {
		super();
		this.id = id;
		this.graduationYear = graduationYear;
		this.jobExperience = jobExperience;
		this.foreignLanguages = foreignLanguages;
		this.programmingLanguages = programmingLanguages;
		this.githubAccount = githubAccount;
		this.linkedinAccount = linkedinAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public JobExperience getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(JobExperience jobExperience) {
		this.jobExperience = jobExperience;
	}

	public ForeignLanguage getForeignLanguages() {
		return foreignLanguages;
	}

	public void setForeignLanguages(ForeignLanguage foreignLanguages) {
		this.foreignLanguages = foreignLanguages;
	}

	public ProgrammingLanguages getProgrammingLanguages() {
		return programmingLanguages;
	}

	public void setProgrammingLanguages(ProgrammingLanguages programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}

	public String getGithubAccount() {
		return githubAccount;
	}

	public void setGithubAccount(String githubAccount) {
		this.githubAccount = githubAccount;
	}

	public String getLinkedinAccount() {
		return linkedinAccount;
	}

	public void setLinkedinAccount(String linkedinAccount) {
		this.linkedinAccount = linkedinAccount;
	}
	
}

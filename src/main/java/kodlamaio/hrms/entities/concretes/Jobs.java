package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_titles")
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title", unique = true)
	private String jobTitle;

	public Jobs() {
		super();

	}

	public Jobs(int id, String jobTitle) {
		this.id = id;
		this.jobTitle = jobTitle;
	}

	public int getId() {
		return id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	
}

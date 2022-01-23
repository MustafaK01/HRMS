package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="job_experience")
public class JobExperience {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;	
	
	@Column(name="how_many_years_worked")
	private int howManyYearsWorked;
	
	@Column(name="position")
	private String position;
	
	@Column(name="is_continues")
	private boolean isContinues;

	@OneToMany(mappedBy = "jobExperience")
	private List<Cv> cv;

	public JobExperience() { }

	public JobExperience(int id, int howManyYearsWorked, String position, boolean isContinues, List<Cv> cv) {
		super();
		this.id = id;
		this.howManyYearsWorked = howManyYearsWorked;
		this.position = position;
		this.isContinues = isContinues;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHowManyYearsWorked() {
		return howManyYearsWorked;
	}

	public void setHowManyYearsWorked(int howManyYearsWorked) {
		this.howManyYearsWorked = howManyYearsWorked;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isContinues() {
		return isContinues;
	}

	public void setContinues(boolean isContinues) {
		this.isContinues = isContinues;
	}

	public List<Cv> getCv() {
		return cv;
	}

	public void setCv(List<Cv> cv) {
		this.cv = cv;
	}
}

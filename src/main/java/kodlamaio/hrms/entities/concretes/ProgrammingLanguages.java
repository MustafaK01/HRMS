package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="programming_languages")
public class ProgrammingLanguages {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="programming_languages")
	private String programmingLanguages;
	
	@OneToMany(mappedBy = "programmingLanguages")
	private List<Cv> cv;

	public ProgrammingLanguages() { }

	public ProgrammingLanguages(int id, String programmingLanguages, List<Cv> cv) {
		super();
		this.id = id;
		this.programmingLanguages = programmingLanguages;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgrammingLanguages() {
		return programmingLanguages;
	}

	public void setProgrammingLanguages(String programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}

	public List<Cv> getCv() {
		return cv;
	}

	public void setCv(List<Cv> cv) {
		this.cv = cv;
	}
}

package kodlamaio.hrms.entities.concretes;


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
@Table(name="technical_skills")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class TechnicalSkills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="programming_language")
	private String programmingLanguage;
	
	@Column(name="tools")
	private String tools;

	@Column(name="operating_systems")
	private String operatingSystems;
	
	@Column(name="frameworks")
	private String frameworks;
	
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private Cv cv;

	public TechnicalSkills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnicalSkills(int id, String programmingLanguage, String tools, String operatingSystems, String frameworks,
			Cv cv) {
		super();
		this.id = id;
		this.programmingLanguage = programmingLanguage;
		this.tools = tools;
		this.operatingSystems = operatingSystems;
		this.frameworks = frameworks;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(String frameworks) {
		this.frameworks = frameworks;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}
	
	
}

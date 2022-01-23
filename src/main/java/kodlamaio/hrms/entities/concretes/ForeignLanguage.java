package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="foreign_language")
public class ForeignLanguage {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="known_languages")
	private String knownLanguages;
	
	@Column(name="degree")
	private String degree;
	
	@OneToMany(mappedBy = "foreignLanguages")
	private List<Cv> cv;

	public ForeignLanguage() { }

	public ForeignLanguage(int id, String knownLanguages, String degree, List<Cv> cv) {
		super();
		this.id = id;
		this.knownLanguages = knownLanguages;
		this.degree = degree;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(String knownLanguages) {
		this.knownLanguages = knownLanguages;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public List<Cv> getCv() {
		return cv;
	}

	public void setCv(List<Cv> cv) {
		this.cv = cv;
	}
}

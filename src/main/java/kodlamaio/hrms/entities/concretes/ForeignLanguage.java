package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="foreign_language")
public class ForeignLanguage {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="foreign_lang")
	private String foreignLanguage;
	
	@Column(name="language_level")
	private String languageLevel;
	
	@ManyToOne
	@JoinColumn(name="cv_id")
	private Cv cv;
	
	public ForeignLanguage() {	}

	public ForeignLanguage(int id, String foreignLanguage, String languageLevel) {
		super();
		this.id = id;
		this.foreignLanguage = foreignLanguage;
		this.languageLevel = languageLevel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getForeignLang() {
		return foreignLanguage;
	}

	public void setForeignLang(String foreignLang) {
		this.foreignLanguage = foreignLang;
	}

	public String getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
	}

	
}

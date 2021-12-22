package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employer")
public class Employer extends User {
	
	@Id
	@GeneratedValue
	@Column(name="employer_id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="web_address")
	private String webSiteName;

	public Employer() {
		super();
	}

	public Employer(int id, String companyName, String phoneNumber, String webSiteName) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.webSiteName = webSiteName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWebSiteName() {
		return webSiteName;
	}

	public void setWebSiteName(String webSiteName) {
		this.webSiteName = webSiteName;
	}
	
}

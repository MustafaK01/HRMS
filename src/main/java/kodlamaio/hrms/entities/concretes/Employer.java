package kodlamaio.hrms.entities.concretes;

import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="employer")
@PrimaryKeyJoinColumn(name="user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobAdvertisements","email","password"})
public class Employer extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	@JsonIgnore
	private String companyName;
	
	@Column(name="phone_number")
	@JsonIgnore
	private String phoneNumber;
	
	@Column(name="web_address")
	@JsonIgnore
	private String webAddress;
	
	@OneToMany(mappedBy="employer")
	private List<JobAdvertisement> jobAdvertisements;
	
	public Employer() {
		super();
	}

	public Employer(int id, String companyName, String phoneNumber, String webAddress) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.webAddress = webAddress;
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

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webSiteName) {
		this.webAddress = webSiteName;
	}
	
}

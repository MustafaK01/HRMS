package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="social_addresses")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class SocialAddresses {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;	
	
	
	@Column(name="github_address")
	private String githubAddress;
	
	@Column(name="linkedin_address")
	private String linkedinAddress;
	
	@Column(name="medium_address")
	private String mediumAddress;
	
	@Column(name="reddit_address")
	private String redditAddress;
	
	@Column(name="twitter_address")
	private String twitterAddress;
	
	@Column(name="instagram_address")
	private String instagramAddress;
	
	@ManyToOne
	@JoinColumn(name="cv_id")
	private Cv cv;

	public SocialAddresses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SocialAddresses(int id, String githubAddress, String linkedinAddress, String mediumAddress,
			String redditAddress, String twitterAddress, String instagramAddress) {
		super();
		this.id = id;
		this.githubAddress = githubAddress;
		this.linkedinAddress = linkedinAddress;
		this.mediumAddress = mediumAddress;
		this.redditAddress = redditAddress;
		this.twitterAddress = twitterAddress;
		this.instagramAddress = instagramAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGithubAddress() {
		return githubAddress;
	}

	public void setGithubAddress(String githubAddress) {
		this.githubAddress = githubAddress;
	}

	public String getLinkedinAddress() {
		return linkedinAddress;
	}

	public void setLinkedinAddress(String linkedinAddress) {
		this.linkedinAddress = linkedinAddress;
	}

	public String getMediumAddress() {
		return mediumAddress;
	}

	public void setMediumAddress(String mediumAddress) {
		this.mediumAddress = mediumAddress;
	}

	public String getRedditAddress() {
		return redditAddress;
	}

	public void setRedditAddress(String redditAddress) {
		this.redditAddress = redditAddress;
	}

	public String getTwitterAddress() {
		return twitterAddress;
	}

	public void setTwitterAddress(String twitterAddress) {
		this.twitterAddress = twitterAddress;
	}

	public String getInstagramAddress() {
		return instagramAddress;
	}

	public void setInstagramAddress(String instagramAddress) {
		this.instagramAddress = instagramAddress;
	}
	
	
}

package com.capgemini.jpaOneToOneMapping.profile;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.capgemini.jpaOneToOneMapping.employee.Employee;

@Entity
public class Profile {
	
	@Id
	private int profileId;
	private String profileName;
	
	@OneToOne(mappedBy = "profile")
	private Employee employee;

	public Profile() {
		super();
		
		
	}

	public Profile(int profileId, String profileName) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", profileName=" + profileName + "]";
	}

	

	
	

}

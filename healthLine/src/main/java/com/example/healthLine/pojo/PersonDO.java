package com.example.healthLine.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="person")
public class PersonDO {
	
	
	 @javax.persistence.Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
     private Long Id;	
	
	 @Column(name = "NAME")
	 private String personName;
	
	 @Column(name = "ACTIVE")
	 private String Active;
	 
	 @Column(name = "PHONE")
	 private String phoneNO;
	 
	 @Column(name = "EMAIL")
	 private String email;
	 
	// @OneToMany(mappedBy="persons",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
	 @OneToMany(mappedBy = "persons")
	 private List<OrganizationDO> organizations = new ArrayList<OrganizationDO>();

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getActive() {
		return Active;
	}

	public void setActive(String active) {
		Active = active;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<OrganizationDO> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(List<OrganizationDO> organizations) {
		this.organizations = organizations;
	}
	 
	 
	 
	 
	

}

package com.example.healthLine.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="organization")
public class OrganizationDO {
	
	 @javax.persistence.Id 
	 @GeneratedValue(strategy = GenerationType.AUTO)
     private Long Id;	
	
	 @Column(name = "ADRS")
	 private String address;
	 
	 @Column(name = "ACTIVE")
	 private String Active;
	 
	 @Column(name = "OrgPhone")
	 private String orgPhone;
	 
	 @Column(name = "orgEmail")
	 private String orgEmail;
	 
	 
    // @ManyToOne(fetch = FetchType.LAZY, targetEntity = PersonDO.class)
	 //@JoinColumn(name="personId", referencedColumnName = "personId", nullable = false)
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "PERSON_ID")
	 private PersonDO persons;


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getActive() {
		return Active;
	}


	public void setActive(String active) {
		Active = active;
	}


	public String getOrgPhone() {
		return orgPhone;
	}


	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}


	public String getOrgEmail() {
		return orgEmail;
	}


	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}


	public PersonDO getPersons() {
		return persons;
	}


	public void setPersons(PersonDO persons) {
		this.persons = persons;
	}
	 
	 
	 
	 
	 
	
	

}

package com.databasedemoapplication.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;




@Entity

public class AniruddhaPerson {

    	@Id
    	@GeneratedValue
	private int id;
	private String name;
	private String location;
	private Date birth_date;
	
	public AniruddhaPerson() {
		
	}
	public AniruddhaPerson(int id, String name, String location, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birthdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	@Override
	public String toString() {
		return String.format(
				"Person [id=%s, name=%s, location=%s, Birthdate=%s, getId()=%s, getName()=%s, getLocation()=%s, getBirthdate()=%s, getClass()=%s, hashCode()=%s, toString()=%s]",
				id, name, location, birth_date, getId(), getName(), getLocation(), getBirth_date(), getClass(),
				hashCode(), super.toString());
	}
	
	
	
	
	
}

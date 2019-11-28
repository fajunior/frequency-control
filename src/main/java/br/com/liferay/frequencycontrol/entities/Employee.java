package br.com.liferay.frequencycontrol.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * Class to represent an Employee with their data
 * 
 * @author Francisco Athayde Júnior
 * 
 */

@Entity
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(unique = true, nullable = false)
	private String pisNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPisNumber() {
		return pisNumber;
	}

	public void setPisNumber(String pisNumber) {
		this.pisNumber = pisNumber;
	}

}

package com.trainingInstitute;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jspider
{
	@Id
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany
	private List<Branches> branches;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Branches> getBranches() {
		return branches;
	}
	public void setBranches(List<Branches> branches) {
		this.branches = branches;
	}
}

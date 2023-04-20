package com.trainingInstitute;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branches
{
	@Id
	private int id;
	private String Branchname;
	private int pincode;
	@OneToMany
	private  List<Trainers> trainers;
	@OneToMany
	private List<Admission> adm;
	@OneToMany
	private List<Courses> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchname() {
		return Branchname;
	}
	public void setBranchname(String branchname) {
		Branchname = branchname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public List<Trainers> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainers> trainers) {
		this.trainers = trainers;
	}
	public List<Admission> getAdm() {
		return adm;
	}
	public void setAdm(List<Admission> adm) {
		this.adm = adm;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

}

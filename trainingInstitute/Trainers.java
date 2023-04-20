package com.trainingInstitute;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainers 
{
	@Id
	private int id;
	private String Tname;
	private String subj;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getSubj() {
		return subj;
	}
	public void setSubj(String subj) {
		this.subj = subj;
	}

}

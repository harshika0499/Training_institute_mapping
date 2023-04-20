package com.trainingInstitute;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TI 
{
	@Id
	private int id;
	private String TI_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTI_name() {
		return TI_name;
	}
	public void setTI_name(String tI_name) {
		TI_name = tI_name;
	}
}

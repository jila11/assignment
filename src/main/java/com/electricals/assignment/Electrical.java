package com.electricals.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Electrical {
	@Id
	private String id;
	private String electricalName;
	private String electricalCost;
	
	public Electrical() {
		super();
	}
	
	public Electrical(String id, String electricalName, String electricalCost) {
		super();
		this.id = id;
		this.electricalName = electricalName;
		this.electricalCost = electricalCost;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getElectricalName() {
		return electricalName;
	}
	public void setElectricalName(String electricalName) {
		this.electricalName = electricalName;
	}
	public String getElectricalCost() {
		return electricalCost;
	}
	public void setElectricalCost(String electricalCost) {
		this.electricalCost = electricalCost;
	}

}

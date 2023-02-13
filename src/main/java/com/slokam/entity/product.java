package com.slokam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class product {
	@Id
	@GeneratedValue
	private int pid;
	@NotBlank
	@Length(min=3,max=5)
	private String pname;
	private String pcolor;
	@NotNull
	@Min(50)
	@Max(100)
	private double pcost;
	@Pattern(regexp ="^[A-Z]{5}[1-9]{4}[A-Z]$")
	private String pan;
	
	@Override
	public String toString() {
return "pid=" + pid + ", pname=" + pname + ", pcolor=" + pcolor + ", pcost=" + pcost + ", pan=" + pan;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcolor() {
		return pcolor;
	}
	public void setPcolor(String pcolor) {
		this.pcolor = pcolor;
	}
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	
	

}

package com.mongo;

import com.mongodb.BasicDBObject;

public class Employee extends BasicDBObject{
	
	private int empid;
	private String empname;
	private int empsal;
	
	
	public Employee(){
		
	}
	public Employee(int empid, String empname, int empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.put("empid", empid);
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.put("empname", empname);
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.put("empsal",empsal);
		this.empsal = empsal;
	}
	
	
	

}

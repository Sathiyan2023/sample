package org.encapsulation;

public class EmployeeDetails {
	
	private int idGlobal;
	
	private String name;
	
	private float salary;
	
	public void setId(int idLocal){	
		this.idGlobal = idLocal;	
	}
	
	public int getId(){
		return idGlobal;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public float getSalary(){
		return salary;
	}
	
	public void setSalary(float salary){
		this.salary = salary;
	}
}

package com.tka.client2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_id;
	private String dept_name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "did")
	private List<Employee> allemp;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int dept_id, String dept_name, List<Employee> allemp) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.allemp = allemp;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public List<Employee> getAllemp() {
		return allemp;
	}

	public void setAllemp(List<Employee> allemp) {
		this.allemp = allemp;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}

}

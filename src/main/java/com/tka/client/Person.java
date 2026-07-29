package com.tka.client;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pname;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_id")
	private Passport passport;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String pname, Passport passport) {
		super();
		this.id = id;
		this.pname = pname;
		this.passport = passport;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + "]";
	}

}

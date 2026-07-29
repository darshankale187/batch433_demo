package com.tka.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String passport_no;

	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public Passport(int id, String passport_no) {
		super();
		this.id = id;
		this.passport_no = passport_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passport_no=" + passport_no + "]";
	}

}

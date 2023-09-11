package com.leafco.bookbus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int a_id;
	
	@Column(name="adname")
	private String adname;
	
	@Column(name="adpass")
	private String adpass;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact")
	private int contact;

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Admin() {
		
	}
	
	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getAdname() {
		return adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public String getAdpass() {
		return adpass;
	}

	public void setAdpass(String adpass) {
		this.adpass = adpass;
	}

	@Override
	public String toString() {
		return "Admin [a_id=" + a_id + ", adname=" + adname + ", adpass=" + adpass + "]"+ email + "]"+ contact + "]";
	}

	public Admin(String adname, String adpass, String email, int contact) {
		
		this.adname = adname;
		this.adpass = adpass;
		this.email = email;
		this.contact = contact;
	}
	
	
}

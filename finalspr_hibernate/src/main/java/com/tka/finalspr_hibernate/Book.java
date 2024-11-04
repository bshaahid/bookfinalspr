package com.tka.finalspr_hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bkid;
	String bknm;
	int bkcost;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bkid, String bknm, int bkcost) {
		super();
		this.bkid = bkid;
		this.bknm = bknm;
		this.bkcost = bkcost;
	}
	public int getBkid() {
		return bkid;
	}
	public void setBkid(int bkid) {
		this.bkid = bkid;
	}
	public String getBknm() {
		return bknm;
	}
	public void setBknm(String bknm) {
		this.bknm = bknm;
	}
	public int getBkcost() {
		return bkcost;
	}
	public void setBkcost(int bkcost) {
		this.bkcost = bkcost;
	}
	@Override
	public String toString() {
		return "Book [bkid=" + bkid + ", bknm=" + bknm + ", bkcost=" + bkcost + "]";
	}
	
	

}

package com.hibernate;

import java.util.List;

/*
 * create a class Student---sid,sname,List<Book> blist,Address address

    create 2 beans of Student in xml file and each student has at least 2 books.
   (use constructor or setter injection)
 */

public class Student {
	private int sid;
	private String sname;
	private List<Book> blist;
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor using fields
	public Student(int sid, String sname, List<Book> blist, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.blist = blist;
		this.address = address;
	}
	// generate getter setter method
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Book> getBlist() {
		return blist;
	}

	public void setBlist(List<Book> blist) {
		this.blist = blist;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	//to String method
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", blist=" + blist + ", address=" + address + "]";
	}

}
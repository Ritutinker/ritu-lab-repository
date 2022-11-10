package com.hibernate;
/*
 * 2.Create a class Address---hno,area,city
   create 2 beans of Address in xml file.(use constructor or setter injection)

 */
public class Address {

	private String hno;
	private  String area;
	private String  city;
	
	
	//create fields for constructor
	public Address(String hno, String area, String city) {
		super();
		this.hno = hno;
		this.area = area;
		this.city = city;
	}

//constructer for super class
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getter setter method
	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	//generate toString
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", area=" + area + ", city=" + city + "]";
	}
	
	
	
}

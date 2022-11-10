package com.hibernate;
/* 1.Create a class Book---bid,bname,price
  create 4 beans of Book in xml file.(use constructor or setter injection)

 */
public class Book {
	
private int bid;
private String bname;
private int price;


//creating costructor using fields
public Book(int bid, String bname, int price) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.price = price;
}

//create superclass constructor
public Book() {
	super();
	// TODO Auto-generated constructor stub
}


//create getter setter method
public int getBid() {
	return bid;
}

public void setBid(int bid) {
	this.bid = bid;
}

public String getBname() {
	return bname;
}

public void setBname(String bname) {
	this.bname = bname;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

// generate to String


@Override
public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
}




}

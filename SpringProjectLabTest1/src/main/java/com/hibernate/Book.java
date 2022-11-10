package com.hibernate;
/* 1.Create a class Book---bid,bname,price
  create 4 beans of Book in xml file.(use constructor or setter injection)

 */
public class Book {
	
	
		//class properties
		private int bid;
		private String bname;
		private double bprice;

		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		// constructor to fields
		public Book(int bid, String bname, double bprice) {
			super();
			this.bid = bid;
			this.bname = bname;
			this.bprice = bprice;
		}
		// generate getter setter method
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

		public double getBprice() {
			return bprice;
		}

		public void setBprice(double bprice) {
			this.bprice = bprice;
		}
		//generate  ToString method
		@Override
		public String toString() {
			return "Book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
		}

	}
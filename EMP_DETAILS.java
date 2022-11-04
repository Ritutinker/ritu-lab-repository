/*EMP_DETAILS 
 
    ED_ID INT NOT NULL AUTO_INCREMENT,
   
    ADDRESS VARCHAR(252),
    GENDER VARCHAR(8),
    BANK_ACCOUNT VARCHAR(128),
    PRIMARY KEY (ED_ID),

 */
package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity

public class EMP_DETAILS {
	//annotation id
	@Id
	//generate value
	@GeneratedValue
	//Primary key join column annotation
	@PrimaryKeyJoinColumn(name="ed_ id")
	//OneToOne annotation
	@OneToOne(cascade = CascadeType.ALL)
	private int ed_id;
	private String Emp_Address;
	private String Emp_Bank_Account;
	//superclass
	public EMP_DETAILS() {
		super();
		// TODO Auto-generated constructor stub
	}
	//generate constructer using fields
	public EMP_DETAILS(int ed_id, String emp_Address, String emp_Bank_Account) {
		super();
		this.ed_id = ed_id;
		Emp_Address = emp_Address;
		Emp_Bank_Account = emp_Bank_Account;
	}
	//using getter and setter method
	
	public int getEd_id() {
		return ed_id;
	}
	public void setEd_id(int ed_id) {
		this.ed_id = ed_id;
	}
	public String getEmp_Address() {
		return Emp_Address;
	}
	public void setEmp_Address(String emp_Address) {
		Emp_Address = emp_Address;
	}
	public String getEmp_Bank_Account() {
		return Emp_Bank_Account;
	}
	public void setEmp_Bank_Account(String emp_Bank_Account) {
		Emp_Bank_Account = emp_Bank_Account;
	}
	@Override
	public String toString() {
		return "EMP_DETAILS [ed_id=" + ed_id + ", Emp_Address=" + Emp_Address + ", Emp_Bank_Account=" + Emp_Bank_Account
				+ "]";
	}
	
	
	
	
}

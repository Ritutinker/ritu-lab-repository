/*EMPLOYEE
 
    EMP_ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(252),
    DEPARTMENT VARCHAR(128),
    SALARY long,
     PRIMARY KEY (EMP_ID)

 */
package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


public class Employee {
	//id annotation
	@Id
	//generated auto increment value
	@GeneratedValue(strategy=GenerationType.AUTO)
	//primary key join column
	@PrimaryKeyJoinColumn(name="emp_id")
	
	private int emp_id;
	private String name;
	private String dept;
	private long salary;
	//one to one annotation
	@OneToOne(cascade = CascadeType.ALL)
	private EMP_DETAILS ed_id;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String name, String dept, long salary, EMP_DETAILS ed_id) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.ed_id = ed_id;
		
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public EMP_DETAILS getEd_id() {
		return ed_id;
	}


	public void setEd_id(EMP_DETAILS ed_id) {
		this.ed_id = ed_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", ed_id="
				+ ed_id + "]";
	}


	
	
	}

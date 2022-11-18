package com.springhibernate.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Doctor {

	//data members of class Doctor
	@Id
	private int did;
	private String dname;
	private String dcourse;
	private String dqualification;
	
}
package com.springhibernate.DocDao;

import com.springhibernate.Entity.Doctor;
import java.util.List;

//interface doctorDao
public interface DoctorDao {
	
	public int insertDoctorDetails(Doctor dd);
	public int updateDoctorDetails(Doctor dd);
	public int deleteDoctorDetails(Doctor dd);
	public Doctor getSpecificDoctorDetails(int did);
	public List<Doctor> getAllDetails();
}

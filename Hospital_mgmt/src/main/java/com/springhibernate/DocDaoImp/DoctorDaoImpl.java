package com.springhibernate.DocDaoImp;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernate.DocDao.DoctorDao;
import com.springhibernate.Entity.Doctor;

public  class DoctorDaoImpl implements DoctorDao {

	
	private HibernateTemplate ht;

	//Method for inserting details
	@Transactional
	public int insertDoctorDetails(Doctor dd) {

		ht.save(dd);
		return 1;
	}
	//method for updating  details
	@Transactional
	public int updateDoctorDetails(Doctor dd) {
		ht.update(dd);
		return 1;
	}
	//method for deleting details
	@Transactional
	public int deleteDoctorDetails(Doctor dd) {
		ht.delete(dd);
		return 1;
	}
	//method for getting specific  details
	public Doctor getSpecificDoctorDetails(int did)
	{
		Doctor d=ht.get(Doctor.class, did);
		return d;

	}
	//method for getting all table data
	public List<Doctor> getAllDetails() {
		List<Doctor> d = ht.loadAll(Doctor.class);
		return d;
	}
	//getter setter for HibernateTemplate class reference
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}

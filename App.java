package com.hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
/*@OnetoOne    
     Employee  emp,
    //FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEES(EMP_ID)
Use one to one mapping(unidirectional ) and insert 3 records in table EMP_Details and fetch records and diplay.
(Use Query query=session.createQuery("From EMP_DETAILS") and query.list() to fetch records.)
 
 */

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    		System.out.println("Hello World");
    		//first entry
    		Employee e1=new Employee();
    		e1.setName("Ritu");
    		e1.setEmp_id(100);
    		e1.setDept("Management");
    		e1.setSalary(50000);
    		//second entry
    		Employee e2=new Employee();
    		e2.setName("Rudhra");
    		e2.setEmp_id(101);
    		e2.setDept("Personal Assistance");
    		e2.setSalary(55000);
    		//third entry
    		Employee e3=new Employee();
    		e3.setName("Ritika");
    		e3.setEmp_id(103);
    		e3.setDept("Chief maneger");
    		e3.setSalary(40000);
    		
    		//Entry Emp_details
    		EMP_DETAILS ed1=new EMP_DETAILS();
    		ed1.setEd_id(1);
    		ed1.setEmp_Bank_Account("27900100012121");
    		ed1.setEmp_Address("Rewari");
    		//Entry Emp_details
    		EMP_DETAILS ed2=new EMP_DETAILS();
    		ed2.setEd_id(2);
    		ed2.setEmp_Bank_Account("37900100012121");
    		ed2.setEmp_Address("Jaipur");
    		
    		//Entry Emp_details
    		EMP_DETAILS ed3=new EMP_DETAILS();
    		ed3.setEd_id(3);
    		ed3.setEmp_Bank_Account("47900100012121");
    		ed3.setEmp_Address("New Delhi");
    		
    		Session session=HibernateUtil.getSession();
    		Transaction t=session.beginTransaction();
    		session.save(e1);
    		session.save(e2);
    		session.save(e3);		
    		session.save(ed1);
    		session.save(ed2);
    		session.save(ed3);
    		t.commit();
    		session.close();
    		}

    }


package com.springhibernate.Service;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernate.Entity.Doctor;
import com.springhibernate.DocDao.DoctorDao;
import com.springhibernate.DocDaoImp.DoctorDaoImpl;


/**
 * Hello world!
 *
 */
//main class
public class App 
{
    public static void main( String[] args ) {
    
    	  System.out.println( "Hello World!" );
          //creating ApplicationContext class reference
          		ApplicationContext ac = new ClassPathXmlApplicationContext("Hospitalmngt.xml");

          		DoctorDao dd = (DoctorDao) ac.getBean("ddao1");
        
          		char c='y';
        		//while loop
        		while (c=='y') {
        			//providing user a facility to perform several task
        			System.out.println("Choose any options on which you want to perform task :\n");


        			System.out.println("Choose 1 option to insert the Doctor details: ");
        			System.out.println("Choose 2 option to update the Doctor details: ");
        			System.out.println("Choose 3 option to delete the Doctor details: ");
        			System.out.println("Choose 4 option to see specific Doctor details: ");
        			System.out.println("Choose 5 option to display the Doctor details: ");
        			System.out.println("Choose 6 option to exit:");
        			
        			//creating Scanner class object
        			Scanner sc = new Scanner(System.in);
        			System.out.println("Choose yes or no :\n");
        			int i = sc.nextInt();
        			
        			//switch cases
        			switch (i) {
        			//case 1 -> for inserting user details
        			case 1: {
        				Doctor d = new Doctor();
        				System.out.println("insert Doctor  id:");
        				int do1 = sc.nextInt();
        				d.setDid(do1);
        				System.out.println("insert Doctor name:");
        				String do2 = sc.next();
        				d.setDname(do2);
        				System.out.println("insert Doctor course");
        				String do3 = sc.next();
        				d.setDcourse(do3);
        				System.out.println("insert Doctor qualification");
        				String do4 = sc.next();
        				d.setDqualification(do4);
        				
        				int i1 = dd.insertDoctorDetails(d);
        				if (i1 == 1)
        					System.out.println("Doctor details inserted successfully...");
        				else
        					System.out.println("problem occured during inserting Doctor details...");
        				break;
        			}
        			//case 2: for updating doctor details
        			case 2: {
        				Doctor d1 = new Doctor();
        				System.out.println("enter id where to update the Doctor details...");
        				int do1 = sc.nextInt();
        				d1.setDid(do1);
        				System.out.println("enter Doctor new name to update...");
        				String do2 = sc.next();
        				d1.setDname(do2);
        				System.out.println("enter Doctor new course to update...");
        				String do3 = sc.next();
        				d1.setDcourse(do3);
        				System.out.println("enter Doctor new Qualifications to update...");
        				String do4 = sc.next();
        				d1.setDqualification(do4);
        				int i2 = dd.updateDoctorDetails(d1);
        				if (i2 == 1)
        					System.out.println("Doctor details inserted successfully...");
        				else
        					System.out.println("problem occured during inserting Doctor details...");
        				break;
        			}
        				//case 3: for deleting doctor details
        			case 3: {
        				Doctor d2 = new Doctor();
        				System.out.println("enter the Doctor id for whose record you want to delete :");
        				int do1 = sc.nextInt();
        				d2.setDid(do1);
        				int i3 = dd.deleteDoctorDetails(d2);
        				if (i3 == 1)
        					System.out.println("doctor details deleted successfully...");
        				else
        					System.out.println("problem occured during deleting dctor details...");
        				break;

        			}
        					//case 4: for retrieving specific doctor details
        			case 4: {
        				System.out.println("enter did to get specific doctor detail: ");
        				int did=sc.nextInt();
        				Doctor dt=dd.getSpecificDoctorDetails(did);
        				System.out.println("The details of the Doctor is : ");
        				System.out.println(dt);
        				break;
        			}
        				//case 5: for displaying all doctor details
        			case 5: {
        				Doctor d3 = new Doctor();
        				System.out.println("displaying all Doctor details...");

        				List<Doctor> list = dd.getAllDetails();
        				System.out.println("\n" + list + "\n");
        				break;
        			}
        					//case 6  ending of program
        			case 6:{
        				System.out.println("thanks to visit!!");
        				c='n';
        				break;
        			}
        			//default
        			default:
        				System.out.println("please choose a valid option...\n");
        			}
        			System.out.println("do you want to continue y/n...");
        			c=sc.next().charAt(0);
        		}
        
    }}

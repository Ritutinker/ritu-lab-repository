package com.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *Main class
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/hibernate/applicationcontext.xml");
        System.out.println( "Hello World!" );
        
        // st1 object Student class
        System.out.println("ist Student details.............");                          //first Print statement
        Student st1=(Student)ac.getBean("studentbean1");
        System.out.println(st1);
        
        //print with Student details
        System.out.println("Student id  :"+st1.getSid());
        System.out.println("Student name  :"+st1.getSname());
        System.out.println("Student book List  :"+st1.getBlist());
        System.out.println("Student address  :"+st1.getAddress()); 
        
        System.out.println("2nd Student details....................");                  //print statement 
        
     // st2 object of Student class
        Student st2=(Student)ac.getBean("studentbean2");
        System.out.println(st2);
        
        //print with student details
        System.out.println("Student id  :"+st2.getSid());
        System.out.println("Student name  :"+st2.getSname());
        System.out.println("Student book List  :"+st2.getBlist());
        System.out.println("Student address  :"+st2.getAddress()); 
        
        
    }
}

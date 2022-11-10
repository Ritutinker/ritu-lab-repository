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
        
        Student st1=(Student)ac.getBean("Sbean1");
        System.out.println(st1);
        
        Student st2=(Student)ac.getBean("Sbean2");
        System.out.println(st2);
        
        
    }
}

package com.trainingInstitute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Courses_Student_driver
{
    public static void main(String[] args)
    {
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("TI");
	  EntityManager em=emf.createEntityManager();
	  EntityTransaction et=em.getTransaction();
	  
	  for(;;)
	  {
		  Student s=new Student();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter Student id");
		  int id=sc.nextInt();
		  System.out.println("enter student name");
		  String name=sc.next();
		  System.out.println("enter Student branch");
		  String sbranch=sc.next();
		  System.out.println("enter student yop");
		  int yop =sc.nextInt();
		  
		  s.setId(id);
		  s.setSname(name);
		  s.setSbranch(sbranch);
		  s.setYop(yop);
		  
		  Student s1=new Student();
		  System.out.println("enter Student id");
		  int id1=sc.nextInt();
		  System.out.println("enter student name");
		  String name1=sc.next();
		  System.out.println("enter Student branch");
		  String sbranch1=sc.next();
		  System.out.println("enter student yop");
		  int yop1 =sc.nextInt();
		  
		  s1.setId(id1);
		  s1.setSname(name1);
		  s1.setSbranch(sbranch1);
		  s1.setYop(yop1);
		  
		  Courses cs=new Courses();
		  System.out.println("enter id");
		  int id2=sc.nextInt();
		  System.out.println("enter course name");
		  String cname=sc.next();
		  System.out.println("enter course fees");
		  double fee=sc.nextDouble();
		  
		  cs.setId(id2);
		  cs.setCname(cname);
		  cs.setFees(fee);
		  
		  Courses cs1=new Courses();
		  System.out.println("enter id");
		  int id3=sc.nextInt();
		  System.out.println("enter course name");
		  String cname1=sc.next();
		  System.out.println("enter course fees");
		  double fee1=sc.nextDouble();
		  
		 cs1.setId(id3);
		 cs1.setCname(cname1);
		 cs1.setFees(fee1);
		  
		  Courses cs2=new Courses();
		  System.out.println("enter id");
		  int id4=sc.nextInt();
		  System.out.println("enter course name");
		  String cname2=sc.next();
		  System.out.println("enter course fees");
		  double fee2=sc.nextDouble();
		  
		 cs2.setId(id4);
		 cs2.setCname(cname2);
		 cs2.setFees(fee2);
		 
		 List<Courses> cl=new ArrayList<Courses>();
		 cl.add(cs2);
		 cl.add(cs1);
		 cl.add(cs);
		 
		 s.setCourses(cl);
		 s1.setCourses(cl);
		 
		 et.begin();
		 em.persist(cs);
		 em.persist(cs1);
		 em.persist(cs2);
		 em.persist(s);
		 em.persist(s1);
	  }
	}
}

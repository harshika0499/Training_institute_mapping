package com.trainingInstitute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Branch_course_driver
{
 public static void main(String[] args)
 {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("TI");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		for(;;)
		{

			Scanner sc=new Scanner(System.in);
			System.out.println("enter course details for branch : 1.deccan 2.wakad");
			int aid = sc.nextInt();

			Courses c = new Courses();
			System.out.println("enter id");
			int id1=sc.nextInt();
			System.out.println("enter course name");
			String cname1=sc.next();
			System.out.println("enter course fees");
			double cfee1=sc.nextDouble();

			c.setId(id1);
			c.setCname(cname1);
            c.setFees(cfee1);
            
            Courses c1 = new Courses();
			System.out.println("enter id");
			int id2=sc.nextInt();
			System.out.println("enter course name");
			String cname2=sc.next();
			System.out.println("enter course fees");
			double cfee2=sc.nextDouble();

			c1.setId(id2);
			c1.setCname(cname2);
			c1.setFees(cfee2);


			List<Courses> cl = new ArrayList<Courses>();
			cl.add(c);
			cl.add(c1);



			Branches b2= em.find(Branches.class, aid);
			b2.setCourses(cl);


			et.begin();
			em.persist(c);
			em.persist(c1);
			//1em.persist(bb);
			em.merge(b2);
			et.commit();

			System.out.println("data saved");
		}
	}
}
		
		

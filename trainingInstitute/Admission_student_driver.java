package com.trainingInstitute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Admission_student_driver
{

	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TI");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		Scanner sc=new Scanner(System.in);
		Student s = new Student();
		System.out.println("enter student id");
		int id=sc.nextInt();
		System.out.println("enter student name");
		String sname=sc.next();
		System.out.println("enter student branch");
		String sbranch=sc.next();
		System.out.println("enter student year of passout");
		int yop=sc.nextInt();

		s.setId(id);
		s.setSname(sname);
		s.setSbranch(sbranch);
		s.setYop(yop);
		
	    Admission ad=new Admission();
		System.out.println("enter branch for admission : 1.deccan 2.wakad");
		int a = sc.nextInt();
		
		System.out.println("enter student admission id");
		int id1=sc.nextInt();
		System.out.println("enter student email");
		String semail=sc.next();
		System.out.println("enter student contact number");
		long scon=sc.nextLong();
		System.out.println("enter student registration number");
		int reg=sc.nextInt();

		ad.setId(id1);
		ad.setEmail(semail);
		ad.setContact_no(scon);
		ad.setRegno(reg);
		
	    List<Admission> al = new ArrayList<Admission>();
	    al.add(ad);
		
		s.setAdm(ad);
		
		
		Branches b2 = em.find(Branches.class,a);
		List<Admission> l=b2.getAdm();
		int count=0;
		for(Admission ad1 : al ) {
			l.add(ad1) ;
			count++;
		}
		b2.setAdm(l);
	

		et.begin();
		em.persist(ad);
		em.persist(s);
//		em.persist(b2);
		em.merge(b2);
		et.commit();

		System.out.println("saved successfully");
		
   
	}
}

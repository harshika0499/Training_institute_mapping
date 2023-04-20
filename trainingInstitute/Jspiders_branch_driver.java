package com.trainingInstitute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Jspiders_branch_driver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TI");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();

		Jspider j = new Jspider();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Training institute id");
		int id= sc.nextInt();
		System.out.println("enter Training institute name");
		String tname=sc.next();

		
		j.setId(id);
		j.setName(tname);
		
		Branches b=new Branches();
		System.out.println("enter first branch id");
		int id1=sc.nextInt();
		System.out.println("enter first branch name");
		String name1 = sc.next();
		System.out.println("enter first pincode");
		int pin1=sc.nextInt();

		b.setId(id1);
		b.setBranchname(name1);
		b.setPincode(pin1);

		Branches b1=new Branches();
		System.out.println("enter second branch id");
		int id2=sc.nextInt();
		System.out.println("enter second branch name");
		String name2 = sc.next();
		System.out.println("enter second pincode");
		int pin2=sc.nextInt();

		b1.setId(id2);
		b1.setBranchname(name2);
		b1.setPincode(pin2);

		List<Branches> br=new ArrayList<Branches>();
		br.add(b1);
		br.add(b);
	
		j.setBranches(br);

		et.begin();
	    em.persist(b1);
		em.persist(b);
		em.persist(j);
		et.commit();
		
		System.out.println("data saved");



	}
}

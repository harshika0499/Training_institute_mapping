package com.trainingInstitute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Branch_trainer_driver
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TI");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();

		for(;;)
		{

			Scanner sc=new Scanner(System.in);
			System.out.println("for which branch you want to add trainers: 1.deccan 2.wakad");
			int bid = sc.nextInt();

			Trainers t= new Trainers();
			System.out.println("enter first trainers id");
			int id1=sc.nextInt();
			System.out.println("enter first trainer name");
			String name1=sc.next();
			System.out.println("enter first trainers subject");
			String sub1=sc.next();

			t.setId(id1);
			t.setTname(name1);
			t.setSubj(sub1);

			Trainers t1= new Trainers();
			System.out.println("enter second trainers id");
			int id2=sc.nextInt();
			System.out.println("enter second trainer name");
			String name2=sc.next();
			System.out.println("enter second trainers subject");
			String sub2=sc.next();

			t1.setId(id2);
			t1.setTname(name2);
			t1.setSubj(sub2);


			List<Trainers> tl = new ArrayList<Trainers>();
			tl.add(t);
			tl.add(t1);


			Branches b1= em.find(Branches.class, bid);
			b1.setTrainers(tl);

			et.begin();
			em.persist(t);
			em.persist(t1);
			em.merge(b1);
			et.commit();

			System.out.println("data saved");
		}
		
	}
}

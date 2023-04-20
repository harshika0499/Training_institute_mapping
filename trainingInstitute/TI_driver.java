package com.trainingInstitute;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TI_driver 
{
 public static void main(String[] args) 
 {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("TI");
    EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    
    TI ti=new TI();
    ti.setId(1);
    ti.setTI_name("Jspider");
    
    et.begin();
    em.persist(ti);
    et.commit();
    System.out.println("data saved");
}
}

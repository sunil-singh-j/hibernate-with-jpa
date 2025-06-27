package com.sunil.hibernate_jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Student student= new Student();
        
        student.setName("ram");
        student.setPhone(765432165);
        student.setDepartmet("cse");
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("YourPUName");
        
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        
        EntityTransaction transaction= entityManager.getTransaction();
        
        transaction.begin();
        
        
        entityManager.persist(student);
        transaction.commit();
        
        System.out.println(student);
        
        
        
    }
}

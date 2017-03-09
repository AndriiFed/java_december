package com.hillel.courses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
  public static void main(String[] args) {

    SessionFactory sessionFactory =
        new Configuration().configure().buildSessionFactory();

    Session session = sessionFactory.openSession();

    Transaction transaction = session.beginTransaction();

    Query<Student> query = session.createQuery("from Student where id = 2");
    //List<Student> students = query.getResultList();

    Student student = query.getSingleResult();
    student.setName("Pete");

    session.update(student);

    /*
    Student student = new Student("Another", "Guy");
    session.save(student);
    */

    transaction.commit();

    session.close();
  }
}

package com.example.hibtesting;

import com.example.hibtesting.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibtestingApplication {

    public static void main(String[] args) {

        final SessionFactory sessionFactory = new Configuration()
                .configure(("hibernate.cfg.xml"))
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        try (sessionFactory) {
           Session session = sessionFactory.getCurrentSession();

            final Student student = new Student("Student", "Testowy", "email@email.com");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            final Student retrievedStudent= session.get(Student.class, 1L);
            session.getTransaction().commit();
            System.out.println(retrievedStudent);

        }


    }
}

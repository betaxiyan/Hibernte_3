package com.bonc.test;
import java.sql.Date;
import java.util.List;

import org.hibernate.Session;

import com.bonc.entity.Student;
import com.bonc.utils.HibernateUtils;

public class App {

    public static void main(String[] args) {
        System.out.println("Maven3 + Hibernate + Oracle10g");
        App a1 = new App();
        a1.testQuery();
    }
    
    
    public void testQuery() {  
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
          
        session.beginTransaction();  
          
        List<Student> personList = session.createQuery("select p from Student p where p.id=903").list();  
          
        for(Student eachPerson : personList) {  
            System.out.println(eachPerson);  
        }  
          
        session.getTransaction().commit();  
        HibernateUtils.closeSession(session);
    }  
    
    public void save() {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        
        session.beginTransaction();
        Student user = new Student();
 
        user.setId(100);
        user.setName("leioolei");
        user.setAddress("北京");
        user.setBirth(1997);
        user.setDepartmet("计算机系");
        user.setSex("男");
        session.save(user);
        session.getTransaction().commit();
        HibernateUtils.closeSession(session);
    }
}

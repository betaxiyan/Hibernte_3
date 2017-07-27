/*
 * 文件名：StudentDaoImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月19日
 */

package com.bonc.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.bonc.dao.StudentDao;
import com.bonc.entity.PageInfo;
import com.bonc.entity.Student;
import com.bonc.utils.HibernateUtils;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Override   //Hql方式
    public List<Student> findAll() {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        
        session.beginTransaction();  
          
        Query q = session.createQuery("from Student");
        q.setFirstResult(0);//设置起始行
        q.setMaxResults(3);//每页条数
        List cats = q.list(); //得到每页的数据
        
        //List<Student> personList = session.createQuery("from Student").list();  
        session.getTransaction().commit();  
        HibernateUtils.closeSession(session);
        return cats;
    }

    @Override   //SQL方式
    public List<Student> findById(Integer id) {
        // TODO Auto-generated method stub
        Session session = HibernateUtils.getSession();
        session.beginTransaction();
        
        List<Student> list = session.createSQLQuery("SELECT * from Student where id="+id).list();
        HibernateUtils.closeSession(session);
        return list;
    }
    
    
    public List<Student> findGirl() {
        // TODO Auto-generated method stub
        Session session = HibernateUtils.getSession();
        session.beginTransaction();
        
        Criteria criteria=session.createCriteria(Student.class);
        criteria.add(Expression.eq("sex","女"));
        
        List<Student> list = criteria.list();
        HibernateUtils.closeSession(session);
        return list;
    }

    @Override
    public List<Student> findZaW() {
        // TODO Auto-generated method stub
        Session session = HibernateUtils.getSession();
        session.beginTransaction();
        List<Student> list = session.createQuery("SELECT s.id, s.name, s.sex,s.birth, s.department, s.address, c.c_name, c.grade from Student s, Score c WHERE (s.name LIKE '张%' OR s.name LIKE '王%') AND s.id=c.stu_id ").list();
        HibernateUtils.closeSession(session);
        return list;
    }
    
    

}

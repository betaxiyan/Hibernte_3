/*
 * 文件名：StudentDao.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月19日
 */

package com.bonc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bonc.entity.Student;


public interface StudentDao {

    List<Student> findAll();

    //List<Student> findById();

    List<Student> findById(Integer id);

    List<Student> findGirl();

    List<Student> findZaW();

}

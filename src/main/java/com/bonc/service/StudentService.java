/*
 * 文件名：StudentService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月19日
 */

package com.bonc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonc.dao.StudentDao;
import com.bonc.entity.Student;

@Service
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;

    public List<Student> findAll() {
        // TODO Auto-generated method stub
        return studentDao.findAll();
    }

    public List<Student> findById(Integer id) {
        
        return studentDao.findById(id);
    }

    public List<Student> findGirl() {
        // TODO Auto-generated method stub
        return studentDao.findGirl();
    }

    public List<Student> findZaW() {
        // TODO Auto-generated method stub
        return studentDao.findZaW();
    }

}

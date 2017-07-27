/*
 * 文件名：StudentController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月19日
 */

package com.bonc.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bonc.entity.Student;
import com.bonc.service.StudentService;
import com.bonc.utils.HibernateUtils;

@Controller
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @ResponseBody
    @GetMapping("/AllStu")
    public List<Student> testQuery() {  
        return studentService.findAll();
      
    } 
    
    @ResponseBody
    @GetMapping("/findById")
    public List<Student> findById(@RequestParam Integer id) {  
        return studentService.findById(id);
    }
    
    @ResponseBody
    @GetMapping("/findGirl")
    public List<Student> findGirl() {  
        return studentService.findGirl();
    }
    
    @ResponseBody
    @GetMapping("/findZaW")
    public List<Student> findZaW() {  
        return studentService.findZaW();
    }
}

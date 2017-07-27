/*
 * 文件名：Student.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月17日
 */
/*
 * CREATE  TABLE  student (
id  INT(10)  NOT NULL  UNIQUE  PRIMARY KEY  ,
name  VARCHAR(20)  NOT NULL ,
sex  VARCHAR(4)  ,
birth  YEAR,
department  VARCHAR(20) ,
address  VARCHAR(50) 
);
*/
package com.bonc.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Integer id;
    private String name;
    private String sex;
    private Integer birth;
    private String department;
    private String address;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getBirth() {
        return birth;
    }
    public void setBirth(Integer birth) {
        this.birth = birth;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartmet(String department) {
        this.department = department;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", birth=" + birth
               + ", departmet=" + department + ", address=" + address + "]";
    }
    
    

}

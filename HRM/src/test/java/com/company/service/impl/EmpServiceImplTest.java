package com.company.service.impl;

import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpServiceImplTest {

    @Autowired
    EmpService empService;

    @Test
    public void save() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void findByPage() {
        List<Emp> empList = empService.findByPage(1,2);
        for (Emp emp:empList){
            System.err.println(emp);
        }
    }

    @Test
    public void findById() {
        System.err.println(empService.findById(1001));
    }

    @Test
    public void findByName() {
        List<Emp> empList = empService.findByName("n");
        for (Emp emp:empList){
            System.err.println(emp);
        }
    }

    @Test
    public void findDimission() {
        List<Emp> emps = empService.findDimission("工作");
        for (Emp emp:emps){
            System.err.println(emp);
        }
    }
}
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.studentinterface.studentinterface;

@Service
public class studentseevice {
 @Autowired
 private studentinterface stu;
 public List<student> findstudent(String name){
	return stu.findUserByName(name);
	 
	 
 }
}

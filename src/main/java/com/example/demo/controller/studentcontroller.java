package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student;
import com.example.demo.service.studentseevice;

@RestController
public class studentcontroller {
@Autowired
private studentseevice stuservice;
@RequestMapping("/selectStudent")
public List<student> findstudent(String name){
	return stuservice.findstudent(name);
	
}
}

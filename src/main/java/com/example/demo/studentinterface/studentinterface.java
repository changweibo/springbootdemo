package com.example.demo.studentinterface;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.student;

@Mapper
public interface studentinterface {
	@Select("select * from student where name = #{name}")
    public List<student> findUserByName(String name);

    @Select("select * from student")
    public List<student> findUser();
}

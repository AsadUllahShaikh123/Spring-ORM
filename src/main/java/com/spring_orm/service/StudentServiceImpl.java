package com.spring_orm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_orm.dao.StudentDao;
import com.spring_orm.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;
	public int saveUser(Student student) {
		int inserted = dao.insert(student);
		return inserted;
	}

}

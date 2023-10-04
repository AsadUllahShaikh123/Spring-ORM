package com.spring_orm.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring_orm.model.Student;

@Repository
public class StudentDao {

	@Autowired	
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Student student) {
		
		int inserted = 0;
		
		inserted = (Integer) hibernateTemplate.save(student);
		
		return inserted;
	}
}

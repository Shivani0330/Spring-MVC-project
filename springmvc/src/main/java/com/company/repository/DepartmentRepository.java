package com.company.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.company.entity.DepartmentEntity;

@Repository
@Transactional
public class DepartmentRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void save(DepartmentEntity entity) {
		hibernateTemplate.save(entity);
		System.out.println("Entity saved");
	}

}

package com.company.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.DepartmentEntity;
import com.company.model.Department;
import com.company.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService {

	private static Logger log = LoggerFactory
			.getLogger(DepartmentServiceImp.class.getSimpleName());

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public void save(Department department) {
		DepartmentEntity entity=new DepartmentEntity();
		entity.setName(department.getName());
		entity.setManager(department.getManager());
		entity.setNumberOfEmployees(department.getNumberOfEmployees());
		entity.setCreatedDate(new Date());
		
		departmentRepository.save(entity);
		log.info("Department saved : ",department);
	}
}

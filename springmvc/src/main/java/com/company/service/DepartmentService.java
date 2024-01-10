package com.company.service;

import org.springframework.stereotype.Service;

import com.company.model.Department;

@Service
public interface DepartmentService {

	void save(Department department);

}

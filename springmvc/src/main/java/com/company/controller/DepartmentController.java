package com.company.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.company.model.Department;
import com.company.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	private static Logger log=LoggerFactory.getLogger(Department.class.getSimpleName());
	
	@RequestMapping(path = "/department", method = RequestMethod.GET)
	public ModelAndView department() {
//		Map<String,Object> map = new HashMap<>();
//		map.put("headerName", "Department");
//		//map.put("faculties", getFaculty());
//		map.put("dept", new Department());

		return new ModelAndView("department", "dept", new Department());
		//return new ModelAndView("department");
	}

	@RequestMapping(path ="/department", method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute Department department) {
		//map.put("headerName", "");
//		map.addAttribute("department", department);
		
		log.info(department.toString());
		
		departmentService.save(department);
		return new ModelAndView("department", "dept", department);
	}
	
	

}

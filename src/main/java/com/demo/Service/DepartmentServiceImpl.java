package com.demo.Service;

import com.demo.store.repository.DepartmentDao;
import com.demo.store.repository.EmployeeDao;

public class DepartmentServiceImpl implements DepartmentService {

	 

    private DepartmentDao departmentDao;
    private EmployeeDao employeeDao;
    
    @Override
    public List<Employee> getAllEmployee() {
        List<Employee>employees =employeeDao.findAll();
        return employees;
    }
    

 
}
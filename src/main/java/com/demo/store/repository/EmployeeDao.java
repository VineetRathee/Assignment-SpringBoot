package com.demo.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.store.dao.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}

package com.demo.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.store.dao.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {

}

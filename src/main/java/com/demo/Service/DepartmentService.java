package com.demo.Service;
import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.store.dao.Employee;

public interface DepartmentService {
    public List<Employee> getAllEmployee();    
}

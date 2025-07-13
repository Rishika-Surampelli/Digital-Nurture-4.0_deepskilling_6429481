package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import com.cognizant.spring_learn.dao.DepartmentDao;
import com.cognizant.spring_learn.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    @Transactional
    public ArrayList<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}

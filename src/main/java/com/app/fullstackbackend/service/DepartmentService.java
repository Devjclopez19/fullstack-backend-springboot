package com.app.fullstackbackend.service;

import com.app.fullstackbackend.exception.DepartmentNotFoundException;
import com.app.fullstackbackend.model.Department;

import java.util.List;

public interface DepartmentService{

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentsList();

    Department fetchDepartentById(Long id) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long id);

    Department updateDeparment(Long id, Department department);

    Department fetchDepartmentByName(String name);
}

package com.app.fullstackbackend.controller;

import com.app.fullstackbackend.exception.DepartmentNotFoundException;
import com.app.fullstackbackend.model.Department;
import com.app.fullstackbackend.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department newDepartment) {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(newDepartment);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentsList() {
        return departmentService.fetchDepartmentsList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartentById(@PathVariable Long id) throws DepartmentNotFoundException {
        return departmentService.fetchDepartentById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable Long id) {
        departmentService.deleteDepartmentById(id);
        return "Department deleted Successfully!!";
    }

     @PutMapping("/departments/{id}")
    public Department updateDeparment(@PathVariable Long id, @RequestBody Department department) {
        return departmentService.updateDeparment(id, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable String name) {
        return departmentService.fetchDepartmentByName(name);
    }
}

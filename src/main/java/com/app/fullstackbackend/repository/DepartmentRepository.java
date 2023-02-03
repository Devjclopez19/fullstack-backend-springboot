package com.app.fullstackbackend.repository;

import com.app.fullstackbackend.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

    public Department findByDepartmentName(String name);

    public Department findByDepartmentNameIgnoreCase(String name);


}

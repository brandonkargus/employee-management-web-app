package com.projects.employeemanagementwebapp.repository;

import com.projects.employeemanagementwebapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}

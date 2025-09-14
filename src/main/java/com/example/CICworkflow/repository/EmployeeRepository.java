package com.example.CICworkflow.repository;

import com.example.CICworkflow.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
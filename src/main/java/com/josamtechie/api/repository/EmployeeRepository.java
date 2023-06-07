package com.josamtechie.api.repository;

import com.josamtechie.api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

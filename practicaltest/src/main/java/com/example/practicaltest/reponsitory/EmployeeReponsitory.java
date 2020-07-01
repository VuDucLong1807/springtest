package com.example.practicaltest.reponsitory;

import com.example.practicaltest.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeReponsitory extends CrudRepository<Employee, Integer> {
}

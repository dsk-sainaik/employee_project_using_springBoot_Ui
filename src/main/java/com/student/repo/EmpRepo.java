package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}

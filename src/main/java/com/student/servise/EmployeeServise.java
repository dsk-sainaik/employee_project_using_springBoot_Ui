package com.student.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Employee;
import com.student.repo.EmpRepo;

@Service
public class EmployeeServise {
	@Autowired
	private EmpRepo repo;

	public void insertEmp(Employee employee) {
		repo.save(employee);
	}
	public List<Employee> getlist()
	{
		return repo.findAll();
	}
	
	public Employee findById(int id)
	{
		return repo.findById(id).get();
	}
}

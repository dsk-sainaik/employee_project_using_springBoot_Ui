package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.entity.Employee;
import com.student.servise.EmployeeServise;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServise servise;

    @GetMapping("/")
    public String getStartPAGE() {
        return "index";
    }

    @GetMapping("/index")
    public String redirect() {
        return "index";
    }

    @GetMapping("/add-employee")
    public String addEmployeePage(Model model) {
        model.addAttribute("emp", new Employee());
        return "addemployee";
    }

    @PostMapping("/emp/add")
    public String insertEmployee(@ModelAttribute("emp") Employee employee) {
        servise.insertEmp(employee);
        return "index";
        
    }
    
    
    
    @GetMapping("/list")
    public String getList_Of_Employee_Page(Model model) {
    	model.addAttribute("employess",servise.getlist());
        return "list";
    }
    
    
    @GetMapping("/update/{id}")
    public String getUpdatePage(Model model,@PathVariable("id") int id) {
    	model.addAttribute("emp",new Employee());
        return "update";
    }
    
    
//    @GetMapping("/update/{id}")
//    public String showUpdateForm(@PathVariable("id") int id, Model model) {
//       
//        Employee emp = servise.findById(id);
//       
//        model.addAttribute("emp", emp);
//        
//        return "update";
    }
   
    

  

    
    

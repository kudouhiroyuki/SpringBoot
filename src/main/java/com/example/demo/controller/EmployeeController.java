package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.BindingResult;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.DepartmentEntity;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("/employees") 
public class EmployeeController {
  
  @Autowired
  private EmployeeService employeeService;
  @Autowired
  private DepartmentService departmentService;
  
  @GetMapping
  public String index(Model model) {
    List<EmployeeEntity> employees = employeeService.findEmployeeAll();
    model.addAttribute("employees", employees);
    return "employees/index";
  }
  
  @GetMapping("/create")
  public String create(Model model) {
    List<DepartmentEntity> departments = departmentService.findDepartmentAll();
    model.addAttribute("employeeEntity", new EmployeeEntity());
    model.addAttribute("departments", departments);
    return "employees/create";
  }
  
  @GetMapping("/{id}")
  public String edit(@PathVariable int id, Model model) {
    Optional<EmployeeEntity> employee = employeeService.findEmployeeById(id);
    List<DepartmentEntity> departments = departmentService.findDepartmentAll();
    model.addAttribute("employeeEntity", employee);
    model.addAttribute("departments", departments);
    return "employees/edit";
  }

  @PostMapping
  public String store(@Validated @ModelAttribute EmployeeEntity employee, BindingResult bindingResult, Model model) {
    if (bindingResult.hasErrors()) {
      List<DepartmentEntity> departments = departmentService.findDepartmentAll();
      model.addAttribute("departments", departments);
      return "employees/create";
    }
    employeeService.createEmployee(employee);
    return "redirect:/employees";
  }
  
  @PutMapping("/{id}")
  public String update(@Validated @ModelAttribute EmployeeEntity employee, BindingResult bindingResult, Model model) {
  if (bindingResult.hasErrors()) {
    List<DepartmentEntity> departments = departmentService.findDepartmentAll();
    model.addAttribute("departments", departments);
    return "employees/edit";
  }
    employeeService.updateEmployee(employee);
    return "redirect:/employees";
  }
  
  @DeleteMapping("/{id}")
  public String destroy(@PathVariable int id) {
    employeeService.destroyEmployee(id);
    return "redirect:/employees";
  }
}

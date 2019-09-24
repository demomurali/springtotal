package com.example.springtotal.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springtotal.entity.Employee;
import com.example.springtotal.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmployees(){
		int a=5/0;
		return employeeService.getEmploees();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getEmployeeById(@PathVariable("id") int id){
		try{
			return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
		}catch(Exception ee){
			return ResponseEntity.status(404).body("no data found");
		}
		}

	@PostMapping
	public Employee insertEmployee(@RequestBody @Valid Employee employee){
		return employeeService.insertEmployee(employee);
	}

	@PutMapping
	public Employee updateEmployee(Employee employee){
		return null;
	}
	
	@DeleteMapping
	public boolean deleteEmployee(){
		return false;
	}
	
}
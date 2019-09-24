package com.example.springtotal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springtotal.dao.EmployeeDao;
import com.example.springtotal.entity.Employee;
import com.example.springtotal.exceptions.EmployeeNotFoundException;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getEmploees(){
		return employeeDao.findAll();
	}
	
	public Employee insertEmployee(Employee employee){
			return employeeDao.save(employee);
		}
	
	
	public List<Employee> retrieveEmployee(){
					
			return employeeDao.findAll();
		}
	
	public Employee getEmployeeById(int id){
		
		Optional<Employee> options=employeeDao.findById(id);
			
			if(options.isPresent()){
				return options.get();
			}else{
				throw new EmployeeNotFoundException("no employee found for this "+id);
			}
			
		
	}
	
}
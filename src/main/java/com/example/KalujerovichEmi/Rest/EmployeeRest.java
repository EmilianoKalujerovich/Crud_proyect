package com.example.KalujerovichEmi.Rest;


import java.net.URI;
import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KalujerovichEmi.Model.Employee;
import com.example.KalujerovichEmi.Service.EmployeeService;


@RestController
@RequestMapping("/employee/")
public class EmployeeRest {

	
	
	@Autowired
	private EmployeeService employeeService;
	

	
	@GetMapping
	private ResponseEntity <java.util.List<Employee>> getAllEmployees (){
		return ResponseEntity.ok(employeeService.findAll());
	}
	
	
	@PostMapping
	private ResponseEntity<Employee> savePersona (@RequestBody Employee employee){
		try {
			Employee employeeSave = employeeService.save(employee);		
		return ResponseEntity.created(new URI("/employee/"+employeeSave.getId())).body(employeeSave);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteEmployee (@PathVariable ("id") Long id){
	employeeService.deleteById(id);
		return ResponseEntity.ok(!(employeeService.findById(id)!=null));
		
	}
	
	
	
}

package com.example.KalujerovichEmi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.KalujerovichEmi.Model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

}

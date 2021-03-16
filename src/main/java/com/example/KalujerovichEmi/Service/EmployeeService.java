package com.example.KalujerovichEmi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.KalujerovichEmi.Model.Employee;
import com.example.KalujerovichEmi.Repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeRepository{
	
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Employee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllById(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Employee> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(Employee entity) {
		 employeeRepository.delete(entity);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Employee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public boolean existsById(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public <S extends Employee> S save(S entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public Optional<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Employee> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Employee> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	



}

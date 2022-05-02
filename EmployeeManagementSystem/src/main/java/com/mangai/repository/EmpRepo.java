package com.mangai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mangai.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

	List<Employee> findAll();

}
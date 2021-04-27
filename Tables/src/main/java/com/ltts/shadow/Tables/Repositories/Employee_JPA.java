package com.ltts.shadow.Tables.Repositories;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ltts.shadow.Tables.Models.Employee;


public interface Employee_JPA extends JpaRepository<Employee, Integer>
{
	
	 
	/*
	 * @Query("select u.Emp_Name from Employee u inner join u.Patients ar where ar.Doc_ID = :doc_id"
	 * ) public List<Employee> getdoc(@Param("doc_id")long doc_id);
	 */
	
	
}

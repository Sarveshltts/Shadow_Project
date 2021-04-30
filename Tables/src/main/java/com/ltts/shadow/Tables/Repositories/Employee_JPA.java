package com.ltts.shadow.Tables.Repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ltts.shadow.Tables.Models.Employee;
import com.ltts.shadow.Tables.Models.Patients;


public interface Employee_JPA extends JpaRepository<Employee, Integer>
{
	
	 
	
	  @Query("select u.Emp_Name from Employee u where u.Emp_id = :doc_id"
	  ) public Employee getdoc(@Param("doc_id")int doc_id);
	  @Query("select u.Emp_Name from Employee u inner join Patients ar on ar.Emp_id = u.Emp_id")
		public Employee findAllPatients();
	
	
}

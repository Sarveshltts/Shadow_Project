package com.ltts.shadow.Tables.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ltts.shadow.Tables.Models.Employee;
import com.ltts.shadow.Tables.Models.Patients;

public interface Patient_JPA extends JpaRepository<Patients, Integer> 
{
	@Query("SELECT u FROM Patients u WHERE u.Patient_ID = ?1")
	public Patients findById(int id);
}

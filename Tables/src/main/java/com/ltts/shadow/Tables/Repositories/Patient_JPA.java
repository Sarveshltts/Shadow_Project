package com.ltts.shadow.Tables.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.ltts.shadow.Tables.Models.Patients;

public interface Patient_JPA extends JpaRepository<Patients, Integer> 
{
	@Query("SELECT u FROM Patients u WHERE u.Patient_ID = ?1")
	public Patients findById(int id);
	
//	@Query("select u.Emp_Name from Employee u where u.Emp_id = :doc_id") 
//	public Patients getdoc(@Param("doc_id")int doc_id);
	
	@Query("select ar.Patient_ID,ar.Pat_Name,ar.Pat_Phone,ar.Pat_Age,ar.Pat_Symptoms,u.Emp_Name from Employee u inner join Patients ar on ar.Emp_id = u.Emp_id")
	public Object findAllPatients();
	
//	@Query(value="SELECT employee.emp_name, patients.patient_id, patients.patient_name, patients.patient_symptoms FROM patients INNER JOIN employee WHERE employee.Emp_id = patients.Emp_id",nativeQuery=true)
//	public List<Patients> findyu();
}

package com.ltts.shadow.Tables.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Patients")
public class Patients {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Patient_ID;
	
	@Column(name = "Patient_Name"  ,length = 50, nullable = false)
	private String Pat_Name;
	
	@Column(name = "Patient_Number"  ,length = 50, nullable = false)
	private String Pat_Phone;
	
	@Column(name = "Patient_BP"  ,length = 50, nullable = true)
	private String Pat_BP;
	
	@Column(name = "Patient_Age"  ,length = 50, nullable = false)
	private String Pat_Age;
	
	@Column(name = "Patient_Symptoms"  ,length = 50, nullable = false)
	private String Pat_Symptoms;
	
	@Column(name = "Patient_Weight"  ,length = 50, nullable = true)
	private String Pat_Weight;
	
	
	@Column
	private int Emp_id;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="Patients")
    private Employee emp;

	public int getPatient_ID() {
		return Patient_ID;
	}

	public void setPatient_ID(int patient_ID) {
		Patient_ID = patient_ID;
	}

	public String getPat_Name() {
		return Pat_Name;
	}

	public void setPat_Name(String pat_Name) {
		Pat_Name = pat_Name;
	}

	public String getPat_Phone() {
		return Pat_Phone;
	}

	public void setPat_Phone(String pat_Phone) {
		Pat_Phone = pat_Phone;
	}

	public String getPat_BP() {
		return Pat_BP;
	}

	public void setPat_BP(String pat_BP) {
		Pat_BP = pat_BP;
	}

	public String getPat_Age() {
		return Pat_Age;
	}

	public void setPat_Age(String pat_Age) {
		Pat_Age = pat_Age;
	}

	public String getPat_Symptoms() {
		return Pat_Symptoms;
	}

	public void setPat_Symptoms(String pat_Symptoms) {
		Pat_Symptoms = pat_Symptoms;
	}

	public String getPat_Weight() {
		return Pat_Weight;
	}

	public void setPat_Weight(String pat_Weight) {
		Pat_Weight = pat_Weight;
	}


	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public Patients(int patient_ID, String pat_Name, String pat_Phone, String pat_BP, String pat_Age,
			String pat_Symptoms, String pat_Weight, int emp_id) {
		super();
		Patient_ID = patient_ID;
		Pat_Name = pat_Name;
		Pat_Phone = pat_Phone;
		Pat_BP = pat_BP;
		Pat_Age = pat_Age;
		Pat_Symptoms = pat_Symptoms;
		Pat_Weight = pat_Weight;
		Emp_id = emp_id;
	}

	public Patients() {
		super();
	}

	

	
	
	
	
}

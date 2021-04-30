package com.ltts.shadow.Tables.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.shadow.Tables.Models.Employee;
import com.ltts.shadow.Tables.Models.Patients;
import com.ltts.shadow.Tables.Repositories.Employee_JPA;
import com.ltts.shadow.Tables.Repositories.Patient_JPA;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class App_Controller 
{
	@Autowired
	Employee_JPA empjpa;
	@Autowired
	Patient_JPA patjpa;
	Patients pat;

	
	  @GetMapping("/p") public List<Employee> getEmployee() { List<Employee>
	  emplist=empjpa.findAll(); return emplist; }
	 
	 
	@GetMapping(value="",produces = "application/json")
	public List<Patients> getPatients()
	{
		List<Patients> patlist=patjpa.findAll();
		return patlist;
		

	}
	@DeleteMapping("/pat/{id}")
    public Patients delete(@PathVariable int id)
    {
		Patients deletedpat=null;
		List<Patients> pat=patjpa.findAll();
		for(Patients patient : pat)
		{
			if (patient.getPatient_ID()==id) 
			{
				patjpa.deleteById(id);
				pat.remove(patient);
				deletedpat=patient;
				break;
			}
		}
		return deletedpat;
    }
	@PutMapping("/patupdate")
	public Patients getup(@RequestBody Patients pat)
	{
		Patients ext=patjpa.findById(pat.getPatient_ID());
		if(!(pat.getPat_Name().equals(null)))
			ext.setPat_Name(pat.getPat_Name());
		if(!(pat.getPat_Age().equals(null)))
			ext.setPat_Age(pat.getPat_Age());
		if(!(pat.getPat_Phone().equals(null)))
			ext.setPat_Phone(pat.getPat_Phone());
		if(!(pat.getPat_Symptoms().equals(null)))
			ext.setPat_Symptoms(pat.getPat_Symptoms());
		return patjpa.save(ext);
		
	}
	@PostMapping("add")
	public Patients create(@RequestBody Patients user) {
		patjpa.save(user);
		System.out.println();
		return user;
	}
//	@GetMapping("/doc/{doc_id}")
//	public String getName(@PathVariable int doc_id)
//	{
//		String name=patjpa.getdoc(doc_id);
//		return name;
//	}

}

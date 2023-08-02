package com.springboot.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


import com.springboot.dao.PatientDAO;
import com.springboot.domain.Patient;
import com.springboot.service.PatientService;

//Fill the code
@RestController
public class PatientController {
    //Fill the code
	@Autowired
	PatientService service;
	
	@RequestMapping(value="/patient/list", method=RequestMethod.GET)
	public List<Patient> listPatients(){
		//Fill the code
		return service.getPatients();
	}

	//Fill the code
	@RequestMapping(value="/patient/create", method=RequestMethod.POST)
	public List<Patient> createPatient(@RequestBody Patient patient){
		//Fill the code
		return service.createPatient(patient);
	}
	
}

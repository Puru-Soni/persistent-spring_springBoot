package com.springboot.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springboot.dao.PatientDAO;
import com.springboot.dao.PatientDAOImpl;
import com.springboot.domain.Patient;



//Fill the code
@Service
public class PatientServiceImpl implements PatientService{

   //Fill the code
	@Autowired
	PatientDAO dao;
	
public List<Patient> createPatient(Patient p){
    	//Fill the code
		return dao.createPatient(p);
	}
	
	public List<Patient> getPatients(){
		//Fill the code
		return dao.getPatients();
	}
    
}
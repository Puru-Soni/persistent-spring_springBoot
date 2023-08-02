package com.springboot.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springboot.dao.DoctorDAO;
import com.springboot.dao.DoctorDAOImpl;
import com.springboot.domain.Doctor;



//Fill your code here
@Service
public class DoctorServiceImpl implements DoctorService{

   //Fill your code here
	@Autowired
	DoctorDAO dao;
    
    public Boolean save(Doctor doctor) 
	{
		//Fill your code here
    	return dao.save(doctor);
	}

	public List<Doctor> list() 
	{
		//Fill your code here
		return dao.list();
	}
    
}
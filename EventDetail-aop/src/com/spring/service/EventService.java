package com.spring.service;

import com.spring.entity.*;
import com.spring.dao.EventDAO;
import java.sql.ResultSet;
import java.sql.Types;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

//Fill your code here
@Service
public class EventService {
    
        //Fill your code here
	@Autowired
	EventDAO dao;
	
	public List<Event> getAllEvents(){
		//fill your code
        return dao.getAllEvents();
		 
    }
    
	public void createEvent(int id,String eventName,String organiser,String organiserNumber,String hallName, String location) {
	  
	    //Fill your code here
        dao.createEvent(id, eventName, organiser, organiserNumber, hallName, location);

	}           
}
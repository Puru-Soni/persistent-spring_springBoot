package com.spring.service;

import com.spring.entity.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.ResultSetExtractor;

//Fill your code here
@Service
public class OwnerService {

	// Fill your code here
	@Autowired
	OwnerDAO dao;

	public List<Owner> getAllOwners() {
		// Fill your code here
		return dao.getAllOwners();
	}

	public String getOwnerNumberByName(String name) {
		// Fill your code here
		return dao.getOwnerNumberByName(name);
	}

}

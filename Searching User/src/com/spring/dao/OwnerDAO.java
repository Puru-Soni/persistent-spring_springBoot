package com.spring.dao;

import com.spring.entity.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.ResultSetExtractor;
//Fill your code here
@Repository
public class OwnerDAO {
    
	//Fill your code here
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Owner> getAllOwners(){
		//Fill your code here
		String sql = "SELECT * FROM  owner";
		rowM m = new rowM();
		return (List<Owner>)jdbcTemplate.query(sql, m);
	}
	
	public String getOwnerNumberByName(String name){  
		//Fill your code here
		for(Owner o : this.getAllOwners()){
			if(o.getName().equals(name)){
				return "You can contact " +name+ " by "  + o.getMobileNumber();
			}
		}
		return "No such owner!";
	}
}

class rowM implements RowMapper<Owner> {
	public Owner mapRow(ResultSet rs, int rowNum) throws SQLException{
		Owner ow = new Owner();
		ow.setId(rs.getInt(1));
		ow.setName(rs.getString(2));
		ow.setPassword(rs.getString(3));
		ow.setEmailId(rs.getString(4));
		ow.setMobileNumber(rs.getString(5));
		return ow;
	}
}
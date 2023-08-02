package com.spring.dao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import com.spring.entity.Event;
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
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//Fill your code here
@Repository
public class EventDAO {

    //Fill your code here
	@Autowired
    JdbcTemplate jdbcTemplate;

	public List<Event> getAllEvents(){
		//fill your code
		String sql = "select * from event";
		myRowMapper r = new myRowMapper();
		return  jdbcTemplate.query(sql, r);
    }
    
	public void createEvent(int id,String eventName,String organiser,String organiserNumber,String hallName, String location) {
		//Fill your code here
		String sql = "insert into event values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, id, eventName, organiser, organiserNumber, hallName, location);
	}           
}

class myRowMapper implements RowMapper<Event>{
	
	public Event mapRow(ResultSet rs , int rowNum) throws SQLException {
		Event e = new Event();
		e.setId(rs.getInt(1));
		e.setEventName(rs.getString(2));
		e.setOrganiser(rs.getString(3));
		e.setOrganiserNumber(rs.getString(4));
		e.setHallName(rs.getString(5));
		e.setLocation(rs.getString(6));
		return e;
	}
}

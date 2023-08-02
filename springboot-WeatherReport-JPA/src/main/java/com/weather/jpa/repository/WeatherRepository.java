package com.weather.jpa.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.weather.jpa.domain.WeatherReport;
import org.springframework.data.repository.CrudRepository;

//Fill your code here
@Repository
public interface WeatherRepository extends CrudRepository<WeatherReport, Long>{
	
}
package ua.service;

import java.util.List;

import ua.entity.City;

public interface CityService {
	
	void save(String name);
	
	City findByName(String name);
	
	void delete(String name);
	
	List<City> findAll();
	
	void deleteById(int id);

}

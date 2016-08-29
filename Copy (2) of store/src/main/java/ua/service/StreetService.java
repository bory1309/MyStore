package ua.service;

import java.util.List;

import ua.entity.Street;

public interface StreetService {
	
	void save(String name);
	
	void delete(String name);
	
	Street findByName(String name);
	
	List<Street> findAll();
	
	void deleteById(int id);

}

package ua.service;

import java.util.List;

import ua.entity.LastName;

public interface LastNameService {
	
	void save(String name);
	
	void delete (String name);
	
	LastName findByName(String name);
	
	List<LastName> findAll();
	
	void deleteById(int id);
	

}

package ua.service;

import java.util.List;


import ua.entity.FirstName;

public interface FirstNameService {
	
	void save(String name);
	
	void delete(String name);
	
	FirstName findByName(String name);
	
	List<FirstName> findAll();
	
	void deleteById(int id);
	

}

package ua.service;

import java.util.List;

import ua.entity.Color;

public interface ColorService {
	
	void save (String name);
	
	void delete (String name);
	
	void deleteById(int id);
	
	Color findByName(String name);
	
	List<Color> findAll();

}

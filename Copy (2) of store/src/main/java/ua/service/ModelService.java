package ua.service;

import java.util.List;

import ua.entity.Model;

public interface ModelService {
	
	void save (String name);
	
	void delete (String name);
	
	void deleteById(int id);
	
	Model findByName(String name);
	
	List<Model> findAll();

}

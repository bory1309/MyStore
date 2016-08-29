package ua.service;

import java.util.List;

import ua.entity.Brand;



public interface BrandService {
	
	void save (String name);
	
	void delete (String name);
	
	List<Brand>findAll();
	
	Brand findBYName(String name);
	
	void deleteById(int id);

}

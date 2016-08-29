package ua.service;

import java.util.List;

import ua.entity.Model;
import ua.entity.Shoes;


public interface ShoesService {
	
	void save(int modelId, int size, int colorId, int seasonId, int brandId, int price);
	
	void delete();
	
	void deleteById(int id);
	
	Shoes findByModel(Model model);
	
	List<Shoes> findAll();

}

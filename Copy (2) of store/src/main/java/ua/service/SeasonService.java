package ua.service;

import java.util.List;

import ua.entity.Season;

public interface SeasonService {
	
	void save(String name);
	
	void delete (String name);
	
	void deleteById(int id);
	
	Season findByName(String name);
	
	List<Season> findAll();

}

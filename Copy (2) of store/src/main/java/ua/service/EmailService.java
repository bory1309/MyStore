package ua.service;

import java.util.List;

import ua.entity.Email;


public interface EmailService {
	
	void save(String name);
	
	Email findByName(String name);
	
	void delete(String name);
	
	List<Email> findAll();
	
	void deleteById(int id);

}
